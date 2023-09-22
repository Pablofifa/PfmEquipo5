package com.hackaboss.SistemaAsistencia.IRepository;

import com.hackaboss.SistemaAsistencia.Entity.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMateriaRepository extends JpaRepository<Materia,Long> {
    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
     ** Mostrar lista por orden alfabético.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " codigo," +
            " materia," +
            " descripcion," +
            " FROM " +
            " materia" +
            "ORDER BY materia ASC", nativeQuery = true)
    List<Materia> findOrderByNameSubject();

    /**
     ** Mostrar lista por orden alfabético por nombre de la materia.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " codigo," +
            " materia," +
            " descripcion," +
            " FROM " +
            " materia" +
            " WHERE nombre_materia = :nameSubject " +
            " ORDER BY materia ASC;", nativeQuery = true)
    List<Materia> findListByNameSubject(@Param("nameSubject") String nameSubject);
}
