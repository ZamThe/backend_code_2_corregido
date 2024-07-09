package com.example.helpmeiud.service;

import com.example.helpmeiud.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario saveUsuario(Usuario usuario);
    List<Usuario> getAllUsuarios();
    Usuario getUsuarioById(Long id);
    Usuario updateUsuario(Long id, Usuario usuarioDetails);
    void deleteUsuario(Long id);
}
