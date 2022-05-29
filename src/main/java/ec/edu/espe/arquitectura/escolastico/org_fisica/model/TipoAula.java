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
@Table(name = "ofi_tipo_aula")
public class TipoAula implements Serializable {
    private static final long serialVersionUID = 1766936252632657461L;
    @Id
    @Column(name = "cod_tipo_aula", nullable = false, length = 10)
    private String id;

    @Column(name = "descripcion", nullable = false, length = 128)
    private String descripcion;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}