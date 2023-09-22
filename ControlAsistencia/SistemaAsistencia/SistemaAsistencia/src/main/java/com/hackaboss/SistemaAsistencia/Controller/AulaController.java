package com.hackaboss.SistemaAsistencia.Controller;

import com.hackaboss.SistemaAsistencia.Entity.Aula;
import com.hackaboss.SistemaAsistencia.IService.IAulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Aula")
public class AulaController {
    @Autowired
    private IAulaService service;

    @GetMapping()
    public List<Aula> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Aula> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Aula save(@RequestBody Aula aula) {
        return service.save(aula);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Aula aula) {
        service.update(id, aula);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}