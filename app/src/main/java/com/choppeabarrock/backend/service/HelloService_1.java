package com.choppeabarrock.backend.service;

import com.choppeabarrock.backend.dto.Hello_DTO;
//import com.choppeabarrock.backend.entities.DefaultEntity;
import com.choppeabarrock.backend.repositories.DefaultRepository;
import com.choppeabarrock.backend.services.HelloServiceInterf;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Primary
@Qualifier("HelloService_1")
public class HelloService_1 implements HelloServiceInterf {

	@Override
	public List<Hello_DTO> doHello() {

		return Arrays.asList(new Hello_DTO("hello from service #1"));

	}

}
