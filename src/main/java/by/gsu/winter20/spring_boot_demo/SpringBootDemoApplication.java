package by.gsu.winter20.spring_boot_demo;

import by.gsu.winter20.spring_boot_demo.entity.Role;
import by.gsu.winter20.spring_boot_demo.entity.RoleGroup;
import by.gsu.winter20.spring_boot_demo.repository.RoleGroupRepository;
import by.gsu.winter20.spring_boot_demo.repository.RoleRepository;
import by.gsu.winter20.spring_boot_demo.service.RoleGroupService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);

		RoleGroupService service = context.getBean(RoleGroupService.class);

//		RoleGroup group = new RoleGroup(null, "primary group 2", null);
//		service.saveWithAllRolesInDb(group);
//
//		System.out.println(group);
		List<RoleGroup> groups = service.findAll();
		System.out.println(groups);

		groups.forEach(rg -> System.out.println(rg.getName() + " " + rg.getRoles()));
	}

}
