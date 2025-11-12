package com.example.restbackend_koenigwiedenegger.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class BoxpoId implements Serializable {
    private static final long serialVersionUID = -40886795500692339L;
    @NotNull
    @Column(name = "bpos_id", nullable = false)
    private Integer bposId;

    @Size(max = 4)
    @NotNull
    @Column(name = "b_id", nullable = false, length = 4)
    private String bId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BoxpoId entity = (BoxpoId) o;
        return Objects.equals(this.bposId, entity.bposId) &&
                Objects.equals(this.bId, entity.bId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bposId, bId);
    }

}