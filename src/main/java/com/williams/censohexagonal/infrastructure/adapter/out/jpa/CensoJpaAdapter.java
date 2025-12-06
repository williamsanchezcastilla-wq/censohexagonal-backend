package com.williams.censohexagonal.infrastructure.adapter.out.jpa;

import com.williams.censohexagonal.domain.model.Censo;
import com.williams.censohexagonal.domain.port.out.CensoRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CensoJpaAdapter implements CensoRepositoryPort {

    private final CensoRepositoryJpa jpa;

    public CensoJpaAdapter(CensoRepositoryJpa jpa) {
        this.jpa = jpa;
    }

    private Censo mapToDomain(CensoEntity e) {
        return new Censo(
                e.getId(),
                e.getNombre(),
                e.getApellido(),
                e.getEdad(),
                e.getSexo(),
                e.getDireccion(),
                e.getMunicipio(),
                e.getEstrato(),
                e.getNivelEducativo(),
                e.getFechaRegistro()
        );
    }

    private CensoEntity mapToEntity(Censo d) {
        CensoEntity e = new CensoEntity();
        e.setId(d.getId());
        e.setNombre(d.getNombre());
        e.setApellido(d.getApellido());
        e.setEdad(d.getEdad());
        e.setSexo(d.getSexo());
        e.setDireccion(d.getDireccion());
        e.setMunicipio(d.getMunicipio());
        e.setEstrato(d.getEstrato());
        e.setNivelEducativo(d.getNivelEducativo());
        e.setFechaRegistro(d.getFechaRegistro());
        return e;
    }

    @Override
    public Censo save(Censo censo) {
        return mapToDomain(jpa.save(mapToEntity(censo)));
    }

    @Override
    public Optional<Censo> findById(Long id) {
        return jpa.findById(id).map(this::mapToDomain);
    }

    @Override
    public List<Censo> findAll() {
        return jpa.findAll()
                .stream()
                .map(this::mapToDomain)
                .toList();
    }

    @Override
    public void deleteById(Long id) {
        jpa.deleteById(id);
    }
}
