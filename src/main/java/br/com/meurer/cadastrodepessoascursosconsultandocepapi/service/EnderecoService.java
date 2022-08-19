package br.com.meurer.cadastrodepessoascursosconsultandocepapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity.Endereco;
import br.com.meurer.cadastrodepessoascursosconsultandocepapi.repository.EnderecoRepository;

@Service
public class EnderecoService {

	@Autowired
	private EnderecoRepository enderecoRepository;

	public Endereco salvar(Endereco e) {
		return enderecoRepository.save(e);
	}

	public Endereco findByCep(Endereco e) {
		return enderecoRepository.findByCep(e.getCep());
	}
}