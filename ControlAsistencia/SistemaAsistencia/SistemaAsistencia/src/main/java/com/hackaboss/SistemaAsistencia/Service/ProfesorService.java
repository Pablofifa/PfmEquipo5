package com.hackaboss.SistemaAsistencia.Service;

import com.hackaboss.SistemaAsistencia.Entity.Profesor;
import com.hackaboss.SistemaAsistencia.IRepository.IProfesorRepository;
import com.hackaboss.SistemaAsistencia.IService.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService implements IProfesorService {
    @Autowired
    private IProfesorRepository repository;

    @Override
    public List<Profesor> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Profesor> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Profesor save(Profesor profesor) {
        return repository.save(profesor);
    }

    @Override
    public void update(Long id, Profesor profesor) {
        //op es el objeto que va validar si existe un registro con el id que llega por parametro [id]
        Optional<Profesor> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Profesor profesorUpdate = op.get();
            profesorUpdate.setNombre(profesor.getNombre());
            profesorUpdate.setPrimerApellido(profesor.getPrimerApellido());
            profesorUpdate.setSegundoApellido(profesor.getSegundoApellido());
            profesorUpdate.setDni(profesor.getDni());
            profesorUpdate.setCorreo(profesor.getCorreo());
            profesorUpdate.setTelefono(profesor.getTelefono());
            profesorUpdate.setUsuario(profesor.getUsuario());
            profesorUpdate.setContrasenia(profesor.getContrasenia());
            profesorUpdate.setTipoVinculacion(profesor.getTipoVinculacion());

            //Actualizar el objeto
            repository.save(profesorUpdate);
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Profesor> findOrderByNameTeacher() {
        return repository.findOrderByNameTeacher();
    }

    @Override
    public List<Profesor> findListByNameTeacher(String nameTeacher) {
        return repository.findListByNameTeacher(nameTeacher);
    }
}
