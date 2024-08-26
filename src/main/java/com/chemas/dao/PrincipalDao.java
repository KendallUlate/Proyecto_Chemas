package com.chemas.dao;

import com.chemas.domain.Principal;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrincipalDao extends JpaRepository<Principal, Long>{
    List<Principal> findByTipo(String tipo);
}
