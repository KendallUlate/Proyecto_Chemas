package com.chemas.service;

import com.chemas.domain.Compra;
import java.util.List;

public interface CompraService {

    // Método para obtener todas las compras
    List<Compra> getCompras();

    // Método para obtener una compra por id
    Compra getCompra(Long idCompra);

    // Método para guardar o actualizar una compra
    void save(Compra compra);

    // Método para eliminar una compra
    void delete(Long idCompra);
    
    
    
}
