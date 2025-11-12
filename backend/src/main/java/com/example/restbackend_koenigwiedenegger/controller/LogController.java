package com.example.restbackend_koenigwiedenegger.controller;

import com.example.restbackend_koenigwiedenegger.entity.Log;
import com.example.restbackend_koenigwiedenegger.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/log")
public class LogController {
    @Autowired
    private LogRepository logRepository;

    @GetMapping
    public List<Log> getAllLogs() {
        return logRepository.findAll();
    }
}