package com.hackaboss.SistemaAsistencia.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "aula")
public class Aula {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "nombre_aula", length = 255, nullable = false)
        private String nombreAula;

        @Column(name = "ubicacion", length = 255, nullable = false)
        private String ubicacion;

        public Long getId() {
                return id;
        }

        public void setId(Long id) {
                this.id = id;
        }

        public String getNombreAula() {
                return nombreAula;
        }

        public void setNombreAula(String nombreAula) {
                this.nombreAula = nombreAula;
        }

        public String getUbicacion() {
                return ubicacion;
        }

        public void setUbicacion(String ubicacion) {
                this.ubicacion = ubicacion;
        }
}
