package com.hackaboss.SistemaAsistencia.IService;

import com.hackaboss.SistemaAsistencia.Entity.HorarioMateria;

import java.util.List;
import java.util.Optional;

public interface IHorarioMateriaService {


        /**
         * * Método encargado de retornar la lista con todos los horarios.
         ***/
        List<HorarioMateria> all();

        /**
         ** Método encargado de retornar un horario por medio del ID
         ***/
        Optional<HorarioMateria> findById(Long id);

        /**
         **Método encargado de guardar los datos del horario
         ***/
        HorarioMateria save(HorarioMateria horarioMateria);

        /**
         **Método encargado de modificar los datos del horario
         ***/
        void update(Long id, HorarioMateria horarioMateria);

        /**
         **Método encargado de eliminar un horario
         ***/
        void delete(Long id);
    /**
     **Método encargado retornar la lista de horarios por orden alfabético.
     ***/
    List<HorarioMateria> findOrderByDateClass();
}
