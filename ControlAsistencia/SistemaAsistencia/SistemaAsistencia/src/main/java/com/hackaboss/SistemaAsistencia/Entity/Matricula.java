package com.hackaboss.SistemaAsistencia.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "matricula", uniqueConstraints = {
	    @UniqueConstraint(columnNames = {"materia_id", "estudiante_id"})
	})
public class Matricula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "materia_id", nullable = false)
    private Materia materiaID;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "estudiante_id", nullable = false)
    private Estudiante estudianteID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Materia getMateriaID() {
        return materiaID;
    }

    public void setMateriaID(Materia materiaID) {
        this.materiaID = materiaID;
    }

    public Estudiante getEstudianteID() {
        return estudianteID;
    }

    public void setEstudianteID(Estudiante estudianteID) {
        this.estudianteID = estudianteID;
    }
}
