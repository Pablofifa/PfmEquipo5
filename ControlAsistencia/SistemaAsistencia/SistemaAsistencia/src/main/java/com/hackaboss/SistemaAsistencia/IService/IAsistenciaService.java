package com.hackaboss.SistemaAsistencia.IService;

import com.hackaboss.SistemaAsistencia.Entity.Asistencia;
import com.hackaboss.SistemaAsistencia.Entity.Estudiante;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public interface IAsistenciaService {
    /**
     * * Método encargado de retornar la lista con todas las asistencias
     ***/
    List<Asistencia> all();

    /**
     ** Método encargado de retornar una asistencia por medio del ID
     ***/
    Optional<Asistencia> findById(Long id);

    /**
     **Método encargado de guardar los datos de las asistencias
     ***/
    Asistencia save(Asistencia asistencia);

    /**
     **Método encargado de modificar los datos de las asistencias
     ***/
    void update(Long id, Asistencia asistencia);

    /**
     **Método encargado de eliminar una asistencia
     ***/
    void delete(Long id);

    /**
     **Método encargado retornar la lista de asistencias por ID
     ***/
    List<Asistencia> findOrderByNumberId();

    /**
     **Método encargado retornar la lista de asistencias por fecha
     ***/
    List<Asistencia> findOrderByDateId();
}
