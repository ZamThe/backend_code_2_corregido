package com.example.helpmeiud.service;

import com.example.helpmeiud.model.Delito;

import java.util.List;

public interface DelitoService {
    Delito saveDelito(Delito delito);
    List<Delito> getAllDelitos();
    Delito getDelitoById(Long id);
    Delito updateDelito(Long id, Delito delitoDetails);
    void deleteDelito(Long id);
}
