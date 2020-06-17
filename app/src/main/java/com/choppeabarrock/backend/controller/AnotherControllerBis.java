package com.choppeabarrock.backend.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/home")
@Slf4j
public class AnotherControllerBis {

    @RequestMapping("/aaa")
    String get() {
        //mapped to hostname:port/home/
        return "Hello from get";

    }
    @RequestMapping("/bbb")
    String index() {

        //mapped to hostname:port/home/index/
        return "Hello from index";

    }

    @RequestMapping(method = RequestMethod.PUT, value = {
            "",
            "/page",
            "page*",
            "view/*,**/msg"
    })
    String indexMultipleMapping() {
        return "Hello from index multiple mapping.";
    }


//    @ResponseBody
//    @Mapping
//    public String home() {
//
//
//        log.trace("This is TRACE");
//        log.debug("This is DEBUG");
//        log.info("This is INFO");
//        log.warn("This is WARN");
//        log.error("This is ERROR");
//
//        return "Hi, show loggings in the console or file!";
//    }

}
