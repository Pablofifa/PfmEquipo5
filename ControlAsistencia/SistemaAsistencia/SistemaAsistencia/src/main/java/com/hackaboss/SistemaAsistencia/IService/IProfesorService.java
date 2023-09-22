package com.hackaboss.SistemaAsistencia.IService;

import com.hackaboss.SistemaAsistencia.Entity.Profesor;

import java.util.List;
import java.util.Optional;

public interface IProfesorService {

    /**
     * * Método encargado de retornar la lista con todos los profesores
     ***/
    List<Profesor> all();

    /**
     ** Método encargado de retornar un profesor por medio del ID
     ***/
    Optional<Profesor> findById(Long id);

    /**
     **Método encargado de guardar los datos del profesor
     ***/
    Profesor save(Profesor Profesor);

    /**
     **Método encargado de modificar los datos del profesor
     ***/
    void update(Long id, Profesor profesor);

    /**
     **Método encargado de eliminar un profesor
     ***/
    void delete(Long id);

    /**
     **Método encargado retornar la lista de profesores por orden alfabético
     ***/
    List<Profesor> findOrderByNameTeacher();

    /**
     **Método encargado retornar la lista de profesores por orden alfabético por nombre específico.
     ***/
    List<Profesor> findListByNameTeacher(String nameTeacher);
}
