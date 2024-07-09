package com.example.helpmeiud.controller;

import com.example.helpmeiud.model.Delito;
import com.example.helpmeiud.service.DelitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class DelitoController {

    @Autowired
    private DelitoService delitoService;

    @GetMapping("/delitos")
    public String getAllDelitos(Model model) {
        List<Delito> delitos = delitoService.getAllDelitos();
        model.addAttribute("delitos", delitos);
        return "delitos"; // Esto asume que tienes una vista llamada "delitos.html"
    }
}
