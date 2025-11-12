package com.example.restbackend_koenigwiedenegger.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class SampleId implements Serializable {
    private static final long serialVersionUID = -2393083677975471107L;
    @Size(max = 13)
    @NotNull
    @Column(name = "s_id", nullable = false, length = 13)
    private String sId;

    @NotNull
    @Column(name = "s_stamp", nullable = false)
    private Instant sStamp;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        SampleId entity = (SampleId) o;
        return Objects.equals(this.sStamp, entity.sStamp) &&
                Objects.equals(this.sId, entity.sId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sStamp, sId);
    }

}