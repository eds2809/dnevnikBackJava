package ru.eds2809.dnevnik.exeptions;

public class NotFoundUserExeption extends Throwable {
    public NotFoundUserExeption(String message) {
        super(message);
    }
}
