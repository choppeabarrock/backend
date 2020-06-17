package com.choppeabarrock.backend.services;

import com.choppeabarrock.backend.dto.Hello_DTO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@Qualifier("HelloService_2")
public class HelloService_2 implements HelloServiceInterf {

	@Override
	public List<Hello_DTO> doHello() {

		return Arrays.asList(new Hello_DTO("hello from service #2"));

	}

}
