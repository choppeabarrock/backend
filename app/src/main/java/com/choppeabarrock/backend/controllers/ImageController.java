package com.choppeabarrock.backend.controllers;

import com.choppeabarrock.backend.model.Product;
import com.choppeabarrock.backend.services.DefaultService;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


// Multiple ways with their benefits and drawbacks to manipulate the HTTP response (in Spring)
// https://www.baeldung.com/spring-response-entity

@Controller
public class ImageController {

    @RequestMapping(value = "/api/v1/images", method = RequestMethod.GET)
    public void fooBar(HttpServletResponse response) throws IOException {

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        // out.write(myService.getJson().getBytes());
        out.write("some binary".getBytes());

        response.setContentType("application/octet-stream");
        response.setContentLength(out.size());

        response.getOutputStream().write(out.toByteArray());

        response.getOutputStream().flush();

    }
}
