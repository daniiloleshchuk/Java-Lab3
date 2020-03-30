package ua.lviv.iot.Lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab3.business.FlowerService;
import ua.lviv.iot.Lab3.model.Flower;
import ua.lviv.iot.Lab3.model.Product;

import java.util.List;

@RequestMapping("/flowers")
@RestController
public class FlowerController {

    @Autowired
    private FlowerService flowerService;

    @GetMapping
    public final List getFlowers() {
        return flowerService.getFlowers();
    }

    @GetMapping(path = "/{id}")
    public final Flower getFlowerById(final @PathVariable("id") Integer flowerId) {
        return flowerService.getFlowerById(flowerId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final Product createFlower(final @RequestBody Flower flower) {
        return flowerService.createFlower(flower);
    }

    @DeleteMapping(path = "/{id}")
    public final void deleteFlowerById(final @PathVariable("id") Integer flowerId) {
        flowerService.deleteFlowerById(flowerId);
    }

    @PutMapping(path = "/{id}")
    public final ResponseEntity<Object> updateFlowerById(final @PathVariable("id") Integer flowerId,
                                                         final @RequestBody Flower newFlower) {

        Flower flowerBeforeUpdate = flowerService.getFlowerById(flowerId);
        if (flowerBeforeUpdate == null) {
            return ResponseEntity.notFound().build();
        }

        flowerService.updateFlowerById(flowerId, newFlower);
        return ResponseEntity.ok(flowerBeforeUpdate);
    }

}
