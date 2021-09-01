package Exercicio02;

import java.time.LocalDate;

import Clientes.Clientes;
import Clientes.PerfilCliente;
import ContaBanco.Conta;
import ContaBanco.ContaCorrente;
import ContaBanco.ContaEmpresarial;
import ContaBanco.ContaPoupanca;

public class Exercicio02 {

	public static void main(String[] args) {

		String A = "Hello";
		String B = new String("Hello");


		inteirosIguais(5, 6);
		inteirosIguais(5, 5);

		 stringIguaisSemEquals(A, B);
		 stringIguaisComEquals(A, B);

		Clientes cliente1 = new Clientes("Josafa", "20328009800", 1002.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente5 = new Clientes("Josafa", "20328009800", 1002.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente2 = new Clientes("Bartolomeu", "20328001100", 802.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente3 = new Clientes("Jurema", "30030050011", 10034.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente18 = new Clientes("Jurema15", "33330050011", 888.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente19 = new Clientes("Bartolomeu16", "20328001199", 101.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente20 = new Clientes("Jurema17", "30030055511", 134.1, PerfilCliente.PESSOA_JURIDICA);

		ContaPoupanca contaPoupanca = new ContaPoupanca("BancoBrasil", "87", "29", "67", 900.0,
				LocalDate.parse("2003-04-11"), LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente1);
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("BancoBrasil", "87", "29", "67", 900.0,
				LocalDate.parse("2003-04-11"), LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente5);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", "37", "8080", "17", 7000.0,
				LocalDate.parse("2011-09-09"), LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente2, 5, 8);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("Bradesco", "44", "543", "54", 9800.0,
				LocalDate.parse("1999-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente3, "Perreira Top");
		ContaEmpresarial contaEmpresarial5 = new ContaEmpresarial("Nubank", "36", "9943", "34", 9800.0,
				LocalDate.parse("2001-07-10"), LocalDate.parse("2009-07-10"), "Null", 10, cliente18, "Midia Center");
		ContaCorrente contaCorrente6 = new ContaCorrente("Flex", "19", "8900", "23", 7000.0,
				LocalDate.parse("2013-01-09"), LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente19, 5, 8);
		ContaEmpresarial contaEmpresarial6 = new ContaEmpresarial("Flex", "34", "2543", "24", 9800.0,
				LocalDate.parse("2019-10-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente20, "Clube");

		cliente1.equals(cliente3);
		cliente2.equals(cliente1);

		contaCorrente.equals(contaPoupanca);
		contaCorrente.equals(contaEmpresarial);
	}
	
	public static void inteirosIguais(int a, int b) {
		if (a == b) {
			System.out.println("Números iguais");
		} else {
			System.out.println("Números diferentes");
		}
	}

	public static void stringIguaisComEquals(String a, String b) {
		if (a.equals(b)) {
			System.out.println("Utilizando o Equals() as Strings são iguais");
		} else {
			System.out.println("Utlilizando o Equals() as Strings não são iguais");
		}
	}

	public static void stringIguaisSemEquals(String a, String b) {
		if (a == b) {
			System.out.println("Utlilizando == as Strings são iguais");
		} else {
			System.out.println("Utilizando == as Strings são diferentes");
		}
	}

}