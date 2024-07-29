package com.chemas.service;

import com.chemas.domain.Principal;
import java.util.List;

public interface PrincipalService {

    List<Principal> listarPrincipal();

    Principal encontrarPrincipalPorId(Long id);

    void guardarPrincipal(Principal principal);

    void eliminarPrincipal(Long id);
}
