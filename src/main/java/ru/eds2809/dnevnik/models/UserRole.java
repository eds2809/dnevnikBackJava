package ru.eds2809.dnevnik.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public enum UserRole {
    PUPIL_ROLE, TEACHER_ROLE, ADMIN_ROLE
}
