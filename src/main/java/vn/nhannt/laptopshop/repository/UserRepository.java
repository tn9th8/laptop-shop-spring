package vn.nhannt.laptopshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import vn.nhannt.laptopshop.domain.User;
import java.util.List;

// Spring data (Hibernate/JPA)
// Repository pattern
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // self-defined example methods
    List<User> findByEmail(String email);

    User findFirstByEmail(String email);
}
