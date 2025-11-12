package com.example.restbackend_koenigwiedenegger.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "boxpos", schema = "venlab")
public class Boxpo {
    @EmbeddedId
    private BoxpoId id;

    @MapsId("bId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "b_id", nullable = false)
    private Box b;

    @Column(name = "date_exported")
    private Instant dateExported;

}