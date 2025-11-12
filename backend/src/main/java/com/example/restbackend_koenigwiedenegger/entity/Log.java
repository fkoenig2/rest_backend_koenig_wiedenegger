package com.example.restbackend_koenigwiedenegger.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "log", schema = "venlab")
public class Log {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "log_id", nullable = false)
    private Long id;

    @ColumnDefault("now()")
    @Column(name = "date_created")
    private Instant dateCreated;

    @Size(max = 10)
    @Column(name = "level", length = 10)
    private String level;

    @Size(max = 255)
    @Column(name = "info")
    private String info;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "a_id")
    private Analysis a;

    @Column(name = "date_exported")
    private Instant dateExported;

}