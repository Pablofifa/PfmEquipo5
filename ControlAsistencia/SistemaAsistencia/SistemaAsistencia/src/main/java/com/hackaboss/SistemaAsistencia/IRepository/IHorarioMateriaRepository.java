package com.hackaboss.SistemaAsistencia.IRepository;

import com.hackaboss.SistemaAsistencia.Entity.HorarioMateria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IHorarioMateriaRepository extends JpaRepository<HorarioMateria,Long> {
    //Construir métodos personalizados - en este espacio se puede construir sql native.

    /**
    ** Mostrar lista por orden de fecha de clase.
    ***/
    @Query(value = "SELECT " +
            " id," +
            " fecha_clase," +
            " hora_inicio," +
            " hora_finalizacion," +
            " profesorId," +
            " aulaId," +
            " materiaId," +
            " horario " +
            " ORDER BY fechaClase ASC", nativeQuery = true)
    List<HorarioMateria> findOrderByDateClass();


}
