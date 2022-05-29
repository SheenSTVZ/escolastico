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
public class NrcHorarioId implements Serializable {
    private static final long serialVersionUID = -780722209463840235L;
    @Column(name = "cod_nrc", nullable = false, precision = 4)
    private BigDecimal codNrc;

    @Column(name = "cod_periodo", nullable = false)
    private Integer codPeriodo;

    @Column(name = "cod_departamento", nullable = false)
    private Integer codDepartamento;

    @Column(name = "cod_materia", nullable = false)
    private Integer codMateria;

    @Column(name = "cod_aula", nullable = false)
    private Integer codAula;

    @Column(name = "dia_semana", nullable = false, length = 25)
    private String diaSemana;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        NrcHorarioId entity = (NrcHorarioId) o;
        return Objects.equals(this.codAula, entity.codAula) &&
                Objects.equals(this.diaSemana, entity.diaSemana) &&
                Objects.equals(this.codDepartamento, entity.codDepartamento) &&
                Objects.equals(this.codPeriodo, entity.codPeriodo) &&
                Objects.equals(this.codNrc, entity.codNrc) &&
                Objects.equals(this.codMateria, entity.codMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codAula, diaSemana, codDepartamento, codPeriodo, codNrc, codMateria);
    }

}