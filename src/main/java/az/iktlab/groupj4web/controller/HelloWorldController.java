package az.iktlab.groupj4web.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

    @GetMapping
    public String hello() {
        return "<h1> Hello Spring Boot World </h1>";
    }

    @PostMapping
    public void postEx() {
        System.out.println("Post mapping example");
    }

    @PutMapping
    public void putEx() {
        System.out.println("Put mapping example");
    }

    @PatchMapping
    public void patchEx() {
        System.out.println("Patch mapping example");
    }

    @DeleteMapping
    public void deleteEx() {
        System.out.println("Delete mapping example");
    }
}