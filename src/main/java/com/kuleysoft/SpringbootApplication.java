package com.kuleysoft;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

}

@RestController
class HelloController {

    private static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/")
    public String hello() {
        logger.info("Called index page, x y z");

        return "Londra'dan Selamlar Google App Engine'e ve ayrıca github actions!!!!";
    }

    @GetMapping("/hello")
    public String method2() {
        logger.info("Called second page");
        return "Hello world!";
    }
}



