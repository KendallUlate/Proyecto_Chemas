
package com.chemas.controller;

import com.chemas.domain.CopaAmerica;
import com.chemas.service.CopaAmericaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
    
        @GetMapping("/actualizar/{id}")
    public String mostrarFormularioActualizar(@PathVariable("id") Long id, Model model) {
        CopaAmerica copaAmerica = copaAmericaService.encontrarCopaAmericaPorId(id);
        if (copaAmerica != null) {
            model.addAttribute("copaAmerica", copaAmerica);
            return "copaAmerica/actualizar";
        }
        return "redirect:/copaAmerica/listado";
    }

    @PostMapping("/guardar")
    public String guardar(@ModelAttribute CopaAmerica copaAmerica) {
        copaAmericaService.guardarCopaAmerica(copaAmerica);
        return "redirect:/copaAmerica/listado";
    }

    @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable("id") Long id) {
        copaAmericaService.eliminarCopaAmerica(id);
        return "redirect:/copaAmerica/listado";
    }
}

