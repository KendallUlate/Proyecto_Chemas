package com.chemas.controller;

import com.chemas.domain.Equipos;
import com.chemas.service.EquiposService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/equipos")
public class EquiposController {
    
    @Autowired
    private EquiposService equiposService;
    
    @GetMapping("/listado")
    public String listar(Model model) {
        List<Equipos> equipos = equiposService.listarEquiposPorTipo("Equipos");
        model.addAttribute("equipos", equipos);
        return "equipos/listado";
}
}
