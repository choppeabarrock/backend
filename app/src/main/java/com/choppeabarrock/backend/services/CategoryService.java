package com.choppeabarrock.backend.services;

import com.choppeabarrock.backend.repositories.DefaultRepository;
import org.springframework.stereotype.Service;

import com.choppeabarrock.backend.model.Category;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CategoryService extends DefaultService<Category> {

	public CategoryService(DefaultRepository<Category> repo) {
		super(repo);
	}

}
