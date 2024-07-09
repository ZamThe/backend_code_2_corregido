package com.example.helpmeiud.controller;

import com.example.helpmeiud.model.Rol;
import com.example.helpmeiud.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/roles")
public class RolController {

    @Autowired
    private RolService rolService;

    @PostMapping
    public ResponseEntity<Rol> createRol(@RequestBody Rol rol) {
        Rol savedRol = rolService.saveRol(rol);
        return new ResponseEntity<>(savedRol, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Rol>> getAllRoles() {
        List<Rol> roles = rolService.getAllRoles();
        return new ResponseEntity<>(roles, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Rol> getRolById(@PathVariable Long id) {
        Rol rol = rolService.getRolById(id);
        return new ResponseEntity<>(rol, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Rol> updateRol(@PathVariable Long id, @RequestBody Rol rolDetails) {
        Rol updatedRol = rolService.updateRol(id, rolDetails);
        return new ResponseEntity<>(updatedRol, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteRol(@PathVariable Long id) {
        rolService.deleteRol(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
