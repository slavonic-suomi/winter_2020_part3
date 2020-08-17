package by.gsu.winter20.spring_boot_demo.repository;

import by.gsu.winter20.spring_boot_demo.entity.IEntity;

import java.util.List;

public interface IRepository<E extends IEntity> {
    void save(E element);

    E findById(Integer id);

    void delete(Integer id);

    void update(E element);

    List<E> findAll();
}
