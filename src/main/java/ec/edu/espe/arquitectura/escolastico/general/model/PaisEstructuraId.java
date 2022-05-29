package ec.edu.espe.arquitectura.escolastico.general.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class PaisEstructuraId implements Serializable {
    private static final long serialVersionUID = -184411744955506354L;
    @Column(name = "cod_pais", nullable = false, length = 2)
    private String codPais;

    @Column(name = "nivel", nullable = false, precision = 2)
    private BigDecimal nivel;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PaisEstructuraId entity = (PaisEstructuraId) o;
        return Objects.equals(this.codPais, entity.codPais) &&
                Objects.equals(this.nivel, entity.nivel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPais, nivel);
    }

}