package by.gsu.winter20.spring_boot_demo.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "role_group")
@RequiredArgsConstructor
@AllArgsConstructor
@ToString(exclude = "roles")
@EqualsAndHashCode(exclude = "roles")
public class RoleGroup implements IEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "roleGroup", cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    private List<Role> roles;
}
