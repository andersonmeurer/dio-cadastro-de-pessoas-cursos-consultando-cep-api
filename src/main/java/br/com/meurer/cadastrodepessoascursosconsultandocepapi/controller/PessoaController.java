package br.com.meurer.cadastrodepessoascursosconsultandocepapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity.Pessoa;
import br.com.meurer.cadastrodepessoascursosconsultandocepapi.service.PessoaService;

@Controller
public class PessoaController {

	@Autowired
	private PessoaService pessoaService;

	public PessoaController() {
	}

	@GetMapping
	public Pessoa salvar(@RequestBody Pessoa dto) {
		return pessoaService.salvar(dto);
	}
}