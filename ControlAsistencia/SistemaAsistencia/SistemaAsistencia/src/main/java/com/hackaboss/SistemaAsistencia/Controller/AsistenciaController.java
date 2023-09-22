package com.hackaboss.SistemaAsistencia.Controller;

import com.hackaboss.SistemaAsistencia.Entity.Asistencia;
import com.hackaboss.SistemaAsistencia.IService.IAsistenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/Asistencia")
public class AsistenciaController {
    @Autowired
    private IAsistenciaService service;

    @GetMapping()
    public List<Asistencia> all() {
        return service.all();
    }

    @GetMapping("{id}")
    public Optional<Asistencia> show(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Asistencia save(@RequestBody Asistencia asistencia) {
        return service.save(asistencia);
    }

    @PutMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void update(@PathVariable Long id, @RequestBody Asistencia asistencia) {
        service.update(id, asistencia);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

}