package com.carina.sgcc.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Locatário {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	private String cnpj;
	
	@OneToOne
	private Empresa empresa;
	
	private String endereco;
	private String email;
	private String telefone;
	
	
	
	
}
