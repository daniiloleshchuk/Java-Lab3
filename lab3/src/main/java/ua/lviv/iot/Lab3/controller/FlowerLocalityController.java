package ua.lviv.iot.Lab3.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab3.business.AbstractService;
import ua.lviv.iot.Lab3.business.FlowerLocalityService;

@RequestMapping("/flowerLocalities")
@RestController
public class FlowerLocalityController extends AbstractController {

    @Autowired
    private FlowerLocalityService flowerLocalityService;

    @Override
    public final AbstractService getService() {
        return flowerLocalityService;
    }
}
