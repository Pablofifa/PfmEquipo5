package com.hackaboss.SistemaAsistencia.Service;

import com.hackaboss.SistemaAsistencia.Entity.Aula;
import com.hackaboss.SistemaAsistencia.IRepository.IAulaRepository;
import com.hackaboss.SistemaAsistencia.IService.IAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AulaService implements IAulaService {

    @Autowired
    private IAulaRepository repository;

    @Override
    public List<Aula> all() {
        return repository.findAll();
    }

    @Override
    public Optional<Aula> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public Aula save(Aula aula) {
        return repository.save(aula);
    }

    @Override
    public void update(Long id, Aula aula) {
        //op es el objeto que va validar si existe un registro con el id que llega por parametro [id]
        Optional<Aula> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            Aula aulaUpdate = op.get();
            aulaUpdate.setNombreAula(aula.getNombreAula());
            aulaUpdate.setUbicacion(aula.getUbicacion());


            //Actualizar el objeto
            repository.save(aulaUpdate);
        }

    }

    @Override
    public List<Aula> findOrderByClassName() { return repository.findOrderByClassName(); }

    @Override
    public void delete(Long id) {

    }
}
