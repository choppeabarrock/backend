package com.choppeabarrock.backend.controllers;

import com.choppeabarrock.backend.model.Product;
import com.choppeabarrock.backend.services.DefaultService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController extends DefaultController<Product> {

	public ProductController(DefaultService<Product> service) {
		super(service);
	}

}
