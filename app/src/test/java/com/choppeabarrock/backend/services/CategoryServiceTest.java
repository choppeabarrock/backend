package com.choppeabarrock.backend.services;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import com.choppeabarrock.backend.entities.Category;
import com.choppeabarrock.backend.repositories.CategoryRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@TestInstance(Lifecycle.PER_CLASS)
public class CategoryServiceTest {

	CategoryService categoryService;

	CategoryRepository mockCategoryRepository;

	@BeforeAll
	public void before() {

		mockCategoryRepository = mock(CategoryRepository.class);
		categoryService = new CategoryService(mockCategoryRepository);

	}

	@Test
	public void findAll_withNElement_returnListNElement() {
		// Arrange
		List<Category> mockEntities = new ArrayList<>();
		when(mockCategoryRepository.findAll()).thenReturn(mockEntities);

		// Act
		List<Category> entities = categoryService.findAll();

		// Assert
		assertEquals(mockEntities.size(), entities.size(), "He did not returned elements");

	}

}
