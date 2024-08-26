package com.chemas.service.impl;

import com.chemas.dao.CopaAmericaDao;
import com.chemas.domain.CopaAmerica;
import com.chemas.service.CopaAmericaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CopaAmericaServiceImpl implements CopaAmericaService {

    @Autowired
    private CopaAmericaDao copaAmericaDao;

    @Override
    public List<CopaAmerica> listarCopaAmerica() {
        return copaAmericaDao.findAll();
    }

    @Override
    public CopaAmerica encontrarCopaAmericaPorId(Long id) {
        return copaAmericaDao.findById(id).orElse(null);
    }

    @Override
    public void guardarCopaAmerica(CopaAmerica copaAmerica) {
        copaAmericaDao.save(copaAmerica);
    }

    @Override
    public void eliminarCopaAmerica(Long id) {
        copaAmericaDao.deleteById(id);
    }

    @Override
    public List<CopaAmerica> listarCopaAmericaPorTipo(String tipo) {
        return copaAmericaDao.findByTipo(tipo);
    }

}
