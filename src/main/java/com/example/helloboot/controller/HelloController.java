package com.example.helloboot.controller;

import com.example.helloboot.modle.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Description
 * author pjt  kilde@foxmail.com
 * Date ${date}$ ${time}$
 */
@RestController
@RequestMapping("/hello")
public class HelloController {


    @RequestMapping(value = "/lambda", method = RequestMethod.GET)
    public String test() {
        List list = Arrays.asList("111", "222", "333", "444");
        list.forEach(n -> System.out.println(n));

        return "你好";
    }


    private static final String template = "Hello,%s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public Greeting getting(@RequestParam(value = "name", defaultValue = "word") String name) {
        return new Greeting(
                counter.incrementAndGet(),
                String.format(template, name)
        );

    }

}
