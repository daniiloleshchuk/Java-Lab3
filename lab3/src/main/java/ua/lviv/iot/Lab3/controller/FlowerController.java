package ua.lviv.iot.Lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab3.dataaccess.FlowerRepository;
import ua.lviv.iot.Lab3.model.Flower;
import ua.lviv.iot.Lab3.model.Product;

import java.util.List;


@RequestMapping("/flowers")
@RestController
public class FlowerController {

    @Autowired
    private FlowerRepository flowerRepository;

    @GetMapping
    public final List getFlowers() {
        return flowerRepository.findAll();
    }

    @GetMapping(path = "/{id}")
    public final Flower getFlowerById(final @PathVariable("id") Integer flowerId) {
        return flowerRepository.findById(flowerId).get();
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Product createFlower(final @RequestBody Flower flower) {
        return flowerRepository.save(flower);
    }


    @DeleteMapping(path = "/{id}")
    public final void deleteFlowerById(final @PathVariable("id") Integer flowerId) {
        flowerRepository.deleteById(flowerId);
    }

    @PutMapping(path = "/{id}")
    public final Flower updateFlowerById(final @PathVariable("id") Integer flowerId,
                                         final @RequestBody Flower newFlower) {
        /*
        return flowerRepository.findById(flowerId).map(product -> {
            product.setColor(newFlower.getColor());
            product.setHeightInSm(newFlower.getHeightInSm());
            product.setPriceInUAH(newFlower.getPriceInUAH());
            product.setTypeOfProduct(newFlower.getTypeOfProduct());
            return flowerRepository.save(newFlower);
        }).get();

         */
        Flower flower = flowerRepository.findById(flowerId).orElseThrow(NullPointerException::new);
        flower.setColor(newFlower.getColor());
        flower.setHeightInSm(newFlower.getHeightInSm());
        flower.setPriceInUAH(newFlower.getPriceInUAH());
        flower.setTypeOfProduct(newFlower.getTypeOfProduct());
        flower.setTypeOfFlower(newFlower.getTypeOfFlower());
        flower.setHowMuchDaysCanLive(newFlower.getHowMuchDaysCanLive());
        return flowerRepository.save(flower);
    }

}
