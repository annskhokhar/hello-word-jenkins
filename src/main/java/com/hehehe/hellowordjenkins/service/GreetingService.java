package com.hehehe.hellowordjenkins.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String createGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            return "Hello World!";
        }
        return String.format("Hello %s!", name.trim());
    }

    public String createCustomGreeting(String greeting, String name) {
        if (greeting == null || greeting.trim().isEmpty()) {
            greeting = "Hello";
        }
        if (name == null || name.trim().isEmpty()) {
            name = "World";
        }
        return String.format("%s %s!", greeting.trim(), name.trim());
    }

}