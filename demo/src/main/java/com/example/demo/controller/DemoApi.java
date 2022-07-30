package com.example.demo.controller;

import com.example.demo.dto.TypesDto;
import com.example.demo.dto.PersonDto;
import com.example.demo.service.DemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class DemoApi {
    private final DemoService demoService;

    @CrossOrigin
    @GetMapping("/getTypes")
    public List<TypesDto> getAllTypes() {
        return demoService.getAllTypes();
    }

    @CrossOrigin
    @PostMapping("/createUser")
    public PersonDto createUser(@RequestBody PersonDto personDto) {
        return demoService.createUser(personDto);
    }

    @CrossOrigin
    @GetMapping("/getUserById")
    public PersonDto getUserById(@RequestParam Long userId) {
        return demoService.getUserById(userId);
    }

    @CrossOrigin
    @PostMapping("/updateUser")
    public PersonDto updateUserData(@RequestBody PersonDto personDto) {
        return demoService.updateUser(personDto);
    }
}
