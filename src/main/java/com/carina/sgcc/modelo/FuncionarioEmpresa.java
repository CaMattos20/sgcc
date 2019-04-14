package com.carina.sgcc.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class FuncionarioEmpresa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String cpf;
	private String telefone;
	private String email;
	
	@ManyToOne
	private Empresa empresaQueTrabalha;
	
}
