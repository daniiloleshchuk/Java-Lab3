package ua.lviv.iot.Lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab3.business.AbstractService;
import ua.lviv.iot.Lab3.business.FlowerService;
import ua.lviv.iot.Lab3.model.Flower;

@RequestMapping("/flowers")
@RestController
public class FlowerController extends AbstractController<Flower> {

    @Autowired
    private FlowerService flowerService;

    @Override
    public final AbstractService<Flower> getService() {
        return flowerService;
    }
}
