package com.example.restbackend_koenigwiedenegger.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
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
@Table(name = "sample", schema = "venlab")
public class Sample {
    @EmbeddedId
    private SampleId id;

    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @Column(name = "weight_net", precision = 8, scale = 2)
    private BigDecimal weightNet;

    @Column(name = "weight_bru", precision = 8, scale = 2)
    private BigDecimal weightBru;

    @Column(name = "weight_tar", precision = 8, scale = 2)
    private BigDecimal weightTar;

    @Column(name = "quantity")
    private Integer quantity;

    @Column(name = "distance", precision = 8, scale = 2)
    private BigDecimal distance;

    @Column(name = "date_crumbled")
    private Instant dateCrumbled;

    @Size(max = 10)
    @ColumnDefault("'-----'")
    @Column(name = "s_flags", length = 10)
    private String sFlags;

    @Column(name = "lane")
    private Integer lane;

    @Size(max = 255)
    @Column(name = "comment")
    private String comment;

    @Column(name = "date_exported")
    private Instant dateExported;

}