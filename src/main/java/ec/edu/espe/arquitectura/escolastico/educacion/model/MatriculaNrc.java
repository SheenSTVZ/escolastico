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
@Table(name = "edu_matricula_nrc")
public class MatriculaNrc implements Serializable {
    private static final long serialVersionUID = -3486472331244972222L;
    @EmbeddedId
    private MatriculaNrcId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_matricula", referencedColumnName = "cod_matricula", nullable = false),
            @JoinColumn(name = "cod_persona", referencedColumnName = "cod_persona", nullable = false)
    })
    private Matricula matricula;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_nrc", referencedColumnName = "cod_nrc", nullable = false),
            @JoinColumn(name = "cod_periodo", referencedColumnName = "cod_periodo", nullable = false),
            @JoinColumn(name = "cod_departamento",referencedColumnName = "cod_departamento", nullable = false),
            @JoinColumn(name = "cod_materia", referencedColumnName = "cod_materia", nullable = false)
    })
    private Nrc nrc;



    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "numero", nullable = false, precision = 1)
    private BigDecimal numero;

    @Column(name = "costo", nullable = false, precision = 7, scale = 2)
    private BigDecimal costo;

}