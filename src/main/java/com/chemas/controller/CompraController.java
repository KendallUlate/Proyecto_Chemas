package com.chemas.controller;

import com.chemas.domain.Compra;
import com.chemas.service.CompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/compra")
public class CompraController {

    @Autowired
    private CompraService compraService;

    @GetMapping("/nuevo")
    public String nuevaCompra(Model model) {
        model.addAttribute("compra", new Compra());
        return "compra/nuevaCompra"; // Asegúrate de tener una vista para esto
    }

    @PostMapping("/guardar")
    public String guardarCompra(Compra compra, Model model) {
        compraService.save(compra);
        model.addAttribute("compraExitosa", true);
        return "compra/confirmarCompra"; // Redirige a la vista de confirmación
    }

}
