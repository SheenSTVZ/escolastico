package ec.edu.espe.arquitectura.escolastico.general.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "gen_ubicacion_geografica")
public class UbicacionGeografica implements Serializable {
    private static final long serialVersionUID = -726110912462666505L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_ubicacion_geo_int", nullable = false)
    private Integer id;

//TODO [JPA Buddy] generate columns from DB
}