package ua.lviv.iot.Lab3.business;


import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public abstract class AbstractService<T> {

    protected abstract JpaRepository<T,Integer> getRepository();

    public List findAll(){
        return getRepository().findAll();
    }

    public T findById(Integer id){
        return  getRepository().findById(id).get();
    }

    public T create(T t){
        return  getRepository().save(t);
    }

    public void deleteById(Integer id){
        getRepository().deleteById(id);
    }

}

