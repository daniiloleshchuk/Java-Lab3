package ua.lviv.iot.Lab3.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Lab3.dataaccess.FlowerRepository;
import ua.lviv.iot.Lab3.model.Flower;

@Service
public class FlowerService extends AbstractService<Flower> {

    @Autowired
    private FlowerRepository flowerRepository;

    @Override
    protected final JpaRepository<Flower, Integer> getRepository() {
        return flowerRepository;
    }

    @Override
    public Flower update(final Flower flower, final Integer id) {
        if (flowerRepository.existsById(id)) {
            flowerRepository.deleteById(id);
            flower.setId(id);
            flowerRepository.save(flower);
            return flower;
        } else {
            return null;
        }
    }

}
