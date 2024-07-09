package com.example.helpmeiud.service;

import com.example.helpmeiud.model.Caso;
import com.example.helpmeiud.repository.CasoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CasoServiceImpl implements CasoService {

    @Autowired
    private CasoRepository casoRepository;

    @Override
    public Caso saveCaso(Caso caso) {
        return casoRepository.save(caso);
    }

    @Override
    public List<Caso> getAllCasos() {
        return casoRepository.findAll();
    }

    @Override
    public Caso getCasoById(Long id) {
        return casoRepository.findById(id).orElse(null);
    }

    @Override
    public Caso updateCaso(Long id, Caso casoDetails) {
        Caso caso = casoRepository.findById(id).orElse(null);
        if (caso != null) {
            caso.setTitulo(casoDetails.getTitulo());
            caso.setDescripcion(casoDetails.getDescripcion());
            caso.setFecha(casoDetails.getFecha());
            return casoRepository.save(caso);
        }
        return null;
    }

    @Override
    public void deleteCaso(Long id) {
        casoRepository.deleteById(id);
    }
}
