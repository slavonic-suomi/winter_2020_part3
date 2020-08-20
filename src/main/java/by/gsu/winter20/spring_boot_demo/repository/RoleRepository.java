package by.gsu.winter20.spring_boot_demo.repository;

import by.gsu.winter20.spring_boot_demo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

//@NoRepositoryBean
public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);

    List<Role> findAllByNameStartingWithOrderByIdDesc(String prefix);
}
