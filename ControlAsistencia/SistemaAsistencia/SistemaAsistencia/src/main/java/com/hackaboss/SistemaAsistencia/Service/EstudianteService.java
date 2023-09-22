package com.hackaboss.SistemaAsistencia.Service;

import com.hackaboss.SistemaAsistencia.Entity.Estudiante;
import com.hackaboss.SistemaAsistencia.IRepository.IEstudianteRepository;
import com.hackaboss.SistemaAsistencia.IService.IEstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteService implements IEstudianteService {
    @Autowired
    private IEstudianteRepository repository;

    @Override
    public List<Estudiante> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Estudiante> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Estudiante save(Estudiante estudiante) {
        return repository.save(estudiante);
    }

    @Override
    public void update(Long id, Estudiante estudiante) {
        //op es el objeto que va validar si existe un registro con el id que llega por parametro [id]
        Optional<Estudiante> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Estudiante estudianteUpdate = op.get();
            estudianteUpdate.setNombre(estudiante.getNombre());
            estudianteUpdate.setPrimerApellido(estudiante.getPrimerApellido());
            estudianteUpdate.setSegundoApellido(estudiante.getSegundoApellido());
            estudianteUpdate.setDni(estudiante.getDni());
            estudianteUpdate.setCorreo(estudiante.getCorreo());
            estudianteUpdate.setTelefono(estudiante.getTelefono());
            estudianteUpdate.setUsuario(estudiante.getUsuario());
            estudianteUpdate.setContrasenia(estudiante.getContrasenia());

            //Actualizar el objeto
            repository.save(estudianteUpdate);
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Estudiante> findOrderByNameStudent() {
        return repository.findOrderByNameStudent();
    }

    @Override
    public List<Estudiante> findListByNameStudent(String nameStudent) {
        return repository.findListByNameStudent(nameStudent);
    }
}
