package com.hackaboss.SistemaAsistencia.Service;

import com.hackaboss.SistemaAsistencia.Entity.Asistencia;
import com.hackaboss.SistemaAsistencia.IRepository.IAsistenciaRepository;
import com.hackaboss.SistemaAsistencia.IService.IAsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AsistenciaService implements IAsistenciaService {

    @Autowired
    private IAsistenciaRepository repository;

    @Override
    public List<Asistencia> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Asistencia> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Asistencia save(Asistencia asistencia) {
    	asistencia.setFecha(LocalDateTime.now());
        return repository.save(asistencia);
    }

    @Override
    public void update(Long id, Asistencia asistencia) {
        //op es el objeto que va validar si existe un registro con el id que llega por parametro [id]
        Optional<Asistencia> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Asistencia asistenciaUpdate = op.get();
            asistenciaUpdate.setFecha(asistencia.getFecha());
            asistenciaUpdate.setEstadoDeAsistencia(asistencia.getEstadoDeAsistencia());
            asistenciaUpdate.setMatriculaID(asistencia.getMatriculaID());


            //Actualizar el objeto
            repository.save(asistenciaUpdate);
        }

    }

    @Override
    public List<Asistencia> findOrderByDateId() { return repository.findOrderByDateId(); }


    @Override
    public List<Asistencia> findOrderByNumberId() { return repository.findOrderByNumberId(); }

    @Override
    public void delete(Long id) {



    }
}
