package ru.eds2809.dnevnik.controllers;


import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import ru.eds2809.dnevnik.exeptions.NotFoundUserExeption;
import ru.eds2809.dnevnik.models.User;
import ru.eds2809.dnevnik.models.UserRole;
import ru.eds2809.dnevnik.repositories.UserRepository;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("user")
public class UserRestController {

    private final UserRepository userRepository;

    public UserRestController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/{id}")
    public User getPupilById(@PathVariable Long id) throws Throwable {
        return userRepository.findById(id)
                .orElseThrow(() -> new NotFoundUserExeption("Пользователь по данному id не найден"));
    }

    @PostMapping("/auth")
    public User auth(@RequestParam String login, @RequestParam String password) throws NotFoundUserExeption {
        log.info("Запрос на авторизацию прользователя {}", login);
        return userRepository.findUserByLoginAndPassword(login, password)
                .orElseThrow(() -> new NotFoundUserExeption("Пользователь с указаным логином и/или паролем не найден"));
    }

    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userRepository.findAllByRole(UserRole.PUPIL_ROLE);
    }
}
