package com.hackaboss.SistemaAsistencia.Entity;

import jakarta.persistence.*;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "horarioMateria", uniqueConstraints = {
        @UniqueConstraint(columnNames = {"profesor_id", "aula_id", "materia_id"})
})
public class HorarioMateria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @Column(name = "hora_entrada", nullable = false)
    private LocalTime horaEntrada;
    @Column(name = "hora_salida", nullable = false)
    private LocalTime horaSalida;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "profesor_id", nullable = false)
    private Profesor profesorID;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "aula_id", nullable = false)
    private Aula aulaID;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materiaID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(LocalTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(LocalTime horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Profesor getProfesorID() {
        return profesorID;
    }

    public void setProfesorID(Profesor profesorID) {
        this.profesorID = profesorID;
    }

    public Aula getAulaID() {
        return aulaID;
    }

    public void setAulaID(Aula aulaID) {
        this.aulaID = aulaID;
    }

    public Materia getMateriaID() {
        return materiaID;
    }

    public void setMateriaID(Materia materiaID) {
        this.materiaID = materiaID;
    }
}
