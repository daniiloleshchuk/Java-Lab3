package ua.lviv.iot.Lab3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.Lab3.business.AbstractService;

public abstract class AbstractController<T> {

    protected abstract AbstractService<T> getService();

    @GetMapping
    public final ResponseEntity findAll() {
        if (getService().findAll() != null) {
            return new ResponseEntity<>(getService().findAll(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping(path = "/{id}")
    public final ResponseEntity findById(final @PathVariable("id") Integer flowerId) {
        if (getService() != null) {
            return new ResponseEntity<>(getService().findById(flowerId), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public final ResponseEntity create(final @RequestBody T t) {
        if (t != null) {
            return new ResponseEntity<>(getService().create(t), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{id}")
    public final ResponseEntity deleteById(final @PathVariable("id") Integer flowerId) {
        if (getService().deleteById(flowerId)) {
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping(path = "/{id}")
    public final ResponseEntity updateById(final @PathVariable("id") Integer flowerId,
                                           final @RequestBody T t) {
        T tBeforeUpdate = getService().findById(flowerId);
        if (tBeforeUpdate == null) {
            return ResponseEntity.notFound().build();
        }
        getService().update(t, flowerId);
        return ResponseEntity.ok(t);
    }

}
