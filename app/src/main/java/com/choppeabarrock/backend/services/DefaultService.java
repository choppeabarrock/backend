package com.choppeabarrock.backend.services;

import java.util.List;
import java.util.Optional;

import com.choppeabarrock.backend.repositories.DefaultRepository;
import org.springframework.stereotype.Service;

import com.choppeabarrock.backend.model.DefaultEntity;

import lombok.Data;

@Data
public class DefaultService<T extends DefaultEntity> {

	private final DefaultRepository<T> repo;

	public List<T> findAll() {
		return repo.findAll();
	}

	public Optional<T> findById(Long id) {
		return repo.findById(id);
	}

	public T save(T t) {
		return repo.save(t);
	}

	public T save(Long id, T t) {
		t.setId(id);
		return repo.save(t);
	}

	public void delete(Long id) {
		repo.deleteById(id);
	}

}
