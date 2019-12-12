package com.choppeabarrock.backend.controllers;

import com.choppeabarrock.backend.services.DefaultService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.choppeabarrock.backend.entities.Category;

@RestController
@RequestMapping("/api/v1/categories")
public class CategoryController extends DefaultController<Category> {

	public CategoryController(DefaultService<Category> service) {
		super(service);
	}

}
