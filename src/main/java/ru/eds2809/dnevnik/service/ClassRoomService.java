package ru.eds2809.dnevnik.service;

import ru.eds2809.dnevnik.models.ClassRoom;
import ru.eds2809.dnevnik.models.Teacher;

import java.util.List;
import java.util.Optional;

public interface ClassRoomService {
    void addClassRoom(String name, Teacher classroomSupervisor);

    Optional<ClassRoom> getClassRoomById(Long classroomId);

    List<ClassRoom> findAll();
}
