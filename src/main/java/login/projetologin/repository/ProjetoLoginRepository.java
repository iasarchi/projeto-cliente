package login.projetologin.repository;

import login.projetologin.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ProjetoLoginRepository extends JpaRepository<Usuario, UUID> {
}
