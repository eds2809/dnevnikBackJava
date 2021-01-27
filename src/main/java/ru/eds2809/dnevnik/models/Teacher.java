package ru.eds2809.dnevnik.models;


import org.hibernate.annotations.BatchSize;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
public class Teacher extends User {

    @ManyToMany
    @BatchSize(size = 100)
    List<ClassRoom> classRooms;
}
