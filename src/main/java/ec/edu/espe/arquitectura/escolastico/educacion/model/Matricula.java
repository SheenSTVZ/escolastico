package ec.edu.espe.arquitectura.escolastico.educacion.model;

import ec.edu.espe.arquitectura.escolastico.persona.model.Persona;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "edu_matricula")
public class Matricula implements Serializable {
    private static final long serialVersionUID = -1964182780099923531L;
    @EmbeddedId
    private MatriculaId id;

    @MapsId("codPersona")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_persona", nullable = false)
    private Persona persona;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_carrera", nullable = false)
    private Carrera carrera;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_periodo", nullable = false)
    private Periodo codPeriodo;

    @Column(name = "tipo", nullable = false, length = 3)
    private String tipo;

    @Column(name = "fecha", nullable = false)
    private LocalDate fecha;

    @Column(name = "costo", nullable = false)
    private BigDecimal costo;

}