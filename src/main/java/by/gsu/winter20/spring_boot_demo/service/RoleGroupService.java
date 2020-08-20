package by.gsu.winter20.spring_boot_demo.service;

import by.gsu.winter20.spring_boot_demo.entity.Role;
import by.gsu.winter20.spring_boot_demo.entity.RoleGroup;
import by.gsu.winter20.spring_boot_demo.repository.RoleGroupRepository;
import by.gsu.winter20.spring_boot_demo.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class RoleGroupService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private final RoleGroupRepository roleGroupRepository;
    private final RoleRepository roleRepository;

    public void saveWithAllRolesInDb(RoleGroup roleGroup) {
        logger.info("saving new role group");
        List<Role> roleList = roleRepository.findAll();
        roleGroup.setRoles(roleList);

        roleList.forEach(role -> role.setRoleGroup(roleGroup));
        roleGroupRepository.save(roleGroup);
    }

    public List<RoleGroup> findAll() {
        List<RoleGroup> all = roleGroupRepository.findAll();
        all.forEach(rg -> System.out.println(rg.getName() + " " + rg.getRoles()));
        return all;
    }
}
