package ru.eds2809.dnevnik.models;


import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class ClassRoom {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    /*@OneToOne
    private User classroomSupervisor;
    @OneToMany
    @BatchSize(size = 100)
    private List<User> users;*/

    public ClassRoom() {

    }

    public ClassRoom(String name, User classroomSupervisor) {
        this.name = name;
        //this.classroomSupervisor = classroomSupervisor;
    }
}
