package com.example.helpmeiud.controller;

import com.example.helpmeiud.model.Caso;
import com.example.helpmeiud.service.CasoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/casos")
public class CasoController {

    @Autowired
    private CasoService casoService;

    @PostMapping
    public ResponseEntity<Caso> createCaso(@RequestBody Caso caso) {
        Caso savedCaso = casoService.saveCaso(caso);
        return new ResponseEntity<>(savedCaso, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Caso>> getAllCasos() {
        List<Caso> casos = casoService.getAllCasos();
        return new ResponseEntity<>(casos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Caso> getCasoById(@PathVariable Long id) {
        Caso caso = casoService.getCasoById(id);
        return new ResponseEntity<>(caso, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Caso> updateCaso(@PathVariable Long id, @RequestBody Caso casoDetails) {
        Caso updatedCaso = casoService.updateCaso(id, casoDetails);
        return new ResponseEntity<>(updatedCaso, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCaso(@PathVariable Long id) {
        casoService.deleteCaso(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
