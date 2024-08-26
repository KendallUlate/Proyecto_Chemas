package com.chemas.dao;

import com.chemas.domain.Compra;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompraDao extends JpaRepository<Compra, Long> {
    
}
