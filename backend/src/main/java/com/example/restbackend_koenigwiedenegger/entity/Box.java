package com.example.restbackend_koenigwiedenegger.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "box", schema = "venlab")
public class Box {
    @Id
    @Size(max = 4)
    @Column(name = "b_id", nullable = false, length = 4)
    private String bId;

    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @ColumnDefault("40")
    @Column(name = "num_max")
    private Integer numMax;

    @ColumnDefault("1")
    @Column(name = "type")
    private Integer type;

    @Size(max = 255)
    @Column(name = "comment")
    private String comment;

    @Column(name = "date_exported")
    private Instant dateExported;

}