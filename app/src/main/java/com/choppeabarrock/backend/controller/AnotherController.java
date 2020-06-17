package com.choppeabarrock.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class AnotherController {

    @ResponseBody
    @GetMapping(path = "/another")
    public String home() {


        log.trace("This is TRACE");
        log.debug("This is DEBUG");
        log.info("This is INFO");
        log.warn("This is WARN");
        log.error("This is ERROR");

        return "Hi, show loggings in the console or file!";
    }

}
