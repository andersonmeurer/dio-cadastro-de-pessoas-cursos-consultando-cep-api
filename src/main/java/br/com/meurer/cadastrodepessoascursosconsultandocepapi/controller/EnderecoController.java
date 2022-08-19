package br.com.meurer.cadastrodepessoascursosconsultandocepapi.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity.Endereco;
import br.com.meurer.cadastrodepessoascursosconsultandocepapi.service.EnderecoService;
import br.com.meurer.cadastrodepessoascursosconsultandocepapi.service.ViaCepService;

@Controller
public class EnderecoController {

	@Autowired
	private ViaCepService viaCepService;

	@Autowired
	private EnderecoService enderecoService;

	public Endereco salvar(Endereco e) {
		Endereco end = enderecoService.findByCep(e);
		if (Objects.nonNull(end)) {
			return end;
		}
		return enderecoService.salvar(consultarCep(e.getCep()));
	}

	public Endereco consultarCep(String cep) {
		return viaCepService.consultarCep(cep);
	}
}