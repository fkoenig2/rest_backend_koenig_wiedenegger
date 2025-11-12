package com.example.restbackend_koenigwiedenegger.controller;

import com.example.restbackend_koenigwiedenegger.entity.Sample;
import com.example.restbackend_koenigwiedenegger.repository.SampleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/sample")
public class SampleController {
    @Autowired
    private SampleRepository sampleRepository;

    @GetMapping
    public List<Sample> getAllSamples() {
        return sampleRepository.findAll();
    }
}