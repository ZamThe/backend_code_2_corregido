package com.example.helpmeiud.service;

import com.example.helpmeiud.model.Crime;
import com.example.helpmeiud.repository.CrimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CrimeService {

    @Autowired
    private CrimeRepository crimeRepository;

    public Crime saveCrime(Crime crime) {
        return crimeRepository.save(crime);
    }

    public List<Crime> getAllCrimes() {
        return crimeRepository.findAll();
    }

    public Crime getCrimeById(Long id) {
        return crimeRepository.findById(id).orElseThrow();
    }

    public Crime updateCrime(Long id, Crime crimeDetails) {
        Crime crime = crimeRepository.findById(id).orElseThrow();
        crime.setType(crimeDetails.getType());
        crime.setDateTime(crimeDetails.getDateTime());
        crime.setDescription(crimeDetails.getDescription());
        crime.setLatitude(crimeDetails.getLatitude());
        crime.setLongitude(crimeDetails.getLongitude());
        crime.setAltitude(crimeDetails.getAltitude());
        return crimeRepository.save(crime);
    }

    public void deleteCrime(Long id) {
        crimeRepository.deleteById(id);
    }
}
