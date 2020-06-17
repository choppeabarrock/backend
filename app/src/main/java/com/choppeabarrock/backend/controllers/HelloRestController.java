package com.choppeabarrock.backend.controllers;

import com.choppeabarrock.backend.dto.Hello_DTO;
import com.choppeabarrock.backend.services.HelloServiceInterf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//@RequestMapping("/hello")

//import org.apache.logging.log4j.Logger;
//import org.apache.logging.log4j.LogManager;
////import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
@RequestMapping("/helloworld")
public class HelloRestController {

//    Logger logger = LoggerFactory.getLogger(LoggingController.class);
//    private static final Logger logger = LoggerFactory.getLogger(HelloRestController.class);

    private static final Logger logger = LoggerFactory.getLogger(HelloRestController.class);

    @Autowired
    @Qualifier("HelloService_1")
    HelloServiceInterf helloService;

    @Autowired
    @Qualifier("HelloService_ReqScope")
    HelloServiceInterf helloReqScopeService;

    @GetMapping
    public List<Hello_DTO> printHello() {

        // 401

        logger.trace("This is a TRACE message.");
        logger.debug("This is a DEBUG message.");
        //
        logger.info("This is an INFO message.");
        logger.warn("This is a WARN message.");
        logger.error("You guessed it, an ERROR message.");
        logger.info("Simple log statement with inputs {}, {} and {}", 1,2,3);

        List<Hello_DTO> response = helloService.doHello();

        // response.addAll(helloReqScopeService.doHello());


        return response;

    }

}
