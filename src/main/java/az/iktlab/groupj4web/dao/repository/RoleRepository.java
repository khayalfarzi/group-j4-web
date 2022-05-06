package az.iktlab.groupj4web.dao.repository;

import az.iktlab.groupj4web.dao.entity.Role;
import az.iktlab.groupj4web.model.ERole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}