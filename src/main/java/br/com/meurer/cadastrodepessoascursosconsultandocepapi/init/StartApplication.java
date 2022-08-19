package br.com.meurer.cadastrodepessoascursosconsultandocepapi.init;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.meurer.cadastrodepessoascursosconsultandocepapi.controller.EnderecoController;
import br.com.meurer.cadastrodepessoascursosconsultandocepapi.controller.PessoaController;
import br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity.Endereco;
import br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity.EnderecoPessoa;
import br.com.meurer.cadastrodepessoascursosconsultandocepapi.entity.Pessoa;

/*Executa sempre na inicializacao para popular banco de dados*/
@Component
public class StartApplication implements CommandLineRunner {

	private PessoaController pessoaController;
	private EnderecoController enderecoController;

	@Autowired
	public StartApplication(PessoaController pessoaController, EnderecoController enderecoController) {
		this.pessoaController = pessoaController;
		this.enderecoController = enderecoController;
	}

	@Override
	public void run(String... args) throws Exception {
		Pessoa p1 = new Pessoa();
		p1.setNmPessoa("Anderson");
		pessoaController.salvar(p1);

		Pessoa p2 = new Pessoa();
		p2.setNmPessoa("Mariana");
		pessoaController.salvar(p2);

		Pessoa p3 = new Pessoa();
		p3.setNmPessoa("Antonio");
		pessoaController.salvar(p3);

		Pessoa p4 = new Pessoa();
		p4.setNmPessoa("Pedro");
		pessoaController.salvar(p4);

		Endereco e1 = new Endereco();
		e1.setCep("88705340");
//		enderecoController.salvar(e1);

		Endereco endereco = enderecoController.salvar(e1);

		EnderecoPessoa ep1 = new EnderecoPessoa();
		ep1.setEndereco(endereco);
		ep1.setPessoa(p1);

		EnderecoPessoa ep2 = new EnderecoPessoa();
		ep2.setEndereco(endereco);
		ep2.setPessoa(p2);

		EnderecoPessoa ep3 = new EnderecoPessoa();
		ep3.setEndereco(endereco);
		ep3.setPessoa(p3);

		EnderecoPessoa ep4 = new EnderecoPessoa();
		ep4.setEndereco(endereco);
		ep4.setPessoa(p3);
	}
}