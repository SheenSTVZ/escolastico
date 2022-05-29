package ec.edu.espe.arquitectura.escolastico.persona.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "per_direccion_persona")
public class DireccionPersona implements Serializable {
    private static final long serialVersionUID = 8049673906232960489L;
    @EmbeddedId
    private DireccionPersonaId id;

    @Column(name = "cod_tipo_direccion", nullable = false, length = 3)
    private String codTipoDireccion;

    @Column(name = "cod_org_geo_direccion", nullable = false, precision = 8)
    private BigDecimal codOrgGeoDireccion;

    @Column(name = "calle_principal", nullable = false, length = 100)
    private String callePrincipal;

    @Column(name = "numeracion", nullable = false, length = 15)
    private String numeracion;

    @Column(name = "calle_secundaria", length = 100)
    private String calleSecundaria;

    @Column(name = "direccion_adicional", length = 50)
    private String direccionAdicional;

    @Column(name = "barrio", length = 100)
    private String barrio;

    @Column(name = "referencia")
    private String referencia;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Column(name = "principal", nullable = false, length = 1)
    private String principal;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}