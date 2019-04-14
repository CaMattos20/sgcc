package com.carina.sgcc;

import java.time.LocalTime;

import com.carina.sgcc.enums.Setor;
import com.carina.sgcc.modelo.FuncionarioCondominio;


public class testes {
	
	public static void main(String[] args) {
		
		
		FuncionarioCondominio f1 = new FuncionarioCondominio();
		
		f1.setNome("Lucas");
		f1.setCpf("1234567");
		f1.setEmail("lFerraz@gmail.com");
		f1.setEndereco("estrada onda verde");
		f1.setSexo("masculino");
		f1.setTelefone("25897456");
		f1.setSetor(Setor.SEGURANCA);
		f1.setInicioHorarioTrabalho(LocalTime.of(9, 0));
		f1.setFimHorarioTrabalho(LocalTime.of(15, 0));
		
	}
}
