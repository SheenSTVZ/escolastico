package ec.edu.espe.arquitectura.escolastico.educacion.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "edu_materia")
public class Materia implements Serializable {
    private static final long serialVersionUID = 4013187818613402223L;
    @EmbeddedId
    private MateriaId id;

    @MapsId("codDepartamento")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_departamento", nullable = false)
    private Departamento departamento;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "creditos", nullable = false, precision = 4, scale = 2)
    private BigDecimal periodo;

    @Column(name = "horas", nullable = false, precision = 4, scale = 2)
    private BigDecimal horas;

    @Column(name = "ponderacion", nullable = false, precision = 5, scale = 2)
    private BigDecimal ponderacion;

}