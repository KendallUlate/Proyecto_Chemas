package com.chemas.dao;

import com.chemas.domain.Equipos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquiposDao extends JpaRepository<Equipos, Long>{
    List<Equipos> findByTipo(String tipo);
}
