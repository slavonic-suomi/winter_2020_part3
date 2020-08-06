package by.gsu.winter20.spring_boot_demo.repository;

import by.gsu.winter20.spring_boot_demo.entity.Role;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

@RestResource
public interface RoleRepository extends CrudRepository<Role, Integer> {
}
