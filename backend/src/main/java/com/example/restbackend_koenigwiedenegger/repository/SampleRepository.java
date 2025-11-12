package com.example.restbackend_koenigwiedenegger.repository;

import com.example.restbackend_koenigwiedenegger.entity.Sample;
import com.example.restbackend_koenigwiedenegger.entity.SampleId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SampleRepository extends JpaRepository<Sample, SampleId> {
}