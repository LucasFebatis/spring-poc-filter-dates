package com.febatis.demo.controllers;

import com.febatis.demo.model.dto.FooRequestDTO;
import com.febatis.demo.model.dto.FooResponseDTO;
import com.febatis.demo.service.FooService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/foo-controller")
public class FooController {

    @Autowired
    private FooService service;

    @GetMapping()
    public List<FooResponseDTO> getAllFoo(){
        return service.findAll();
    }

    @GetMapping("/find-by-name-automatically/{name}")
    public FooResponseDTO getAllFoo(@PathParam("name") String name){
        return service.findByNameAutomatically(name);
    }

    @GetMapping("/find-by-name-manually/{name}")
    public FooResponseDTO findByNameManually(@PathParam("name") String name){
        return service.findByNameManually(name);
    }

    @GetMapping("/find-by-initial-date-between")
    public List<FooResponseDTO> findAllByInitialDateBetween(){
        return service.findAllByInitialDateBetween();
    }

    @GetMapping("/find-by-active-with-param")
    public List<FooResponseDTO> findAllBetweenInitialDateAndFinishedDateWithParam(){
        return service.findAllBetweenInitialDateAndFinishedDateWithParam();
    }

    @GetMapping("/find-by-active-without-param")
    public List<FooResponseDTO> findAllBetweenInitialDateAndFinishedDateWithoutParam(){
        return service.findAllBetweenInitialDateAndFinishedDateWithoutParam();
    }

    @PostMapping()
    public FooResponseDTO createFoo(@RequestBody FooRequestDTO fooToCreate) {
        return service.createFoo(fooToCreate);
    }
}