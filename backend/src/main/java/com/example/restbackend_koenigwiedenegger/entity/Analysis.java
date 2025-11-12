package com.example.restbackend_koenigwiedenegger.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "analysis", schema = "venlab")
public class Analysis {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "a_id", nullable = false)
    private Long id;

    @Column(name = "pol", precision = 8, scale = 2)
    private BigDecimal pol;

    @Column(name = "nat", precision = 8, scale = 2)
    private BigDecimal nat;

    @Column(name = "kal", precision = 8, scale = 2)
    private BigDecimal kal;

    @Column(name = "an", precision = 8, scale = 2)
    private BigDecimal an;

    @Column(name = "glu", precision = 8, scale = 2)
    private BigDecimal glu;

    @Column(name = "dry", precision = 8, scale = 2)
    private BigDecimal dry;

    @Column(name = "date_in")
    private Instant dateIn;

    @Column(name = "date_out")
    private Instant dateOut;

    @Column(name = "weight_mea", precision = 8, scale = 2)
    private BigDecimal weightMea;

    @Column(name = "weight_nrm", precision = 8, scale = 2)
    private BigDecimal weightNrm;

    @Column(name = "weight_cur", precision = 8, scale = 2)
    private BigDecimal weightCur;

    @Column(name = "weight_dif", precision = 8, scale = 2)
    private BigDecimal weightDif;

    @Column(name = "density", precision = 8, scale = 2)
    private BigDecimal density;

    @Size(max = 15)
    @ColumnDefault("'----------'")
    @Column(name = "a_flags", length = 15)
    private String aFlags;

    @ColumnDefault("1")
    @Column(name = "lane")
    private Integer lane;

    @Size(max = 255)
    @Column(name = "comment")
    private String comment;

    @Column(name = "date_exported")
    private Instant dateExported;

}