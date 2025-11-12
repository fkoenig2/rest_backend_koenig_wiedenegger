package com.example.restbackend_koenigwiedenegger.controller;

import com.example.restbackend_koenigwiedenegger.entity.Box;
import com.example.restbackend_koenigwiedenegger.repository.BoxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/box")
public class BoxController {
    @Autowired
    private BoxRepository boxRepository;

    @GetMapping
    public List<Box> getAllBoxes() {
        return boxRepository.findAll();
    }
}