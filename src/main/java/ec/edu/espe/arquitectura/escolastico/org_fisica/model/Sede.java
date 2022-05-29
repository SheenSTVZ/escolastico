package ec.edu.espe.arquitectura.escolastico.org_fisica.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ofi_sede")
public class Sede implements Serializable {
    private static final long serialVersionUID = -8469749375492152372L;
    @Id
    @Column(name = "cod_sede", nullable = false, length = 8)
    private String id;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "direccion", length = 256)
    private String direccion;

    @Column(name = "es_principal", nullable = false, length = 1)
    private String esPrincipal;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}