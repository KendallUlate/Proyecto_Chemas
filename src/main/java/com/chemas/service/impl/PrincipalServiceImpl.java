package com.chemas.service.impl;

import com.chemas.dao.PrincipalDao;
import com.chemas.domain.Principal;
import com.chemas.service.PrincipalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrincipalServiceImpl implements PrincipalService {

    @Autowired
    private PrincipalDao principalDao;

    @Override
    public List<Principal> listarPrincipal() {
        return principalDao.findAll();
    }

    @Override
    public Principal encontrarPrincipalPorId(Long id) {
        return principalDao.findById(id).orElse(null);
    }

    @Override
    public void guardarPrincipal(Principal principal) {
        principalDao.save(principal);
    }

    @Override
    public void eliminarPrincipal(Long id) {
        principalDao.deleteById(id);
    }

}
