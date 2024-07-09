package com.example.helpmeiud.service;

import com.example.helpmeiud.model.Rol;
import com.example.helpmeiud.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public Rol saveRol(Rol rol) {
        return rolRepository.save(rol);
    }

    @Override
    public List<Rol> getAllRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Rol getRolById(Long id) {
        return rolRepository.findById(id).orElse(null);
    }

    @Override
    public Rol updateRol(Long id, Rol rolDetails) {
        Rol rol = rolRepository.findById(id).orElse(null);
        if (rol != null) {
            rol.setNombre(rolDetails.getNombre());
            return rolRepository.save(rol);
        }
        return null;
    }

    @Override
    public void deleteRol(Long id) {
        rolRepository.deleteById(id);
    }
}
