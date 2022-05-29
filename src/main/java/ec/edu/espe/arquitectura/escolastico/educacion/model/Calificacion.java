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
@Table(name = "edu_calificacion")
public class Calificacion implements Serializable {
    private static final long serialVersionUID = -8369680449144983518L;
    @EmbeddedId
    private CalificacionId id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_matricula", referencedColumnName = "cod_matricula", nullable = false),
            @JoinColumn(name = "cod_persona", referencedColumnName = "cod_persona", nullable = false),
            @JoinColumn(name = "cod_nrc", referencedColumnName = "cod_nrc", nullable = false),
            @JoinColumn(name = "cod_periodo", referencedColumnName = "cod_periodo", nullable = false),
            @JoinColumn(name = "cod_departamento", referencedColumnName = "cod_departamento", nullable = false),
            @JoinColumn(name = "cod_materia", referencedColumnName = "cod_materia", nullable = false)
    })
    private MatriculaNrc matriculaNrc;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_matricula", referencedColumnName = "cod_matricula", nullable = false),
            @JoinColumn(name = "cod_persona", referencedColumnName = "cod_persona", nullable = false),
            @JoinColumn(name = "cod_nrc", referencedColumnName = "cod_nrc", nullable = false),
            @JoinColumn(name = "cod_periodo", referencedColumnName = "cod_periodo", nullable = false),
            @JoinColumn(name = "cod_departamento", referencedColumnName = "cod_departamento", nullable = false),
            @JoinColumn(name = "cod_materia", referencedColumnName = "cod_materia", nullable = false)
    })
    private MatriculaNrc matriculaNrc1;

    @Column(name = "nota1", precision = 5, scale = 2)
    private BigDecimal nota1;

    @Column(name = "nota2", precision = 5, scale = 2)
    private BigDecimal nota2;

    @Column(name = "nota3", precision = 5, scale = 2)
    private BigDecimal nota3;

    @Column(name = "nota4", precision = 5, scale = 2)
    private BigDecimal nota4;

    @Column(name = "nota5", precision = 5, scale = 2)
    private BigDecimal nota5;

    @Column(name = "nota6", precision = 5, scale = 2)
    private BigDecimal nota6;

    @Column(name = "nota7", precision = 5, scale = 2)
    private BigDecimal nota7;

    @Column(name = "nota8", precision = 5, scale = 2)
    private BigDecimal nota8;

    @Column(name = "nota9", precision = 5, scale = 2)
    private BigDecimal nota9;

    @Column(name = "nota10", precision = 5, scale = 2)
    private BigDecimal nota10;

    @Column(name = "promedio", precision = 5, scale = 2)
    private BigDecimal promedio;

    @Column(name = "observacion", length = 25)
    private String observacion;

}