package com.hackaboss.SistemaAsistencia.IService;

import com.hackaboss.SistemaAsistencia.Entity.Materia;
import com.hackaboss.SistemaAsistencia.Entity.Matricula;

import java.util.List;
import java.util.Optional;

public interface IMatriculaService {

    /**
     ** Método encargado de retornar la lista con todas las matrículas
     ***/
    List<Matricula> all();

    /**
     ** Método encargado de retornar una matrícula por medio del ID
     ***/
    Optional<Matricula> findById(Long id);

    /**
     **Método encargado de guardar los datos de la matrícula
     ***/
    Matricula save(Matricula matricula);

    /**
     **Método encargado de modificar los datos de la matrícula
     ***/
    void update(Long id, Matricula matricula);

    /**
     **Método encargado de eliminar una matrícula
     ***/
    void delete(Long id);

    /**
     **Método encargado de mostrar una lista por número de matrícula
     ***/
    List<Matricula> findOrderByIdNumber();

}
