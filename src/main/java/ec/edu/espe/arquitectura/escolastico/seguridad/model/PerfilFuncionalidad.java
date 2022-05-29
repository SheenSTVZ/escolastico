package ec.edu.espe.arquitectura.escolastico.seguridad.model;

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
@Table(name = "seg_perfil_funcionalidad")
public class PerfilFuncionalidad implements Serializable {
    private static final long serialVersionUID = 6401885402922328663L;
    @EmbeddedId
    private PerfilFuncionalidadId id;

    @MapsId("codPerfil")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_perfil", nullable = false)
    private Perfil codPerfil;

    @MapsId("codFuncionalidad")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_funcionalidad", nullable = false)
    private Funcionalidad codFuncionalidad;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}