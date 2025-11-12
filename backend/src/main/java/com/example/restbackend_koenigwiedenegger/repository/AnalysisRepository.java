package com.example.restbackend_koenigwiedenegger.repository;

import com.example.restbackend_koenigwiedenegger.entity.Analysis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnalysisRepository extends JpaRepository<Analysis, Long> {
}