package com.chemas.service.impl;

import com.chemas.dao.EuroCopaDao;
import com.chemas.domain.EuroCopa;
import com.chemas.service.EuroCopaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EuroCopaServiceImpl implements EuroCopaService {

    @Autowired
    private EuroCopaDao euroCopaDao;

    @Override
    public List<EuroCopa> listarEuroCopa() {
        return euroCopaDao.findAll();
    }

    @Override
    public EuroCopa encontrarEuroCopaPorId(Long id) {
        return euroCopaDao.findById(id).orElse(null);
    }

    @Override
    public void guardarEuroCopa(EuroCopa euroCopa) {
        euroCopaDao.save(euroCopa);
    }

    @Override
    public void eliminarEuroCopa(Long id) {
        euroCopaDao.deleteById(id);
    }

    @Override
    public List<EuroCopa> listarEuroCopaPorTipo(String tipo) {
        return euroCopaDao.findByTipo(tipo);
    }
}
