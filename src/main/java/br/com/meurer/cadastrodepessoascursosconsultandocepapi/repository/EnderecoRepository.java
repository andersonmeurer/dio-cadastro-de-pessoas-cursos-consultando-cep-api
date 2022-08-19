package br.com.meurer.cadastrodepessoascursosconsultandocepapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity.Endereco;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

	Endereco findByCep(String cep);

}