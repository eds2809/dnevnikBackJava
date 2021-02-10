package ru.eds2809.dnevnik.service;

import org.springframework.stereotype.Service;
import ru.eds2809.dnevnik.models.ClassRoom;
import ru.eds2809.dnevnik.models.User;
import ru.eds2809.dnevnik.repositories.ClassRoomRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ClassRoomServiceImpl implements ClassRoomService {

    private final ClassRoomRepository classRoomRepository;

    public ClassRoomServiceImpl(ClassRoomRepository classRoomRepository) {
        this.classRoomRepository = classRoomRepository;
    }

    @Override
    public void addClassRoom(String name, User classroomSupervisor) {
        ClassRoom classRoom = new ClassRoom(name, classroomSupervisor);
        classRoomRepository.save(classRoom);
    }

    @Override
    public Optional<ClassRoom> getClassRoomById(Long classroomId) {
        return classRoomRepository.findById(classroomId);
    }

    @Override
    public List<ClassRoom> findAll() {
        return (List<ClassRoom>) classRoomRepository.findAll();
    }
}
