package login.projetologin.repository;

import login.projetologin.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjectLoginRepository extends JpaRepository<User, UUID> {
}
