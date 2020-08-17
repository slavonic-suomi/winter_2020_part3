package by.gsu.winter20.spring_boot_demo.repository;

import by.gsu.winter20.spring_boot_demo.entity.Role;
import by.gsu.winter20.spring_boot_demo.entity.RoleGroup;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class RoleGroupRepository implements IRepository<RoleGroup> {

    private final EntityManager em;

    @Override
    public void save(RoleGroup element) {
        em.persist(element);
    }

    @Override
    public RoleGroup findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public void update(RoleGroup element) {

    }

    @Override
    public List<RoleGroup> findAll() {
        TypedQuery<RoleGroup> query = em.createQuery("select r from RoleGroup r inner join fetch  r.roles", RoleGroup.class);
        return query.getResultList();
    }
}
