package com.hackaboss.SistemaAsistencia.Controller;

import com.hackaboss.SistemaAsistencia.Entity.Profesor;
import com.hackaboss.SistemaAsistencia.IService.IProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Profesor")
public class ProfesorController {
    @Autowired
    private IProfesorService service;

    @GetMapping()
    public List<Profesor> all() {
        return service.all();
    }
    @GetMapping("{id}")
    public Optional<Profesor> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Profesor save(@RequestBody Profesor profesor) {
        return service.save(profesor);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Profesor profesor) {
        service.update(id, profesor);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
