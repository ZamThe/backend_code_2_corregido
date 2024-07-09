package com.example.helpmeiud.repository;

import com.example.helpmeiud.model.Caso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CasoRepository extends JpaRepository<Caso, Long> {
}
