package com.hackaboss.SistemaAsistencia.IRepository;

import com.hackaboss.SistemaAsistencia.Entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IMatriculaRepository extends JpaRepository<Matricula,Long> {
    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
     * * Mostrar lista por orden de número de matrícula.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " estudiante_id," +
            " materia_id," +
            " FROM " +
            " matricula " +
            " ORDER BY id ASC", nativeQuery = true)
    List<Matricula> findOrderByIdNumber();


}
