package ec.edu.espe.arquitectura.escolastico.persona.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "per_familiar_persona")
public class FamiliarPersona implements Serializable {
    private static final long serialVersionUID = -6392850296369746713L;
    @EmbeddedId
    private FamiliarPersonaId id;

    @MapsId("codPersona")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "cod_persona", nullable = false)
    private Persona codPersona;

    @Column(name = "tipo_familiar", nullable = false, length = 3)
    private String tipoFamiliar;

    @Column(name = "nombre", nullable = false, length = 128)
    private String nombre;

    @Column(name = "tipo_identificacion", length = 3)
    private String tipoIdentificacion;

    @Column(name = "identificacion", length = 20)
    private String identificacion;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "telefono", length = 20)
    private String telefono;

    @Column(name = "aud_usuario", nullable = false, length = 30)
    private String audUsuario;

    @Column(name = "aud_fecha", nullable = false)
    private Instant audFecha;

    @Column(name = "aud_ip", nullable = false, length = 30)
    private String audIp;

    @Column(name = "version", nullable = false)
    private Integer version;

}