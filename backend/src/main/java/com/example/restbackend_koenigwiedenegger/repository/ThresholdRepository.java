package com.example.restbackend_koenigwiedenegger.repository;

import com.example.restbackend_koenigwiedenegger.entity.Threshold;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThresholdRepository extends JpaRepository<Threshold, String> {
}