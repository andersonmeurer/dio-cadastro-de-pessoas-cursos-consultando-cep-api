package br.com.meurer.cadastrodepessoascursosconsultandocepapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity.Pessoa;
import br.com.meurer.cadastrodepessoascursosconsultandocepapi.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public Pessoa salvar(Pessoa dto) {
		return pessoaRepository.save(dto);
	}
}