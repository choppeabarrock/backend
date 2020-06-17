package com.choppeabarrock.backend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import com.choppeabarrock.backend.model.DefaultEntity;
import com.choppeabarrock.backend.services.DefaultService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
/*	generates
	public DefaultController(final DefaultService<T> service) {
		this.service = service;
	}
*/
public class DefaultController<T extends DefaultEntity> {

    private final DefaultService<T> service;

    @GetMapping
    public List<T> getAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public T getById(@PathVariable Long id) {
        return service.findById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public T create(@Valid @RequestBody T t) {

        return service.save(t);
    }

    @PutMapping("/{id}")
    public T update(@PathVariable Long id, @Valid @RequestBody T t) {
        return service.save(id, t);
    }

    @DeleteMapping("/{id}")
    public void detete(@PathVariable Long id) {
        service.delete(id);
    }

}
