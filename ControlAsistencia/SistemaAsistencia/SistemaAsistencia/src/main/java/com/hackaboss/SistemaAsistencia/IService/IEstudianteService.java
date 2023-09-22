package com.hackaboss.SistemaAsistencia.IService;

import com.hackaboss.SistemaAsistencia.Entity.Estudiante;

import java.util.List;
import java.util.Optional;

public interface IEstudianteService {

    /**
     * * Método encargado de retornar la lista con todos los estudiantes
     ***/
    List<Estudiante> all();

    /**
    ** Método encargado de retornar un estudiante por medio del ID
    ***/
    Optional<Estudiante> findById(Long id);

    /**
     **Método encargado de guardar los datos del estudiante
     ***/
    Estudiante save(Estudiante estudiante);

    /**
    **Método encargado de modificar los datos del estudiante
    ***/
    void update(Long id, Estudiante estudiante);

    /**
    **Método encargado de eliminar un estudiante
    ***/
    void delete(Long id);

    /**
     **Método encargado retornar la lista de estudiantes por orden alfabético
     ***/
    List<Estudiante> findOrderByNameStudent();

    /**
     **Método encargado retornar la lista de estudiantes por orden alfabético por nombre específico.
     ***/
    List<Estudiante> findListByNameStudent(String nameStudent);
}
