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
@Table(name = "gen_pais")
public class Pais implements Serializable {
    private static final long serialVersionUID = -4290184525475372736L;
    @Id
    @Column(name = "cod_pais", nullable = false, length = 2)
    private String id;

}