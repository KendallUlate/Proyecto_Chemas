package com.chemas.controller;

import com.chemas.domain.EuroCopa;
import com.chemas.service.EuroCopaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/euroCopa")
public class EuroCopaController {

    @Autowired
    private EuroCopaService euroCopaService;

    @GetMapping("/listado")
    public String listar(Model model) {
        List<EuroCopa> euroCopa = euroCopaService.listarEuroCopaPorTipo("Euro Copa");
        model.addAttribute("euroCopa", euroCopa);
        return "euroCopa/listado";
    }
}
