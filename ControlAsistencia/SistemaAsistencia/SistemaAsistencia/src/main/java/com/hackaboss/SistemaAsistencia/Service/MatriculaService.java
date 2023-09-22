package com.hackaboss.SistemaAsistencia.Service;

import com.hackaboss.SistemaAsistencia.Entity.Materia;
import com.hackaboss.SistemaAsistencia.Entity.Matricula;
import com.hackaboss.SistemaAsistencia.IRepository.IMateriaRepository;
import com.hackaboss.SistemaAsistencia.IRepository.IMatriculaRepository;
import com.hackaboss.SistemaAsistencia.IService.IMateriaService;
import com.hackaboss.SistemaAsistencia.IService.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MatriculaService implements IMatriculaService {

    @Autowired
    private IMatriculaRepository repository;

    @Override
    public List<Matricula> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Matricula> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Matricula save(Matricula matricula) {
        return repository.save(matricula);
    }

    @Override
    public void update(Long id, Matricula matricula) {
        //op es el objeto que va validar si existe un registro con el id que llega por parametro [id]
        Optional<Matricula> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Matricula matriculaUpdate = op.get();
            matriculaUpdate.setEstudianteID(matricula.getEstudianteID());
            matriculaUpdate.setMateriaID(matricula.getMateriaID());

            //Actualizar el objeto
            repository.save(matriculaUpdate);
        }

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Matricula> findOrderByIdNumber() { return repository.findOrderByIdNumber();    }
}
