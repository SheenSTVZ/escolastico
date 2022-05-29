package ec.edu.espe.arquitectura.escolastico.general.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "gen_institucion")
public class InstitucionGeneral implements Serializable {
    private static final long serialVersionUID = 4703826231414672057L;
    @Id
    @Column(name = "ruc", nullable = false, length = 13)
    private String id;

    @Column(name = "razon_social", nullable = false, length = 128)
    private String razonSocial;

    @Column(name = "nombre_comercial", nullable = false, length = 128)
    private String nombreComercial;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_ubicacion_geo_int")
    private UbicacionGeografica codUbicacionGeoInt;

    @Column(name = "direccion", nullable = false)
    private String direccion;

    @Column(name = "dominio", nullable = false, length = 64)
    private String dominio;

    @Column(name = "url_info", length = 128)
    private String urlInfo;

    @Column(name = "url_sistema", nullable = false, length = 128)
    private String urlSistema;

    @Column(name = "version", nullable = false)
    private Integer version;

}