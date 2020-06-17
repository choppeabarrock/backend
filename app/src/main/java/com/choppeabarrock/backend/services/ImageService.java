package com.choppeabarrock.backend.services;

import com.choppeabarrock.backend.model.Category;
import com.choppeabarrock.backend.model.Image;
import com.choppeabarrock.backend.repositories.DefaultRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ImageService extends DefaultService<Image> {

	public ImageService(DefaultRepository<Image> repo) {
		super(repo);
	}

}
