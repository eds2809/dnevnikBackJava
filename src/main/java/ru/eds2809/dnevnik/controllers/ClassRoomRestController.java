package ru.eds2809.dnevnik.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.eds2809.dnevnik.models.ClassRoom;
import ru.eds2809.dnevnik.service.ClassRoomService;

@RestController
@RequestMapping("classroom")
public class ClassRoomRestController {

    private final ClassRoomService classRoomService;

    public ClassRoomRestController(ClassRoomService classRoomService) {
        this.classRoomService = classRoomService;
    }


    @GetMapping("/all")
    public Iterable<ClassRoom> getAllClassrooms() {
        return classRoomService.findAll();
    }
}
