package com.chemas.dao;

import com.chemas.domain.EuroCopa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EuroCopaDao extends JpaRepository<EuroCopa, Long>{
    List<EuroCopa> findByTipo(String tipo);
}
