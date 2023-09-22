package com.hackaboss.SistemaAsistencia.IService;

import com.hackaboss.SistemaAsistencia.Entity.Materia;

import java.util.List;
import java.util.Optional;

public interface IMateriaService {

    /**
     ** Método encargado de retornar la lista con todas las materias
     ***/
    List<Materia> all();

    /**
     ** Método encargado de retornar una materia por medio del ID
     ***/
    Optional<Materia> findById(Long id);

    /**
     **Método encargado de guardar los datos de la materia
     ***/
    Materia save(Materia materia);

    /**
     **Método encargado de modificar los datos de la materia
     ***/
    void update(Long id, Materia materia);

    /**
     **Método encargado de eliminar una materia
     ***/
    void delete(Long id);

    /**
     **Método encargado retornar la lista de materias por orden alfabético
     ***/
    List<Materia> findOrderByNameSubject();

    /**
     * *Método encargado retornar la lista de materias por orden alfabético por nombre de la materia.
     ***/
    List<Materia> findListByNameSubject(String nameStudent);
}
