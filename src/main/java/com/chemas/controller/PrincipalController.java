/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chemas.controller;

import com.chemas.domain.Principal;
import com.chemas.service.PrincipalService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author XPC
 */
@Controller
public class PrincipalController {

    @Autowired
    private PrincipalService principalService;

    @GetMapping("/")
    public String listar(Model model) {
        List<Principal> principals = principalService.listarPrincipal();
        model.addAttribute("principals", principals);
        return "index";
    }

}
