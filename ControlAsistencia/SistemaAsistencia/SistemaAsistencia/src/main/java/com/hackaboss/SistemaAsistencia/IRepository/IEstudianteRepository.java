package com.hackaboss.SistemaAsistencia.IRepository;

import com.hackaboss.SistemaAsistencia.Entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante,Long> {
    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
    ** Mostrar lista por orden alfabético del primer apellido.
    ***/
    @Query(value = "SELECT " +
            " id," +
            " nombre," +
            " primer_apellido," +
            " segundo_apellido," +
            " dni," +
            " correo," +
            " telefono," +
            " usuario," +
            " contrasenia," +
            " FROM " +
            " estudiante " +
            " ORDER BY primer_apellido ASC", nativeQuery = true)
    List<Estudiante> findOrderByNameStudent();

    /**
     ** Mostrar lista por orden alfabético del primer apellido de la persona.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " nombre," +
            " primer_apellido," +
            " segundo_apellido," +
            " dni," +
            " correo," +
            " telefono," +
            " usuario," +
            " contrasenia," +
            " FROM " +
            " estudiante " +
            " WHERE nombre_estudiante = :nameStudent " +
            " ORDER BY primer_apellido ASC;", nativeQuery = true)
    List<Estudiante> findListByNameStudent(@Param("nameStudent") String nameStudent);
}
