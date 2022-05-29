package ec.edu.espe.arquitectura.escolastico.educacion.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class MatriculaId implements Serializable {
    private static final long serialVersionUID = 3860020673685110519L;
    @Column(name = "cod_matricula", nullable = false, length = 10)
    private String codMatricula;

    @Column(name = "cod_persona", nullable = false)
    private Integer codPersona;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MatriculaId entity = (MatriculaId) o;
        return Objects.equals(this.codMatricula, entity.codMatricula) &&
                Objects.equals(this.codPersona, entity.codPersona);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codMatricula, codPersona);
    }

}