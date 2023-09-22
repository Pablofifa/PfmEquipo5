package com.hackaboss.SistemaAsistencia.IRepository;

import com.hackaboss.SistemaAsistencia.Entity.Asistencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAsistenciaRepository extends JpaRepository<Asistencia,Long> {
    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
     ** Mostrar lista por orden de ID de asistencia.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " fecha_de_registro," +
            " asistencia," +
            " matriculaID" +
            " FROM " +
            " asistencia " +
            " ORDER BY id ASC ", nativeQuery = true)
    List<Asistencia> findOrderByNumberId();

    /**
     ** Mostrar lista por orden de fecha.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " fecha_de_registro," +
            " asistencia," +
            " matriculaID" +
            " FROM " +
            " asistencia " +
            " ORDER BY fecha_de_registro ASC ", nativeQuery = true)
    List<Asistencia> findOrderByDateId();


}
