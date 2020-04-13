package ua.lviv.iot.Lab3.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Lab3.dataaccess.FlowerLocalityRepository;
import ua.lviv.iot.Lab3.model.FlowerLocality;


@Service
public class FlowerLocalityService extends AbstractService<FlowerLocality> {

    @Autowired
    private FlowerLocalityRepository flowerLocalityRepository;

    @Override
    protected final JpaRepository<FlowerLocality, Integer> getRepository() {
        return flowerLocalityRepository;
    }

}
