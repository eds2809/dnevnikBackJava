package ru.eds2809.dnevnik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.eds2809.dnevnik.models.ClassRoom;

@Repository
public interface ClassRoomRepository extends CrudRepository<ClassRoom, Long> {

}
