package com.github.acnweb.thymeleaf.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.github.acnweb.thymeleaf.model.Pessoa;
import com.github.acnweb.thymeleaf.model.SexoTipo;

@Service
public class PessoaRepositoryMockup {

	public List<Pessoa> list() {
		List<Pessoa> result = new ArrayList<>();
		
		Pessoa pessoa = new Pessoa(1L, "Pelé", SexoTipo.M );		
		result.add(pessoa);
		
		pessoa = new Pessoa(2L, "Rainha Elizabeth", SexoTipo.F );
		result.add(pessoa);
		
		result.add(new Pessoa(3L, "Madona", SexoTipo.F ));

		return result;
	}

}
