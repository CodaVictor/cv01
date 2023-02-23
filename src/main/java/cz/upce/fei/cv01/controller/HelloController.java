package cz.upce.fei.cv01.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/v1")
    public String helloController() {
        return "Hello world from Spting Boot application.";
    }

    @RequestMapping("/v1/{message}")
    public String getAnyString(@PathVariable String message) {
        return "You inserted: " + message;
    }

    @GetMapping ("/v1")
    public String requestString(@RequestParam String text) {
        return "You inserted to body: " + text;
    }

    @GetMapping ("/entity")
    public String requestDataBody(@RequestBody PersonLombok person) {
        return person.toString();
    }
}
