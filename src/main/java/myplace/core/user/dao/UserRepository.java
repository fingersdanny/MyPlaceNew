package myplace.core.user.dao;

import myplace.core.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findDistinctUserByEmailAndName(String email, String name);

    User findDistinctUserByName(String name);
}
