package com.carina.sgcc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carina.sgcc.modelo.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Integer> {

}
