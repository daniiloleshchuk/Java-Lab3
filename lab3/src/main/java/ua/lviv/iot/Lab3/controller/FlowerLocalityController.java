package ua.lviv.iot.Lab3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab3.business.FlowerLocalityService;
import ua.lviv.iot.Lab3.model.FlowerLocality;

import java.util.List;

@RequestMapping("/flowerLocalities")
@RestController
public class FlowerLocalityController {

    @Autowired
    private FlowerLocalityService flowerLocalityService;

    @GetMapping
    public final List<FlowerLocality> findAll() {
        return flowerLocalityService.findAll();
    }

    @GetMapping("/{id}")
    public final FlowerLocality findById(final @PathVariable Integer id) {
        return flowerLocalityService.findById(id);
    }

    @PostMapping
    public final FlowerLocality createFlowerLocality(final @RequestBody FlowerLocality flowerLocality) {
        return flowerLocalityService.create(flowerLocality);
    }

    @DeleteMapping("/{id}")
    public final void deleteById(final @PathVariable Integer id) {
        flowerLocalityService.deleteById(id);
    }

}
