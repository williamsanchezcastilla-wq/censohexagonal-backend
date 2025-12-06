package com.williams.censohexagonal.domain.port.out;

import com.williams.censohexagonal.domain.model.Censo;
import java.util.List;
import java.util.Optional;

public interface CensoRepositoryPort {

    Censo save(Censo censo);
    Optional<Censo> findById(Long id);
    List<Censo> findAll();
    void deleteById(Long id);

}
