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
public class MateriaId implements Serializable {
    private static final long serialVersionUID = 1849351200635676637L;
    @Column(name = "cod_materia", nullable = false)
    private Integer codMateria;

    @Column(name = "cod_departamento", nullable = false)
    private Integer codDepartamento;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        MateriaId entity = (MateriaId) o;
        return Objects.equals(this.codDepartamento, entity.codDepartamento) &&
                Objects.equals(this.codMateria, entity.codMateria);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codDepartamento, codMateria);
    }

}