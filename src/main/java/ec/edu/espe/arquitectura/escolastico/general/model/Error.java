package ec.edu.espe.arquitectura.escolastico.general.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "gen_error")
public class Error implements Serializable {
    private static final long serialVersionUID = 2804538170240368273L;
    @Id
    @Column(name = "cod_error", nullable = false, length = 5)
    private String id;

    @Column(name = "titulo", nullable = false)
    private String titulo;

    @Column(name = "descripcion", nullable = false, length = 1000)
    private String descripcion;

}