package ru.eds2809.dnevnik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.eds2809.dnevnik.models.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long> {
}
