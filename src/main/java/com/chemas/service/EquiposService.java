
package com.chemas.service;

import com.chemas.domain.Equipos;
import java.util.List;

public interface EquiposService {
    
    List<Equipos> listarEquipos();

    Equipos encontrarEquiposPorId(Long id);

    void guardarEquipos(Equipos equipos);

    void eliminarEquipos(Long id);
    
    List<Equipos> listarEquiposPorTipo(String tipo);
}
