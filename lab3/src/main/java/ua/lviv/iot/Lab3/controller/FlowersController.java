package ua.lviv.iot.Lab3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab3.model.Flower;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

@RequestMapping("/flowers")
@RestController
public class FlowersController {

    private static Map<Integer, Flower> flowers = new HashMap<>();

    private static AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<Flower> getFlowers(){
        return new LinkedList<Flower>(flowers.values());
    }

    @GetMapping(path = "/{id}")
    public Flower getFlower(final @PathVariable("id") Integer flowerId){
        return flowers.get(flowerId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public Flower createFlower(final @RequestBody Flower flower){
        flower.setId(idCounter.incrementAndGet());
        flowers.put(flower.getId(), flower);
        return flower;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Object> deleteFlower(final @PathVariable("id") Integer flowerId){
        HttpStatus status = flowers.remove(flowerId) == null? HttpStatus.NOT_FOUND : HttpStatus.OK;
        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public Flower updateFlower(final @PathVariable("id") Integer flowerId, final @RequestBody Flower flower){
        flower.setId(flowerId);
        return flowers.put(flowerId, flower);
    }
}
