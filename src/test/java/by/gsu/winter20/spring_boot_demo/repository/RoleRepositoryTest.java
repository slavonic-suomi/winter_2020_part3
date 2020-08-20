package by.gsu.winter20.spring_boot_demo.repository;

import by.gsu.winter20.spring_boot_demo.context.TestInitializer;
import by.gsu.winter20.spring_boot_demo.entity.Role;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(initializers = {TestInitializer.class})
class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    void save() {
        Role role = new Role(null, "ADMIN", null);

        roleRepository.save(role);

        assertNotNull(role.getId());
    }

    @Test
    void findById() {
//        Role roleInDb = roleRepository.findById(1); //don't do that
//
//        assertNotNull(roleInDb);
//        assertEquals(1, roleInDb.getId());
//        assertEquals("ADMIN", roleInDb.getName());
    }


    @Test
    void  testFindByName() {
        Role role = new Role(null, "ROLE_FOR_FIND1", null);

        roleRepository.save(role);

        assertNotNull(role.getId());

        Role roleInDb = roleRepository.findByName("ROLE_FOR_FIND1");

        assertNotNull(roleInDb);
    }

    @Test
    void delete() {
    }

    @Test
    void update() {
    }

    @Test
    void findAll() {
    }
}