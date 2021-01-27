package ru.eds2809.dnevnik.models;


import javax.persistence.*;
import java.util.List;

@Entity
public class Pupil extends User {

    @OneToOne
    private ClassRoom classRoom;

    @OneToMany
    private List<Subject> subjects;

    public Pupil(String name, String login, String password, ClassRoom classRoom) {
        super(name, login, password);
        this.classRoom = classRoom;
    }

    public Pupil() {

    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }
}
