package by.gsu.winter20.spring_boot_demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@Table(name = "role")
@RequiredArgsConstructor
@AllArgsConstructor
public class Role implements IEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "role_group_id")
    private RoleGroup roleGroup;
}
