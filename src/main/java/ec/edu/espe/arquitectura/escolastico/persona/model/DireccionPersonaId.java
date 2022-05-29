package ec.edu.espe.arquitectura.escolastico.persona.model;

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
public class DireccionPersonaId implements Serializable {
    private static final long serialVersionUID = -5947857237705747298L;
    @Column(name = "cod_persona", nullable = false)
    private Integer codPersona;

    @Column(name = "sec_direccion", nullable = false, precision = 2)
    private BigDecimal secDireccion;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        DireccionPersonaId entity = (DireccionPersonaId) o;
        return Objects.equals(this.codPersona, entity.codPersona) &&
                Objects.equals(this.secDireccion, entity.secDireccion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codPersona, secDireccion);
    }

}