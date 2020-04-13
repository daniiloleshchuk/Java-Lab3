package ua.lviv.iot.Lab3.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.lviv.iot.Lab3.dataaccess.FlowerRepository;
import ua.lviv.iot.Lab3.model.Flower;

import java.util.List;

@Service
public class FlowerService {

    @Autowired
    private FlowerRepository flowerRepository;

    public List getFlowers() {
        return flowerRepository.findAll();
    }

    public final Flower getFlowerById(Integer flowerId) {
        return flowerRepository.findById(flowerId).get();
    }

    public Flower createFlower(Flower flower) {
        return flowerRepository.save(flower);
    }

    public final void deleteFlowerById(Integer flowerId) {
        flowerRepository.deleteById(flowerId);
    }

    public final Flower updateFlowerById(Integer flowerId, Flower newFlower) {
        if (flowerRepository.existsById(flowerId)) {
            Flower flower = flowerRepository.findById(flowerId).orElseThrow(NullPointerException::new);
            flower.setColor(newFlower.getColor());
            flower.setHeightInSm(newFlower.getHeightInSm());
            flower.setPriceInUAH(newFlower.getPriceInUAH());
            flower.setHowMuchDaysCanLive(newFlower.getHowMuchDaysCanLive());
            flowerRepository.save(flower);
            return flower;
        } else {
            return null;
        }
    }
}
