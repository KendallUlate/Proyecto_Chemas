
package com.chemas.controller;

import com.chemas.domain.CopaAmerica;
import com.chemas.service.CopaAmericaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/copaAmerica")
public class CopaAmericaController {
    
    @Autowired
    private CopaAmericaService copaAmericaService;
    
    @GetMapping("/listado")
    public String listar(Model model) {
        List<CopaAmerica> copaAmerica = copaAmericaService.listarCopaAmericaPorTipo("Copa America");
        model.addAttribute("copaAmerica", copaAmerica);
        return "copaAmerica/listado";
}
}
