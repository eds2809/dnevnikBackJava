package ru.eds2809.dnevnik.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.eds2809.dnevnik.exeptions.NotFoundPupilExeption;
import ru.eds2809.dnevnik.models.Pupil;
import ru.eds2809.dnevnik.repositories.ClassRoomRepository;
import ru.eds2809.dnevnik.repositories.PupilRepository;

@RestController
@RequestMapping("pupil")
public class PupilRestController {

    private final ClassRoomRepository classRoomRepository;
    private final PupilRepository pupilRepository;

    public PupilRestController(ClassRoomRepository classRoomRepository, PupilRepository pupilRepository) {
        this.classRoomRepository = classRoomRepository;
        this.pupilRepository = pupilRepository;
    }

    @GetMapping("/{id}")
    public Pupil getPupilById(@PathVariable Long id) throws Throwable {
        return pupilRepository.findById(id)
                .orElseThrow(() -> new NotFoundPupilExeption("Пользователь по данному id не найден"));
    }
}
