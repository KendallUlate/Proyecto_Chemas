
package com.chemas.service;

import com.chemas.domain.CopaAmerica;
import java.util.List;

public interface CopaAmericaService {
    
    List<CopaAmerica> listarCopaAmerica();

    CopaAmerica encontrarCopaAmericaPorId(Long id);

    void guardarCopaAmerica(CopaAmerica copaAmerica);

    void eliminarCopaAmerica(Long id);
    
    List<CopaAmerica> listarCopaAmericaPorTipo(String tipo);
}
