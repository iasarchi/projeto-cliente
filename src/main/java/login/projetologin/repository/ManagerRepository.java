package login.projetologin.repository;

import login.projetologin.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ManagerRepository extends JpaRepository<Manager, Integer> {
    @Query("SELECT e FROM Manager e JOIN FETCH e.roles WHERE e.username= (:username)")
    public Manager findByUsername(@Param("username") String username);
}
