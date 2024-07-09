package com.example.helpmeiud.controller;

import com.example.helpmeiud.model.Crime;
import com.example.helpmeiud.service.CrimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/crimes")
public class CrimeController {

    @Autowired
    private CrimeService crimeService;

    @PostMapping
    public ResponseEntity<Crime> createCrime(@RequestBody Crime crime) {
        Crime savedCrime = crimeService.saveCrime(crime);
        return new ResponseEntity<>(savedCrime, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Crime>> getAllCrimes() {
        List<Crime> crimes = crimeService.getAllCrimes();
        return new ResponseEntity<>(crimes, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Crime> getCrimeById(@PathVariable Long id) {
        Crime crime = crimeService.getCrimeById(id);
        return new ResponseEntity<>(crime, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Crime> updateCrime(@PathVariable Long id, @RequestBody Crime crimeDetails) {
        Crime updatedCrime = crimeService.updateCrime(id, crimeDetails);
        return new ResponseEntity<>(updatedCrime, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCrime(@PathVariable Long id) {
        crimeService.deleteCrime(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
