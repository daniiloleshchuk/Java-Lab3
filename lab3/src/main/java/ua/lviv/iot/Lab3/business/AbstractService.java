package ua.lviv.iot.Lab3.business;


import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public abstract class AbstractService<T> {

    protected abstract JpaRepository<T, Integer> getRepository();

    public final List findAll() {
        return getRepository().findAll();
    }

    public final T findById(Integer id) {
        return getRepository().findById(id).get();
    }

    public final T create(final T t) {
        return getRepository().save(t);
    }

    public final void deleteById(final Integer id) {
        getRepository().deleteById(id);
    }

}

