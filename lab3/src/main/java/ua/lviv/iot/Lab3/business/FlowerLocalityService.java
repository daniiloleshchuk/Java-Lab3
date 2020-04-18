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

    @Override
    public final FlowerLocality update(final FlowerLocality flowerLocality, final Integer id) {
        if (flowerLocalityRepository.existsById(id)) {
            this.deleteById(id);
            flowerLocalityRepository.save(flowerLocality);
            return flowerLocality;
        } else {
            return null;
        }
    }

}
