package ru.eds2809.dnevnik.controllerAdvice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.eds2809.dnevnik.controllers.PupilRestController;
import ru.eds2809.dnevnik.exeptions.NotFoundPupilExeption;

@ControllerAdvice(assignableTypes = PupilRestController.class)
public class PupilAdviceController {
    @ExceptionHandler
    public ResponseEntity<String> fileNotFoundExceptionHandler(NotFoundPupilExeption e) {
        return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
    }
}
