package com.example.restbackend_koenigwiedenegger.controller;

import com.example.restbackend_koenigwiedenegger.entity.Analysis;
import com.example.restbackend_koenigwiedenegger.repository.AnalysisRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/analysis")
public class AnalysisController {

    @Autowired
    private AnalysisRepository analysisRepository;

    @GetMapping
    public List<Analysis> getAllAnalysis() {
        return analysisRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Analysis> getAnalysisById(@PathVariable Long id) {
        Optional<Analysis> analysis = analysisRepository.findById(id);
        return analysis.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public Analysis createAnalysis(@RequestBody Analysis analysis) {
        return analysisRepository.save(analysis);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Analysis> updateAnalysis(@PathVariable Long id, @RequestBody Analysis analysisDetails) {
        return analysisRepository.findById(id)
                .map(analysis -> {
                    analysis.setComment(analysisDetails.getComment());
                    // ... setze hier alle anderen Felder, die du updaten willst ...
                    Analysis updatedAnalysis = analysisRepository.save(analysis);
                    return ResponseEntity.ok(updatedAnalysis);
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteAnalysis(@PathVariable Long id) {
        return analysisRepository.findById(id)
                .map(analysis -> {
                    analysisRepository.delete(analysis);
                    return ResponseEntity.noContent().build();
                })
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}