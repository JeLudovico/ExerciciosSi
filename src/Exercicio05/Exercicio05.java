package Exercicio05;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import ContaBanco.Conta;
import ContaBanco.ContaCorrente;
import ContaBanco.ContaEmpresarial;
import ContaBanco.ContaPoupanca;
import Clientes.Clientes;
import Clientes.PerfilCliente;

public class Exercicio05 {

<<<<<<< HEAD

=======
>>>>>>> 1d9c764a36c32558eda29e0ed4f12626fe9290b8
	public static void main(String[] args) {

		// incluir objetos dentro do <>

		ArrayList<Conta> arrayConta = new ArrayList<>();
		ArrayList<Conta> arrayContaDuplicados = new ArrayList<>();

		Clientes cliente1 = new Clientes("Josafa", 203280, 0101, 012, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente2 = new Clientes("Bartolomeu", 800110, 02, 802.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente3 = new Clientes("Jurema", 0050011, 03, 10034.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente4 = new Clientes("Josafa1", 108009, 04, 2002.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente5 = new Clientes("Bartolomeu1", 7800110, 05, 502.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente6 = new Clientes("jurema1", 3050011, 06, 9034.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente7 = new Clientes("Josafa2", 8009801, 07, 7702.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente8 = new Clientes("Bartolomeu2", 2800999, 18, 902.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente9 = new Clientes("Jurema2", 90050011, 89, 6034.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente10 = new Clientes("Josafa3", 559899, 10, 802.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente11 = new Clientes("Bartolomeu3", 18001100, 11, 892.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente12 = new Clientes("Jurema3", 30999911, 12, 8034.5, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente13 = new Clientes("Josafa4", 503333, 13, 1112.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente14 = new Clientes("Bartolomeu11", 2000032, 14, 502.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente15 = new Clientes("Jurema12", 30059988, 15, 8034.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente16 = new Clientes("Josafa13", 18009800, 16, 902.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente17 = new Clientes("Bartolomeu14", 9000110, 17, 555.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente18 = new Clientes("Jurema15", 90050011, 18, 888.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente19 = new Clientes("Bartolomeu16", 2800119, 19, 101.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente20 = new Clientes("Jurema17", 30055511, 20, 134.1, PerfilCliente.PESSOA_JURIDICA);

		ContaPoupanca contaPoupanca = new ContaPoupanca("BancoBrasil", 87, 29, 67, 900.0, LocalDate.parse("2003-04-11"),
				LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente1);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", 37, 8080, 17, 7000.0, LocalDate.parse("2011-09-09"),
				LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente2, 5, 8);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("Bradesco", 44, 543, 54, 9800.0,
				LocalDate.parse("1999-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente3, "Perreira Top");
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Santander", 57, 19, 67, 900.0, LocalDate.parse("2003-11-11"),
				LocalDate.parse("2013-04-29"), "Null", 7, cliente4);
		ContaCorrente contaCorrente1 = new ContaCorrente("Itau", 27, 2080, 27, 7000.0, LocalDate.parse("2009-09-09"),
				LocalDate.parse("2019-01-09"), "Null", 50, cliente5, 5, 8);
		ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial("Nubank", 64, 643, 64, 9800.0,
				LocalDate.parse("1999-04-10"), LocalDate.parse("2006-07-10"), "Divida", 10, cliente6, "Premium");
		ContaPoupanca contaPoupanca2 = new ContaPoupanca("Flex", 37, 19, 97, 900.0, LocalDate.parse("2007-07-11"),
				LocalDate.parse("2015-04-29"), "Aluguel", 9, cliente7);
		ContaCorrente contaCorrente2 = new ContaCorrente("Bradesco", 57, 8180, 17, 7000.0,
				LocalDate.parse("2012-08-09"), LocalDate.parse("2020-01-09"), "Falecimento", 50, cliente8, 5, 8);
		ContaEmpresarial contaEmpresarial2 = new ContaEmpresarial("SuperDigital", 14, 8743, 59, 9800.0,
				LocalDate.parse("1996-08-10"), LocalDate.parse("2009-07-10"), "Null", 10, cliente9, "Premium Top");
		ContaPoupanca contaPoupanca3 = new ContaPoupanca("Nubank", 97, 79, 27, 900.0, LocalDate.parse("2001-01-11"),
				LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente10);
		ContaCorrente contaCorrente3 = new ContaCorrente("Banco Brasil", 57, 8380, 57, 7000.0,
				LocalDate.parse("2011-11-01"), LocalDate.parse("2019-01-09"), "Null", 50, cliente11, 5, 8);
		ContaEmpresarial contaEmpresarial3 = new ContaEmpresarial("Itau", 54, 1543, 94, 9800.0,
				LocalDate.parse("1998-09-20"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente12, "Top Derm");
		ContaPoupanca contaPoupanca4 = new ContaPoupanca("Santander", 91, 991, 17, 900.0, LocalDate.parse("2009-09-11"),
				LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente13);
		ContaCorrente contaCorrente4 = new ContaCorrente("SuperDigital", 55, 1180, 12, 7000.0,
				LocalDate.parse("2014-01-09"), LocalDate.parse("2019-01-09"), "Null", 50, cliente14, 5, 8);
		ContaEmpresarial contaEmpresarial4 = new ContaEmpresarial("Bradesco", 74, 1543, 26, 9800.0,
				LocalDate.parse("1997-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente15, "Lua Lua");
		ContaPoupanca contaPoupanca5 = new ContaPoupanca("Nubank", 77, 229, 97, 900.0, LocalDate.parse("2003-09-11"),
				LocalDate.parse("2019-04-29"), "Null", 9, cliente16);
		ContaCorrente contaCorrente5 = new ContaCorrente("Bradesco", 57, 2280, 93, 7000.0,
				LocalDate.parse("2016-09-24"), LocalDate.parse("2020-01-09"), "Null", 50, cliente17, 5, 8);
		ContaEmpresarial contaEmpresarial5 = new ContaEmpresarial("Nubank", 36, 9943, 34, 9800.0,
				LocalDate.parse("2001-07-10"), LocalDate.parse("2009-07-10"), "Null", 10, cliente18, "Midia Center");
		ContaCorrente contaCorrente6 = new ContaCorrente("Flex", 19, 8900, 23, 7000.0, LocalDate.parse("2013-01-09"),
				LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente19, 5, 8);
		ContaEmpresarial contaEmpresarial6 = new ContaEmpresarial("Flex", 34, 2543, 24, 9800.0,
				LocalDate.parse("2019-10-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente20, "Clube");

		// Duplicados
		ContaCorrente contaCorrenteDuplicado3 = new ContaCorrente("Banco Brasil", 57, 8380, 57, 7000.0,
				LocalDate.parse("2011-11-01"), LocalDate.parse("2019-01-09"), "Null", 50, cliente11, 5, 8);
		ContaEmpresarial contaEmpresarialDuplicado3 = new ContaEmpresarial("Itau", 54, 1543, 94, 9800.0,
				LocalDate.parse("1998-09-20"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente12, "Top Derm");
		ContaPoupanca contaPoupancaDuplicado4 = new ContaPoupanca("Santander", 91, 991, 17, 900.0,
				LocalDate.parse("2009-09-11"), LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente13);
		ContaCorrente contaCorrenteDuplicado4 = new ContaCorrente("SuperDigital", 55, 1180, 12, 7000.0,
				LocalDate.parse("2014-01-09"), LocalDate.parse("2019-01-09"), "Null", 50, cliente14, 5, 8);
		ContaEmpresarial contaEmpresarialDuplicado4 = new ContaEmpresarial("Bradesco", 74, 1543, 26, 9800.0,
				LocalDate.parse("1997-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente15, "Lua Lua");
		ContaPoupanca contaPoupancaDuplicado5 = new ContaPoupanca("Nubank", 77, 229, 97, 900.0,
				LocalDate.parse("2003-09-11"), LocalDate.parse("2019-04-29"), "Null", 9, cliente16);
		ContaCorrente contaCorrenteDuplicado5 = new ContaCorrente("Bradesco", 57, 2280, 93, 7000.0,
				LocalDate.parse("2016-09-24"), LocalDate.parse("2020-01-09"), "Null", 50, cliente17, 5, 8);
		ContaEmpresarial contaEmpresarialDuplicado5 = new ContaEmpresarial("Nubank", 36, 9943, 34, 9800.0,
				LocalDate.parse("2001-07-10"), LocalDate.parse("2009-07-10"), "Null", 10, cliente18, "Midia Center");
		ContaCorrente contaCorrenteDuplicado6 = new ContaCorrente("Flex", 19, 8900, 23, 7000.0,
				LocalDate.parse("2013-01-09"), LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente19, 5, 8);
		ContaEmpresarial contaEmpresarialDuplicado6 = new ContaEmpresarial("Flex", 34, 2543, 24, 9800.0,
				LocalDate.parse("2019-10-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente20, "Clube");

		arrayConta.add(contaPoupanca);
		arrayConta.add(contaPoupanca1);
		arrayConta.add(contaPoupanca2);
		arrayConta.add(contaPoupanca3);
		arrayConta.add(contaPoupanca4);
		arrayConta.add(contaPoupanca5);
		arrayConta.add(contaEmpresarial);
		arrayConta.add(contaEmpresarial1);
		arrayConta.add(contaEmpresarial2);
		arrayConta.add(contaEmpresarial3);
		arrayConta.add(contaEmpresarial4);
		arrayConta.add(contaEmpresarial5);
		arrayConta.add(contaEmpresarial6);
		arrayConta.add(contaCorrente);
		arrayConta.add(contaCorrente1);
		arrayConta.add(contaCorrente2);
		arrayConta.add(contaCorrente3);
		arrayConta.add(contaCorrente4);
		arrayConta.add(contaCorrente5);
		arrayConta.add(contaCorrente6);

		arrayConta.add(contaCorrenteDuplicado3);
		arrayConta.add(contaEmpresarialDuplicado3);
		arrayConta.add(contaPoupancaDuplicado4);
		arrayConta.add(contaCorrenteDuplicado4);
		arrayConta.add(contaEmpresarialDuplicado4);
		arrayConta.add(contaPoupancaDuplicado5);
		arrayConta.add(contaCorrenteDuplicado5);
		arrayConta.add(contaEmpresarialDuplicado5);
		arrayConta.add(contaCorrenteDuplicado6);
		arrayConta.add(contaEmpresarialDuplicado6);
	
				
		for (int x = 0; x < arrayConta.size(); x++) {
			for (int z = x + 1; z < arrayConta.size(); z++) {
				if (arrayConta.get(x).equals(arrayConta.get(z))) {
					arrayContaDuplicados.add(arrayConta.get(z));
					arrayConta.remove(z);
				}
			}
		}
		Collections.sort(arrayConta);
		System.out.println("Lista Ordenada");
		for (int i1 = 0; i1 < arrayConta.size(); i1++) {
			System.out.println(
					arrayConta.get(i1).getNumAgencia() + " Agencia - Conta " + arrayConta.get(i1).getNumeroConta());
		}
		
		//System.out.println(arrayConta.size());
		//System.out.println(arrayContaDuplicados.size());

	}

}
