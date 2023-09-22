package com.hackaboss.SistemaAsistencia.Service;

import com.hackaboss.SistemaAsistencia.Entity.HorarioMateria;
import com.hackaboss.SistemaAsistencia.IRepository.IHorarioMateriaRepository;
import com.hackaboss.SistemaAsistencia.IService.IHorarioMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HorarioMateriaService implements IHorarioMateriaService {
    @Autowired
    private IHorarioMateriaRepository repository;

    @Override
    public List<HorarioMateria> all() { return repository.findAll(); }

    @Override
    public Optional<HorarioMateria> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public HorarioMateria save(HorarioMateria horarioMateria) {
        return repository.save(horarioMateria);
    }

    @Override
    public void update(Long id, HorarioMateria horarioMateria) {
        //op es el objeto que va validar si existe un registro con el id que llega por parametro [id]
        Optional<HorarioMateria> op = repository.findById(id);

        if(op.isEmpty()){
            System.out.println("Dato no encontrado");
        }else{
            //Crear nuevo objeto que va a contener los datos que se van actualizar
            HorarioMateria horarioMateriaUpdate = op.get();
            horarioMateriaUpdate.setHoraEntrada(horarioMateria.getHoraEntrada());
            horarioMateriaUpdate.setHoraSalida(horarioMateria.getHoraSalida());
            horarioMateriaUpdate.setProfesorID(horarioMateria.getProfesorID());
            horarioMateriaUpdate.setAulaID(horarioMateria.getAulaID());
            horarioMateriaUpdate.setMateriaID(horarioMateria.getMateriaID());

            //Actualizar el objeto
            repository.save(horarioMateriaUpdate);
        }
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public List<HorarioMateria> findOrderByDateClass() {
        return repository.findOrderByDateClass();
    }


}