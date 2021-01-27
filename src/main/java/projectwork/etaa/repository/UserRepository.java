package projectwork.etaa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projectwork.etaa.model.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
