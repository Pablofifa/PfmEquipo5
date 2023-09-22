package com.hackaboss.SistemaAsistencia.Controller;

import com.hackaboss.SistemaAsistencia.Entity.HorarioMateria;
import com.hackaboss.SistemaAsistencia.IService.IHorarioMateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/HorarioMateria")
public class HorarioMateriaController {
    @Autowired
    private IHorarioMateriaService service;

    @GetMapping()
    public List<HorarioMateria> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<HorarioMateria> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public HorarioMateria save(@RequestBody HorarioMateria horarioMateria) {
        return service.save(horarioMateria);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody HorarioMateria horarioMateria) {
        service.update(id, horarioMateria);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}