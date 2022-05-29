package ec.edu.espe.arquitectura.escolastico.seguridad.model;

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
@Table(name = "seg_modulo")
public class Modulo implements Serializable {
    private static final long serialVersionUID = 6762273795960508359L;
    @Id
    @Column(name = "cod_modulo", nullable = false, length = 16)
    private String id;

    @Column(name = "nombre", nullable = false, length = 50)
    private String nombre;

    @Column(name = "estado", nullable = false, length = 3)
    private String estado;

    @Column(name = "version", nullable = false)
    private Integer version;

}