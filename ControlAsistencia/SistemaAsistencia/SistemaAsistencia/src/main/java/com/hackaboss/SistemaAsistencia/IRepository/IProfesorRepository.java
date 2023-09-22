package com.hackaboss.SistemaAsistencia.IRepository;

import com.hackaboss.SistemaAsistencia.Entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProfesorRepository extends JpaRepository<Profesor,Long> {
    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
     ** Mostrar lista por orden alfabético.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " nombre," +
            " primer_apellido," +
            " segundo_apellido," +
            " dni," +
            " correo," +
            " telefono," +
            " tipo_vinculacion" +
            " FROM " +
            " profesor" +
            " ORDER BY primer_apellido ASC ", nativeQuery = true)
    List<Profesor> findOrderByNameTeacher();

    /**
     ** Mostrar lista por orden alfabético por nombre de la persona.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " nombre," +
            " primer_apellido," +
            " segundo_apellido," +
            " dni," +
            " correo," +
            " telefono," +
            " tipo_vinculacion " +
            " FROM " +
            " profesor " +
            " WHERE nombre_profesor = :nameTeacher " +
            " ORDER BY primer_nombre ASC;", nativeQuery = true)
    List<Profesor> findListByNameTeacher(@Param("nameTeacher") String nameTeacher);
}
