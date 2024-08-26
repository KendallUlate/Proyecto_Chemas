package com.chemas.service.impl;

import com.chemas.dao.EquiposDao;
import com.chemas.domain.Equipos;
import com.chemas.service.EquiposService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EquiposServiceImpl implements EquiposService {

    @Autowired
    private EquiposDao equiposDao;

    @Override
    public List<Equipos> listarEquipos() {
        return equiposDao.findAll();
    }

    @Override
    public Equipos encontrarEquiposPorId(Long id) {
        return equiposDao.findById(id).orElse(null);
    }

    @Override
    public void guardarEquipos(Equipos equipos) {
        equiposDao.save(equipos);
    }

    @Override
    public void eliminarEquipos(Long id) {
        equiposDao.deleteById(id);
    }

    @Override
    public List<Equipos> listarEquiposPorTipo(String tipo) {
        return equiposDao.findByTipo(tipo);
    }

}

