package com.hackaboss.SistemaAsistencia.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "asistencia")
public class Asistencia{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "estado_de_asistencia", nullable = false)
    private Boolean estadoDeAsistencia;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "matricula_id", nullable = false)
    private Matricula matriculaID;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Boolean getEstadoDeAsistencia() {
        return estadoDeAsistencia;
    }

    public void setEstadoDeAsistencia(Boolean estadoDeAsistencia) {
        this.estadoDeAsistencia = estadoDeAsistencia;
    }

    public Matricula getMatriculaID() {
        return matriculaID;
    }

    public void setMatriculaID(Matricula matriculaID) {
        this.matriculaID = matriculaID;
    }


}
