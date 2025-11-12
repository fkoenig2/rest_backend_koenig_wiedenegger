package com.example.restbackend_koenigwiedenegger.repository;

import com.example.restbackend_koenigwiedenegger.entity.Boxpo;
import com.example.restbackend_koenigwiedenegger.entity.BoxpoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoxpoRepository extends JpaRepository<Boxpo, BoxpoId> {
}