package ec.edu.espe.arquitectura.escolastico.org_fisica.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "ofi_institucion")
public class Institucion implements Serializable {
    private static final long serialVersionUID = -7635441773322556497L;
    @Id
    @Column(name = "cod_institucion", nullable = false, precision = 3)
    private BigDecimal id;

    @Column(name = "ruc", nullable = false, length = 13)
    private String ruc;

    @Column(name = "razon_social", nullable = false, length = 250)
    private String razonSocial;

    @Column(name = "nombre_comercial", nullable = false, length = 250)
    private String nombreComercial;

    @Column(name = "dominio", length = 128)
    private String dominio;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}