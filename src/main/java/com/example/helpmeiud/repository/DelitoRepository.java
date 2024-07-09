package com.example.helpmeiud.repository;

import com.example.helpmeiud.model.Delito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DelitoRepository extends JpaRepository<Delito, Long> {
}
