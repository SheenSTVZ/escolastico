package ec.edu.espe.arquitectura.escolastico.educacion.model;

import ec.edu.espe.arquitectura.escolastico.persona.model.Persona;
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
@Table(name = "edu_nrc")
public class Nrc implements Serializable {
    private static final long serialVersionUID = 1597860080534941186L;
    @EmbeddedId
    private NrcId id;

    @MapsId("codPeriodo")
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_periodo", nullable = false)
    private Periodo periodo;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_materia", referencedColumnName = "cod_materia", nullable = false),
            @JoinColumn(name = "cod_departamento", referencedColumnName = "cod_departamento", nullable = false)
    })
    private Materia materia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_persona", nullable = false)
    private Persona codPersona;

    @Column(name = "cupo_disponible", nullable = false, precision = 3)
    private BigDecimal cupoDisponible;

    @Column(name = "cupo_registrado", nullable = false, precision = 3)
    private BigDecimal cupoRegistrado;

    @Column(name = "nombre")
    private String nombre;

}