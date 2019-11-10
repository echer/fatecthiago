package com.fatec.projetoweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.projetoweb.model.PontoDeInteresse;

@Repository
public interface IPontoDeInteresseRepository extends JpaRepository<PontoDeInteresse, Long>{

}
