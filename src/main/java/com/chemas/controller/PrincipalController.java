package com.chemas.controller;

import com.chemas.domain.Principal;
import com.chemas.service.PrincipalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PrincipalController {

    @Autowired
    private PrincipalService principalService;

    @GetMapping("/")
    public String listar(Model model) {
        List<Principal> principal = principalService.listarPrincipal();
        model.addAttribute("principal", principal);
        return "index";
    }

}
