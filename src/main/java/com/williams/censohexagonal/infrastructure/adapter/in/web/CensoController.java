package com.williams.censohexagonal.infrastructure.adapter.in.web;

import com.williams.censohexagonal.domain.model.Censo;
import com.williams.censohexagonal.domain.port.in.CensoUseCases;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/censos")
@CrossOrigin("*")
public class CensoController {

    private final CensoUseCases service;

    public CensoController(CensoUseCases service) {
        this.service = service;
    }

    @PostMapping
    public Censo crear(@RequestBody Censo censo) {
        return service.crearCenso(censo);
    }

    @GetMapping
    public List<Censo> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public Censo obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PutMapping("/{id}")
    public Censo actualizar(@PathVariable Long id, @RequestBody Censo censo) {
        return service.actualizarCenso(id, censo);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminarCenso(id);
    }
}
