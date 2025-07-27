package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Random;

@SpringBootApplication
@RestController
public class RandomApiApplication {

    private final Random random = new Random();

    public static void main(String[] args) {
        SpringApplication.run(RandomApiApplication.class, args);
    }

    @GetMapping("/random")
    public Map<String, Integer> getRandom() {
        return Map.of("number", random.nextInt(100) + 1);
    }
}
