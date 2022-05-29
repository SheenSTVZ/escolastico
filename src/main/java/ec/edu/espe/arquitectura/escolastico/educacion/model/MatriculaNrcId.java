package ec.edu.espe.arquitectura.escolastico.educacion.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class MatriculaNrcId implements Serializable {
    private static final long serialVersionUID = 4093867896292947177L;
    @Column(name = "cod_matricula", nullable = false, length = 10)
    private String codMatricula;

    @Column(name = "cod_persona", nullable = false)
    private Integer codPersona;

    @Column(name = "cod_nrc", nullable = false, precision = 4)
    private BigDecimal codNrc;

    @Column(name = "cod_periodo", nullable = false)
    private Integer codPeriodo;

    @Column(name = "cod_departamento", nullable = false)
    private Integer codDepartamento;

    @Column(name = "cod_materia", nullable = false)
    private Integer codMateria;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MatriculaNrcId entity = (MatriculaNrcId) o;
        return Objects.equals(this.codMatricula, entity.codMatricula) &&
                Objects.equals(this.codPersona, entity.codPersona) &&
                Objects.equals(this.codDepartamento, entity.codDepartamento) &&
                Objects.equals(this.codPeriodo, entity.codPeriodo) &&
                Objects.equals(this.codNrc, entity.codNrc) &&
                Objects.equals(this.codMateria, entity.codMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codMatricula, codPersona, codDepartamento, codPeriodo, codNrc, codMateria);
    }

}