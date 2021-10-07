package br.senai.sp.jandira.app;

import br.senai.sp.jandira.lista.TipoConta;
import br.senai.sp.jandira.model.Agencia;
import br.senai.sp.jandira.model.Cliente;
import br.senai.sp.jandira.model.Conta;

public class App {

	public static void main(String[] args) {
		
		// Criar uma agência
		Agencia agencia = new Agencia();
		agencia.setNumeroAgencia("4214-9");
		agencia.setNomeGerente("Astolfo Dias");
		agencia.setCidade("Jandira");
		agencia.setTelefone("(11)9654-6554");
		
		// Criar a cliente Maria
		Cliente clienteMaria = new Cliente();
		clienteMaria.setNome("Maria Antonieta");
		clienteMaria.setEmail("maria@email.com");
		clienteMaria.setSalario(5000.0);
		
				
		// Criação da conta da Maria
		Conta contaMaria = new Conta("7845-8");
		contaMaria.setCliente(clienteMaria);
		contaMaria.setAgencia(agencia);
		contaMaria.depositar(500);
		contaMaria.setTipo(TipoConta.CORRENTE);
		
		System.out.println("--->" + contaMaria.getTipo());
		
		// Criar o cliente Pedro
		Cliente clientePedro = new Cliente();
		clientePedro.setNome("Pedro Cabral");
		clientePedro.setEmail("pedro@uol.com.br");
		clientePedro.setSalario(2865.98);
		
		// Criação da conta do Pedro
		Conta contaPedro = new Conta("6547-6");
		contaPedro.setCliente(clientePedro);
		contaPedro.depositar(200);
		contaPedro.setTipo(TipoConta.POUPANCA);
		contaPedro.setAgencia(agencia);
		System.out.println("--->" + contaPedro.getTipo());
		
		// Criar a cliente Ana
		Cliente clienteAna = new Cliente();
		clienteAna.setNome("Ana Gomes");
		clienteAna.setEmail("ana@ig.com.br");
		clienteAna.setSalario(2500);
				
		// Criação da conta da Ana
		Conta contaAna = new Conta("23145-9");
		contaAna.setCliente(clienteAna);
		contaAna.depositar(2000);
		contaAna.setTipo(TipoConta.SALARIO);
		contaAna.setAgencia(agencia);
		System.out.println("--->" + contaAna.getTipo());
		
		// Exibir os detalhes das contas
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		contaAna.exibirDetalhes();
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		// Depositar 100 Reais na conta da Maria
		contaMaria.depositar(200);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("===========================");
		System.out.println();
		
		// Sacar 100 Reais da conta da Maria
		contaMaria.sacar(300);
		contaMaria.exibirDetalhes();
		
		System.out.println();
		System.out.println("========== TRANSFERINDO ===========");
		System.out.println();
		
		// Transferir 200 Reais da 
		// conta da Maria para a conta do Pedro
		contaMaria.transferir(contaPedro, 2000);
		contaMaria.exibirDetalhes();
		contaPedro.exibirDetalhes();
		
	}

}
