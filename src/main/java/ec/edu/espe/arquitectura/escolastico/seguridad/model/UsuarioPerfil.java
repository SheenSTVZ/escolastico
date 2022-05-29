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
@Table(name = "seg_usuario_perfil")
public class UsuarioPerfil implements Serializable {
    private static final long serialVersionUID = 6948770107280754796L;
    @EmbeddedId
    private UsuarioPerfilId id;

    @MapsId("codUsuario")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_usuario", nullable = false)
    private Usuario codUsuario;

    @MapsId("codPerfil")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_perfil", nullable = false)
    private Perfil codPerfil;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}