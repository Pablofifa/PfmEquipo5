package com.hackaboss.SistemaAsistencia.Service;

import com.hackaboss.SistemaAsistencia.Entity.Materia;
import com.hackaboss.SistemaAsistencia.IRepository.IMateriaRepository;
import com.hackaboss.SistemaAsistencia.IService.IMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MateriaService implements IMateriaService {

    @Autowired
    private IMateriaRepository repository;

    @Override
    public List<Materia> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Materia> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Materia save(Materia materia) {
        return repository.save(materia);
    }

    @Override
    public void update(Long id, Materia materia) {
        //op es el objeto que va validar si existe un registro con el id que llega por parametro [id]
        Optional<Materia> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Materia materiaUpdate = op.get();
            materiaUpdate.setCodigo(materia.getCodigo());
            materiaUpdate.setNombreMateria(materia.getNombreMateria());
            materiaUpdate.setDescripcion(materia.getDescripcion());

            //Actualizar el objeto
            repository.save(materiaUpdate);
        }

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Materia> findOrderByNameSubject() { return repository.findOrderByNameSubject();    }

    @Override
    public List<Materia> findListByNameSubject(String nameStudent) {
        return repository.findListByNameSubject(nameStudent);
    }
}
