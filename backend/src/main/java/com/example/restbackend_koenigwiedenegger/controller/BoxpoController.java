package com.example.restbackend_koenigwiedenegger.controller;

import com.example.restbackend_koenigwiedenegger.entity.Boxpo;
import com.example.restbackend_koenigwiedenegger.repository.BoxpoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/boxpos")
public class BoxpoController {
    @Autowired
    private BoxpoRepository boxPosRepository;

    @GetMapping
    public List<Boxpo> getAllBoxPositions() {
        return boxPosRepository.findAll();
    }
}