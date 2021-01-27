package ru.eds2809.dnevnik.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.eds2809.dnevnik.models.Pupil;

@Repository
public interface PupilRepository extends CrudRepository<Pupil, Long> {
}
