package br.com.meurer.cadastrodepessoascursosconsultandocepapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {

}