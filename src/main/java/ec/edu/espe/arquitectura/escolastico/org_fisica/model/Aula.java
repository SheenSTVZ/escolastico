package ec.edu.espe.arquitectura.escolastico.org_fisica.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ofi_aula")
public class Aula implements Serializable {
    private static final long serialVersionUID = 4042900746162591984L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cod_aula", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_tipo_aula")
    private TipoAula codTipoAula;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_edificio_bloque")
    private EdificioBloque codEdificioBloque;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_edificio")
    private Edificio codEdificio;

    @Column(name = "cod_alterno", nullable = false, length = 10)
    private String codAlterno;

    @Column(name = "capacidad", nullable = false, precision = 4)
    private BigDecimal capacidad;

    @Column(name = "piso", nullable = false, precision = 2)
    private BigDecimal piso;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}