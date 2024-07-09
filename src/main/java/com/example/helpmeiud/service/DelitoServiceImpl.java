package com.example.helpmeiud.service;

import com.example.helpmeiud.model.Delito;
import com.example.helpmeiud.repository.DelitoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DelitoServiceImpl implements DelitoService {

    @Autowired
    private DelitoRepository delitoRepository;

    @Override
    public Delito saveDelito(Delito delito) {
        return delitoRepository.save(delito);
    }

    @Override
    public List<Delito> getAllDelitos() {
        return delitoRepository.findAll();
    }

    @Override
    public Delito getDelitoById(Long id) {
        return delitoRepository.findById(id).orElse(null);
    }

    @Override
    public Delito updateDelito(Long id, Delito delitoDetails) {
        Delito delito = delitoRepository.findById(id).orElse(null);
        if (delito != null) {
            delito.setTipo(delitoDetails.getTipo());
            delito.setDescripcion(delitoDetails.getDescripcion());
            delito.setFecha(delitoDetails.getFecha());
            return delitoRepository.save(delito);
        }
        return null;
    }

    @Override
    public void deleteDelito(Long id) {
        delitoRepository.deleteById(id);
    }
}
