package com.hackaboss.SistemaAsistencia.Entity;


import jakarta.persistence.*;

@Entity
@Table(name = "profesor")
public class Profesor extends Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tipo_vinculacion", length = 255, nullable = false)
    private String tipoVinculacion;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoVinculacion() {
        return tipoVinculacion;
    }

    public void setTipoVinculacion(String tipoVinculacion) {
        this.tipoVinculacion = tipoVinculacion;
    }
}
