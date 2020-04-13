package ua.lviv.iot.Lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab3.business.FlowerTypeService;
import ua.lviv.iot.Lab3.model.FlowerType;

import java.util.List;

@RequestMapping("/flowerTypes")
@RestController
public class FlowerTypeController {

    @Autowired
    private FlowerTypeService flowerTypeService;

    @GetMapping
    public final List<FlowerType> findAll() {
        return flowerTypeService.findAll();
    }

    @GetMapping(path = "/{id}")
    public final FlowerType findById(final @PathVariable("id") Integer flowerTypeId) {
        return flowerTypeService.findById(flowerTypeId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final FlowerType createFlowerType(final @RequestBody FlowerType flowerType) {
        return flowerTypeService.create(flowerType);
    }

    @DeleteMapping(path = "/{id}")
    public final void deleteById(final @PathVariable("id") Integer flowerTypeId) {
        flowerTypeService.deleteById(flowerTypeId);
    }
}
