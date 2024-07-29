package com.chemas.service;

import com.chemas.domain.EuroCopa;
import java.util.List;

public interface EuroCopaService {

    List<EuroCopa> listarEuroCopa();

    EuroCopa encontrarEuroCopaPorId(Long id);

    void guardarEuroCopa(EuroCopa euroCopa);

    void eliminarEuroCopa(Long id);
    
    List<EuroCopa> listarEuroCopaPorTipo(String tipo);
}

