package br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tb_curso_aluno")
public class CursoAluno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cdCursoAluno;

	@ManyToOne
	private Curso curso;

	@OneToMany
	private List<Pessoa> listPessoas;
}
