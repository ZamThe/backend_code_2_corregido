package com.example.helpmeiud.service;

import com.example.helpmeiud.model.Rol;

import java.util.List;

public interface RolService {
    Rol saveRol(Rol rol);
    List<Rol> getAllRoles();
    Rol getRolById(Long id);
    Rol updateRol(Long id, Rol rolDetails);
    void deleteRol(Long id);
}
