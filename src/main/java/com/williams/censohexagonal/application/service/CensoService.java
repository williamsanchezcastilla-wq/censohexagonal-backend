package com.williams.censohexagonal.application.service;

import com.williams.censohexagonal.domain.model.Censo;
import com.williams.censohexagonal.domain.port.in.CensoUseCases;
import com.williams.censohexagonal.domain.port.out.CensoRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CensoService implements CensoUseCases {

    private final CensoRepositoryPort censoRepository;

    public CensoService(CensoRepositoryPort censoRepository) {
        this.censoRepository = censoRepository;
    }

    @Override
    public Censo crearCenso(Censo censo) {
        return censoRepository.save(censo);
    }

    @Override
    public Censo obtenerPorId(Long id) {
        return censoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Censo no encontrado: " + id));
    }

    @Override
    public List<Censo> listarTodos() {
        return censoRepository.findAll();
    }

    @Override
    public Censo actualizarCenso(Long id, Censo censo) {
        Censo actual = obtenerPorId(id);
        censo.setId(id);
        return censoRepository.save(censo);
    }

    @Override
    public void eliminarCenso(Long id) {
        censoRepository.deleteById(id);
    }
}
