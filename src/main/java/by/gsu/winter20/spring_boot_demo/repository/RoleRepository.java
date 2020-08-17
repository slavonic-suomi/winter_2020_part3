package by.gsu.winter20.spring_boot_demo.repository;

import by.gsu.winter20.spring_boot_demo.entity.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@RequiredArgsConstructor
@Transactional
public class RoleRepository implements IRepository<Role> {

    private final EntityManager em;

    @Override
    public void save(Role element) {
        em.persist(element);
    }

    @Override
    public Role findById(Integer id) {
        return em.find(Role.class, id);
    }

    @Override
    public void delete(Integer id) {
        Role roleRef = em.getReference(Role.class, id);
        em.remove(roleRef);
    }

    @Override
    public void update(Role element) {
        em.merge(element);
    }

    @Override
    public List<Role> findAll() {
        TypedQuery<Role> query = em.createQuery("select r from Role r", Role.class);
        return query.getResultList();
    }
}
