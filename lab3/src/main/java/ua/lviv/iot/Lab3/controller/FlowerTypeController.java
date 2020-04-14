package ua.lviv.iot.Lab3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab3.business.AbstractService;
import ua.lviv.iot.Lab3.business.FlowerTypeService;
import ua.lviv.iot.Lab3.model.FlowerType;

@RequestMapping("/flowerTypes")
@RestController
public class FlowerTypeController extends AbstractController<FlowerType> {

    @Autowired
    private FlowerTypeService flowerTypeService;

    @Override
    public final AbstractService<FlowerType> getService() {
        return flowerTypeService;
    }
}
