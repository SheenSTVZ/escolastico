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
@Table(name = "ofi_edificio")
public class Edificio implements Serializable {
    private static final long serialVersionUID = -7337219389264424440L;
    @Id
    @Column(name = "cod_edificio", nullable = false, length = 8)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_sede")
    private Sede codSede;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "cod_alterno", length = 16)
    private String codAlterno;

    @Column(name = "descripcion", nullable = false, length = 500)
    private String descripcion;

    @Column(name = "direccion", nullable = false, length = 256)
    private String direccion;

    @Column(name = "comentario", length = 1000)
    private String comentario;

    @Column(name = "maneja_bloques", nullable = false, length = 1)
    private String manejaBloques;

    @Column(name = "posee_aulas", nullable = false, length = 1)
    private String poseeAulas;

    @Column(name = "pisos", nullable = false, precision = 2)
    private BigDecimal pisos;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}