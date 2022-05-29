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
@Table(name = "edu_carrera")
public class Carrera implements Serializable {
    private static final long serialVersionUID = -2948041579396563973L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_carrera", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_departamento", nullable = false)
    private Departamento matriculaNrc;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "total_semestres", nullable = false)
    private Integer totalSemestres;

    @Column(name = "grado", nullable = false, length = 25)
    private String grado;

    @Column(name = "perfil_profesional", nullable = false, length = 500)
    private String perfilProfesional;

    @Column(name = "nivel", nullable = false, length = 32)
    private String nivel;

    @Column(name = "total_creditos", nullable = false, precision = 5, scale = 2)
    private BigDecimal totalCreditos;

    @Column(name = "total_horas", nullable = false, precision = 5, scale = 2)
    private BigDecimal totalHoras;

    @Column(name = "siglas", nullable = false, length = 32)
    private String siglas;

    @Column(name = "precio_credito", nullable = false, precision = 5, scale = 2)
    private BigDecimal precioCredito;

    @Column(name = "modalidad", length = 64)
    private String modalidad;

}