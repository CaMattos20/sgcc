package com.carina.sgcc.modelo;

import java.time.LocalTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.carina.sgcc.enums.Setor;

import lombok.Data;

@Entity
@Data
public class FuncionarioCondominio {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String cpf;
	private String endereco;
	private String email;
	private String telefone;
	private String sexo;
	
	private LocalTime inicioHorarioTrabalho;
	private LocalTime fimHorarioTrabalho;
	
	private Setor setor;
	
	
}
