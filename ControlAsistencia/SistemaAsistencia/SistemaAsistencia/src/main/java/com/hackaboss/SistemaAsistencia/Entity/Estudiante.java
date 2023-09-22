package com.hackaboss.SistemaAsistencia.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "estudiante")
public class Estudiante extends Persona{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
 
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
