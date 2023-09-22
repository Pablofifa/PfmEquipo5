package com.hackaboss.SistemaAsistencia.IService;

import com.hackaboss.SistemaAsistencia.Entity.Aula;

import java.util.List;
import java.util.Optional;

public interface IAulaService {

    /**
     ** Método encargado de retornar la lista con todas las aulas
     ***/
    List<Aula> all();

    /**
     ** Método encargado de retornar un aula por medio del ID
     ***/
    Optional<Aula> findById(Long id);

    /**
     **Método encargado de guardar los datos del aula
     ***/
    Aula save(Aula aula);

    /**
     **Método encargado de modificar los datos del aula
     ***/
    void update(Long id, Aula aula);

    /**
     **Método encargado de eliminar un aula.
     ***/
    void delete(Long id);

    /**
     * *Método encargado retornar la lista de aulas por orden alfabético.
     ***/
    List<Aula> findOrderByClassName();
}
