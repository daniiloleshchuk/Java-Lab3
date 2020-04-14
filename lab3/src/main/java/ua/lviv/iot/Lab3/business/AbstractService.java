package ua.lviv.iot.Lab3.business;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public abstract class AbstractService<T> {

    protected abstract JpaRepository<T, Integer> getRepository();

    public abstract T update(final T t, final Integer id);

    public final List findAll() {
        return getRepository().findAll();
    }

    public final T findById(final Integer id) {
        return getRepository().findById(id).get();
    }

    public final T create(final T t) {
        return getRepository().save(t);
    }

    public final boolean deleteById(final Integer id) {
        if (getRepository().existsById(id)) {
            getRepository().deleteById(id);
            return true;
        } else {
            return false;
        }
    }

}

