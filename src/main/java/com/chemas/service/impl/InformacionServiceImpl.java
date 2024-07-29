package com.chemas.service.impl;

import com.chemas.dao.InformacionDao;
import com.chemas.domain.Informacion;
import com.chemas.service.InformacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class InformacionServiceImpl implements InformacionService {

    @Autowired
    private InformacionDao informacionDao;

    @Override
    @Transactional(readOnly = true)
    public List<Informacion> getInformacion(boolean activos) {
        var lista = informacionDao.findAll();
        if (activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        return lista;
    }

}
