package com.carina.sgcc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carina.sgcc.modelo.Locatário;

public interface LocatarioRepository extends JpaRepository<Locatário, Integer> {

}
