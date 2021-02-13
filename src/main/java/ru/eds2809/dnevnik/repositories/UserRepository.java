package ru.eds2809.dnevnik.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.eds2809.dnevnik.models.User;
import ru.eds2809.dnevnik.models.UserRole;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    Optional<User> findUserByLoginAndPassword(String login, String password);

    List<User> findAllByRole(UserRole userRole);
}
