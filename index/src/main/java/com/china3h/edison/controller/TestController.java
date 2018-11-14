package com.china3h.edison.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {


    /**
     * Test API
     *
     * @return
     */
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String test() {


        return "OK";
    }


}
