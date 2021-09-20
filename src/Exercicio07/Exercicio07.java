package Exercicio07;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import Cliente.Cliente;
import Cliente.PerfilCliente;
import ContaBanco.Conta;
import ContaBanco.ContaCorrente;
import ContaBanco.ContaEmpresarial;
import ContaBanco.ContaPoupanca;

public class Exercicio07 {

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente(" Josafa", 203280, 0101, 012, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente2 = new Cliente(" Bartolomeu", 800110, 02, 802.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente3 = new Cliente(" Jurema", 0050011, 03, 10034.1, PerfilCliente.PESSOA_JURIDICA);
		Cliente cliente4 = new Cliente(" Josafa1", 108009, 04, 2002.7, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente5 = new Cliente(" Bartolomeu1", 7800110, 05, 502.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente6 = new Cliente(" jurema1", 3050011, 06, 9034.1, PerfilCliente.PESSOA_JURIDICA);
		Cliente cliente7 = new Cliente(" Josafa2", 8009801, 07, 7702.7, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente8 = new Cliente(" Bartolomeu2", 2800999, 18, 902.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente9 = new Cliente(" Jurema2", 90050011, 89, 6034.1, PerfilCliente.PESSOA_JURIDICA);
		//Clientes cliente10 = new Clientes("Josafa3", 559899, 10, 802.7, PerfilCliente.FUNCIONARIO_BANCO);
//		Clientes cliente6 = new Clientes("jurema1", 3050011, 06, 9034.1, PerfilCliente.PESSOA_JURIDICA);

		ContaPoupanca contaPoupanca = new ContaPoupanca("BancoBrasil", 87, 29, 67, 900.0, LocalDate.parse("2003-04-11"), LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente1);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", 37, 8080, 17, 7000.0, LocalDate.parse("2011-09-09"), LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente2, 5, 8);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("Bradesco", 44, 543, 54, 9800.0, LocalDate.parse("1999-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente3, "Perreira Top");
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Santander", 57, 19, 67, 900.0, LocalDate.parse("2003-11-11"), LocalDate.parse("2013-04-29"), "Null", 7, cliente4);
		ContaCorrente contaCorrente1 = new ContaCorrente("Itau", 27, 2080, 27, 7000.0, LocalDate.parse("2009-09-09"), LocalDate.parse("2019-01-09"), "Null", 50, cliente5, 5, 8);
		ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial("Nubank", 64, 943, 74, 9800.0, LocalDate.parse("1999-04-10"), LocalDate.parse("2006-07-10"), "Divida", 10, cliente6, "Premium");
		ContaPoupanca contaPoupanca2 = new ContaPoupanca("Flex", 37, 19, 97, 900.0, LocalDate.parse("2007-07-11"), LocalDate.parse("2015-04-29"), "Aluguel", 9, cliente7);
		ContaCorrente contaCorrente2 = new ContaCorrente("Bradesco", 57, 8180, 17, 7000.0, LocalDate.parse("2012-08-09"), LocalDate.parse("2020-01-09"), "Falecimento", 50, cliente8, 5, 8);
		ContaEmpresarial contaEmpresarial2 = new ContaEmpresarial("SuperDigital", 14, 8743, 59, 9800.0, LocalDate.parse("1996-08-10"), LocalDate.parse("2009-07-10"), "Null", 10, cliente9, "Premium Top");
		//ContaPoupanca contaPoupanca3 = new ContaPoupanca("Nubank", 97, 79, 27, 900.0, LocalDate.parse("2001-01-11"), LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente10);
		ContaEmpresarial contaEmpresarial01 = new ContaEmpresarial("Nubank", 64, 943, 74, 9800.0, LocalDate.parse("1999-04-10"), LocalDate.parse("2006-07-10"), "Divida", 10, cliente6, "Premium");
		
		Map<Cliente, Conta> ClientesConta = new HashMap<>();
		
		ClientesConta.put(contaPoupanca.getCliente() , contaPoupanca); 
		ClientesConta.put(contaCorrente.getCliente() , contaCorrente);
		ClientesConta.put(contaEmpresarial.getCliente() , contaEmpresarial);
		ClientesConta.put(contaPoupanca1.getCliente(), contaPoupanca1);
		ClientesConta.put(contaCorrente1.getCliente(), contaCorrente1);
		ClientesConta.put(contaEmpresarial1.getCliente(), contaEmpresarial1);
		ClientesConta.put(contaPoupanca2.getCliente(), contaPoupanca2);
		ClientesConta.put(contaCorrente2.getCliente(), contaCorrente2);
		ClientesConta.put(contaEmpresarial2.getCliente(), contaEmpresarial2);
		ClientesConta.put(contaEmpresarial.getCliente(), contaEmpresarial);
		ClientesConta.put(contaEmpresarial01.getCliente(), contaEmpresarial01);

		System.out.println(ClientesConta);
	}
}