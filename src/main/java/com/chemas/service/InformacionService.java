package com.chemas.service;

import com.chemas.domain.Informacion;
import java.util.List;

public interface InformacionService {

    //Se obtiene un listado de informacions en un list -Read
    public List<Informacion> getInformacion(boolean activos);
  
}
