package com.hackaboss.SistemaAsistencia.IRepository;

import com.hackaboss.SistemaAsistencia.Entity.Aula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IAulaRepository extends JpaRepository<Aula,Long> {
    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
     ** Mostrar lista de aulas por orden alfabetico.
     ***/
    @Query(value = "SELECT " +
            " id," +
            " nombre_aula," +
            " ubicacion," +
            " FROM " +
            " aula " +
            " ORDER BY nombre_aula ASC", nativeQuery = true)
    List<Aula> findOrderByClassName();


}
