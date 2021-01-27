package ru.eds2809.dnevnik.models;


import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.List;

@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToOne
    private Teacher classroomSupervisor;
    @OneToMany
    @BatchSize(size = 100)
    private List<Pupil> pupils;

    public ClassRoom() {

    }

    public ClassRoom(String name, Teacher classroomSupervisor) {
        this.name = name;
        this.classroomSupervisor = classroomSupervisor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pupil> getPupils() {
        return pupils;
    }

    public void setPupils(List<Pupil> pupils) {
        this.pupils = pupils;
    }

    public Teacher getClassroomSupervisor() {
        return classroomSupervisor;
    }

    public void setClassroomSupervisor(Teacher classroomSupervisor) {
        this.classroomSupervisor = classroomSupervisor;
    }
}
