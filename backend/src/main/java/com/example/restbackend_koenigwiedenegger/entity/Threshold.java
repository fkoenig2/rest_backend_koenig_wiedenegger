package com.example.restbackend_koenigwiedenegger.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "threshold", schema = "venlab")
public class Threshold {
    @Id
    @Size(max = 10)
    @Column(name = "th_id", nullable = false, length = 10)
    private String thId;

    @Column(name = "value_min", precision = 8, scale = 2)
    private BigDecimal valueMin;

    @Column(name = "value_max", precision = 8, scale = 2)
    private BigDecimal valueMax;

    @ColumnDefault("now()")
    @Column(name = "date_changed")
    private Instant dateChanged;

}