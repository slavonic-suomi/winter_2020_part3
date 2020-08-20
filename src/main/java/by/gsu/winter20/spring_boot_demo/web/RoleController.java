package by.gsu.winter20.spring_boot_demo.web;

import by.gsu.winter20.spring_boot_demo.entity.Role;
import by.gsu.winter20.spring_boot_demo.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/role")
@RequiredArgsConstructor
public class RoleController {

    private final RoleRepository roleRepository;

    @GetMapping("/all")
    public List<Role> findAll() {
        return roleRepository.findAll();
    }

    @PostMapping("/") //localhost:8080/role/
//    @Secured("hasRole(ADMIN)")
    public void save(@RequestBody Role role) {
        roleRepository.save(role);
    }
}
