package com.chemas.controller;

import com.chemas.domain.Informacion;
import com.chemas.service.InformacionService;
import com.chemas.service.impl.FirebaseStorageServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/informacion")
public class InformacionController {
    
    @Autowired
    private InformacionService informacionService;

    @GetMapping("/listado")
    public String inicio(Model model) {
        var informacion = informacionService.getInformacion(false);
        model.addAttribute("informacion", informacion);
        model.addAttribute("totalInformacion", informacion.size());
        return "/informacion/listado";
    }


    @Autowired
    private FirebaseStorageServiceImpl firebaseStorageService;

}

