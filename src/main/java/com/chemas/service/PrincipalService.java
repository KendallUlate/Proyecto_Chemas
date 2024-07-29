/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.chemas.service;

import com.chemas.domain.Principal;
import java.util.List;

/**
 *
 * @author XPC
 */
public interface PrincipalService {

    List<Principal> listarPrincipal();

    Principal encontrarPrincipalPorId(Long id);

    void guardarPrincipal(Principal principal);

    void eliminarPrincipal(Long id);
}
