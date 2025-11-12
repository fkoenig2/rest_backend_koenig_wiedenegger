package com.example.restbackend_koenigwiedenegger.controller;

import com.example.restbackend_koenigwiedenegger.entity.Threshold;
import com.example.restbackend_koenigwiedenegger.repository.ThresholdRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/threshold")
public class ThresholdController {
    @Autowired
    private ThresholdRepository thresholdRepository;

    @GetMapping
    public List<Threshold> getAllThresholds() {
        return thresholdRepository.findAll();
    }
}