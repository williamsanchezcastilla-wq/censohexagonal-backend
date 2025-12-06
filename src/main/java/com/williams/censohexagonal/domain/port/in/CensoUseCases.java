package com.williams.censohexagonal.domain.port.in;

import com.williams.censohexagonal.domain.model.Censo;
import java.util.List;

public interface CensoUseCases {

    Censo crearCenso(Censo censo);
    Censo obtenerPorId(Long id);
    List<Censo> listarTodos();
    Censo actualizarCenso(Long id, Censo censo);
    void eliminarCenso(Long id);

}
