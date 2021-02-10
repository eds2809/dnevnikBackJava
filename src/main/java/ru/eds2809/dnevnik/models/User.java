package ru.eds2809.dnevnik.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(unique = true)
    private String login;
    @JsonIgnore
    private String password;
    @Enumerated(EnumType.STRING)
    private UserRole role;

    @OneToOne
    private ClassRoom classRoom;

    @ManyToMany
    @BatchSize(size = 1000)
    private List<Subject> subjects = new ArrayList<>(0);

    @ManyToMany
    @BatchSize(size = 1000)
    List<ClassRoom> classRooms;

    public User() {
    }

    public User(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }
}
