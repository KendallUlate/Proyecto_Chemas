
package com.chemas.dao;

import com.chemas.domain.CopaAmerica;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CopaAmericaDao extends JpaRepository<CopaAmerica, Long>{
    List<CopaAmerica> findByTipo(String tipo);
}
