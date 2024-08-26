package com.chemas.service.impl;

import com.chemas.dao.CompraDao;
import com.chemas.domain.Compra;
import com.chemas.service.CompraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CompraServiceImpl implements CompraService {

    @Autowired
    private CompraDao compraDao;

    @Override
    @Transactional(readOnly = true)
    public List<Compra> getCompras() {
        return compraDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Compra getCompra(Long idCompra) {
        return compraDao.findById(idCompra).orElse(null);
    }

    @Override
    @Transactional
    public void save(Compra compra) {
        compraDao.save(compra);
    }

    @Override
    @Transactional
    public void delete(Long idCompra) {
        compraDao.deleteById(idCompra);
    }
    
}
