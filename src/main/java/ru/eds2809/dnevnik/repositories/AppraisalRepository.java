package ru.eds2809.dnevnik.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.eds2809.dnevnik.models.Appraisal;

import java.util.List;

@Repository
public interface AppraisalRepository extends CrudRepository<Appraisal, Long> {
    List<Appraisal> findAllByPupilId(Long pupilId);

    @Modifying
    @Query("delete from Appraisal a where a.id = ?1")
    @Override
    void deleteById(Long id);
}
