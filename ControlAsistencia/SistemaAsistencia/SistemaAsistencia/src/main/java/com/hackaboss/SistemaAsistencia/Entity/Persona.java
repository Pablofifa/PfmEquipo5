package com.hackaboss.SistemaAsistencia.Entity;

import jakarta.persistence.*;

//@Entity
//@Table(name = "persona")
@MappedSuperclass
public class Persona {

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //private Long id;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "primer_apellido", length = 50, nullable = false)
    private String primerApellido;
    @Column(name = "segundo_apellido", length = 50, nullable = false)
    private String segundoApellido;
    @Column(name = "dni", length = 255, nullable = false, unique = true)
    private String dni;
    @Column(name = "correo", length = 255, nullable = false, unique = true)
    private String correo;
    @Column(name = "telefono", length = 20, nullable = true, unique = true)
    private String telefono;
    @Column(name = "usuario", length = 20, nullable = true, unique = true)
    private String usuario;

    @Column(name = "contrasenia", length = 20, nullable = true, unique = true)
    private String contrasenia;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
