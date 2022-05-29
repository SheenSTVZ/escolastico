package ec.edu.espe.arquitectura.escolastico.educacion.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "edu_prerequisito")
public class Prerequisito implements Serializable {
    private static final long serialVersionUID = -3729307600618927351L;
    @Id
    @Column(name = "cod_prerequisito", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_materia", referencedColumnName = "cod_materia", nullable = false),
            @JoinColumn(name = "cod_departamento", referencedColumnName = "cod_departamento", nullable = false)
    })
    private Materia materia;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cod_materia_prerequisito", referencedColumnName = "cod_materia", nullable = false),
            @JoinColumn(name = "edu_cod_departamento", referencedColumnName = "cod_departamento", nullable = false)
    })
    private Materia materiaPrerequisito;

    @Column(name = "tipo", nullable = false, length = 3)
    private String tipo;

}