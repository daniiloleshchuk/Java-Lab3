package ua.lviv.iot.Lab3.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Lab3.dataaccess.FlowerTypeRepository;
import ua.lviv.iot.Lab3.model.FlowerType;

@Service
public class FlowerTypeService extends AbstractService<FlowerType> {

    @Autowired
    private FlowerTypeRepository flowerTypeRepository;

    @Override
    protected final JpaRepository<FlowerType, Integer> getRepository() {
        return flowerTypeRepository;
    }

}
