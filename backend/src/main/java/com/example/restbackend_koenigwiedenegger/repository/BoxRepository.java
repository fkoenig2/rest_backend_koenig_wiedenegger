package com.example.restbackend_koenigwiedenegger.repository;

import com.example.restbackend_koenigwiedenegger.entity.Box;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxRepository extends JpaRepository<Box, String> {
}