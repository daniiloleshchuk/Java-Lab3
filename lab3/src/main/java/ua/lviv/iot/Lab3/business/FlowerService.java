package ua.lviv.iot.Lab3.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Lab3.dataaccess.FlowerRepository;
import ua.lviv.iot.Lab3.model.Flower;

@Service
public class FlowerService {

    @Autowired
    private FlowerRepository flowerRepository;

    public Flower createFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

}
