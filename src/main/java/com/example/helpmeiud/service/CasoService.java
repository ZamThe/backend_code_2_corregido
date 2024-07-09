package com.example.helpmeiud.service;

import com.example.helpmeiud.model.Caso;

import java.util.List;

public interface CasoService {
    Caso saveCaso(Caso caso);
    List<Caso> getAllCasos();
    Caso getCasoById(Long id);
    Caso updateCaso(Long id, Caso casoDetails);
    void deleteCaso(Long id);
}
