package com.carina.sgcc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carina.sgcc.modelo.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
