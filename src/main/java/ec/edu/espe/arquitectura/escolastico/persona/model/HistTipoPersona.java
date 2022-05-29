package ec.edu.espe.arquitectura.escolastico.persona.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "per_hist_tipo_persona")
public class HistTipoPersona implements Serializable {
    private static final long serialVersionUID = -3811413761013175803L;
    @EmbeddedId
    private HistTipoPersonaId id;

    @MapsId("codPersona")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_persona", nullable = false)
    private Persona codPersona;

    @MapsId("codTipoPersona")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_tipo_persona", nullable = false)
    private TipoPersona codTipoPersona;

    @Column(name = "fecha_inicio", nullable = false)
    private Instant fechaInicio;

    @Column(name = "cod_usuario_ini", nullable = false, length = 30)
    private String codUsuarioIni;

    @Column(name = "fecha_fin")
    private Instant fechaFin;

    @Column(name = "cod_usuario_fin", length = 30)
    private String codUsuarioFin;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}