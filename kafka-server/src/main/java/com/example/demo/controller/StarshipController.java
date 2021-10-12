package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.StarshipDto;
import com.example.demo.service.StarshipService;



@RestController
@RequestMapping("/starship")
public class StarshipController {

    private final StarshipService service;

    @Autowired
    public StarshipController(StarshipService service) {
        this.service = service;
    }

    @PostMapping
    public void send(@RequestBody StarshipDto dto) {
        service.send(dto);
    }
}
