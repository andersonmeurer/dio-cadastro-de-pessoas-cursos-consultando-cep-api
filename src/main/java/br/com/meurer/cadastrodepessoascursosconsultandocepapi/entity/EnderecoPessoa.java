package br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_endereco_pessoa")
public class EnderecoPessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cdEnderecoPesoa;

	@ManyToOne
	private Pessoa pessoa;

	@ManyToOne
	private Endereco endereco;
}
