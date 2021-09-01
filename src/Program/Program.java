package Program;

import java.time.LocalDate;

import Clientes.Clientes;
import Clientes.PerfilCliente;
import ContaBanco.Conta;
import ContaBanco.ContaCorrente;
import ContaBanco.ContaEmpresarial;
import ContaBanco.ContaPoupanca;

public class Program {

	public static void main(String[] args) {

		String primeiraString = "Hello World";
		String segundaString = new String("Hello World");
		//ContaCorrente contaCorrenteArray = new ContaCorrente();
		//ContaPoupanca contaPoupancaArray = new ContaPoupanca(segundaString);
		//ContaEmpresarial contaEmpresarialArray = new ContaEmpresarial();

		// Clientes

		Clientes cliente1 = new Clientes("Josafa", "20328009800", 1002.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente2 = new Clientes("Bartolomeu", "20328001100", 802.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente3 = new Clientes("Jurema", "30030050011", 10034.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente4 = new Clientes("Josafa1", "20008009800", 2002.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente5 = new Clientes("Bartolomeu2", "7778001100", 502.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente6 = new Clientes("Jurema3", "77710050011", 9034.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente7 = new Clientes("Josafa4", "20008009800", 7702.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente8 = new Clientes("Bartolomeu5", "20328009999", 902.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente9 = new Clientes("Jurema6", "99990050011", 6034.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente10 = new Clientes("Josafa7", "0098009899", 802.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente11 = new Clientes("Bartolomeu8", "91918001100", 892.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente12 = new Clientes("Jurema9", "30030999911", 8034.5, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente13 = new Clientes("Josafa10", "2032803333", 1112.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente14 = new Clientes("Bartolomeu11", "20328000032", 502.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente15 = new Clientes("Jurema12", "30030059988", 8034.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente16 = new Clientes("Josafa13", "11118009800", 902.7, PerfilCliente.FUNCIONARIO_BANCO);
		Clientes cliente17 = new Clientes("Bartolomeu14", "11110001100", 555.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente18 = new Clientes("Jurema15", "33330050011", 888.1, PerfilCliente.PESSOA_JURIDICA);
		Clientes cliente19 = new Clientes("Bartolomeu16", "20328001199", 101.0, PerfilCliente.PESSOA_FISICA);
		Clientes cliente20 = new Clientes("Jurema17", "30030055511", 134.1, PerfilCliente.PESSOA_JURIDICA);
		
		
		
		
		ContaPoupanca contaPoupanca = new ContaPoupanca("BancoBrasil", "87", "29", "67", 900.0, LocalDate.parse("2003-04-11"), LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente1);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", "37", "8080", "17", 7000.0, LocalDate.parse("2011-09-09"), LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente2, 5, 8);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("Bradesco", "44", "543", "54", 9800.0, LocalDate.parse("1999-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente3, "Perreira Top");
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Santander", "57", "19", "67", 900.0, LocalDate.parse("2003-11-11"), LocalDate.parse("2013-04-29"), "Null", 7, cliente4);
		ContaCorrente contaCorrente1 = new ContaCorrente("Itau", "27", "2080", "27", 7000.0, LocalDate.parse("2009-09-09"), LocalDate.parse("2019-01-09"), "Null", 50, cliente5, 5, 8);
		ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial("Nubank", "64", "643", "64", 9800.0, LocalDate.parse("1999-04-10"), LocalDate.parse("2006-07-10"), "Divida", 10, cliente6, "Premium");
		ContaPoupanca contaPoupanca2 = new ContaPoupanca("Flex", "37", "19", "97", 900.0, LocalDate.parse("2007-07-11"), LocalDate.parse("2015-04-29"), "Aluguel", 9, cliente7);
		ContaCorrente contaCorrente2 = new ContaCorrente("Bradesco", "57", "8180", "17", 7000.0, LocalDate.parse("2012-08-09"), LocalDate.parse("2020-01-09"), "Falecimento", 50, cliente8, 5, 8);
		ContaEmpresarial contaEmpresaria2l = new ContaEmpresarial("SuperDigital", "14", "8743", "59", 9800.0, LocalDate.parse("1996-08-10"), LocalDate.parse("2009-07-10"), "Null", 10, cliente9, "Premium Top");
		ContaPoupanca contaPoupanca3 = new ContaPoupanca("Nubank", "97", "79", "27", 900.0, LocalDate.parse("2001-01-11"), LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente10);
		ContaCorrente contaCorrente3 = new ContaCorrente("Banco Brasil", "57", "8380", "57", 7000.0, LocalDate.parse("2011-11-01"), LocalDate.parse("2019-01-09"), "Null", 50, cliente11, 5, 8);
		ContaEmpresarial contaEmpresarial3 = new ContaEmpresarial("Itau", "54", "1543", "94", 9800.0, LocalDate.parse("1998-09-20"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente12, "Top Derm");
		ContaPoupanca contaPoupanca4 = new ContaPoupanca("Santander", "91", "991", "17", 900.0, LocalDate.parse("2009-09-11"), LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente13);
		ContaCorrente contaCorrente4 = new ContaCorrente("SuperDigital", "55", "1180", "12", 7000.0, LocalDate.parse("2014-01-09"), LocalDate.parse("2019-01-09"), "Null", 50, cliente14, 5, 8);
		ContaEmpresarial contaEmpresarial4 = new ContaEmpresarial("Bradesco", "74", "1543", "26", 9800.0, LocalDate.parse("1997-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente15, "Lua Lua");
		ContaPoupanca contaPoupanca5 = new ContaPoupanca("Nubank", "77", "229", "97", 900.0, LocalDate.parse("2003-09-11"), LocalDate.parse("2019-04-29"), "Null", 9, cliente16);
		ContaCorrente contaCorrente5 = new ContaCorrente("Bradesco", "57", "2280", "93", 7000.0, LocalDate.parse("2016-09-24"), LocalDate.parse("2020-01-09"), "Null", 50, cliente17, 5, 8);
		ContaEmpresarial contaEmpresarial5 = new ContaEmpresarial("Nubank", "36", "9943", "34", 9800.0, LocalDate.parse("2001-07-10"), LocalDate.parse("2009-07-10"), "Null", 10, cliente18, "Midia Center");
		ContaCorrente contaCorrente6 = new ContaCorrente("Flex", "19", "8900", "23", 7000.0, LocalDate.parse("2013-01-09"), LocalDate.parse("2019-01-09"), "Falecimento", 50, cliente19, 5, 8);
		ContaEmpresarial contaEmpresarial6 = new ContaEmpresarial("Flex", "34", "2543", "24", 9800.0, LocalDate.parse("2019-10-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente20, "Clube");
		
		


		System.out.println(contaPoupanca);
		System.out.println();
		System.out.println(contaCorrente);
		System.out.println();
		System.out.println(contaEmpresarial);
		System.out.println();
		System.out.println(contaEmpresarial1);
		

		// ContaPoupanca contaArrayTesteCP = new ContaPoupanca();
		// ContaCorrente contaArrayTesteCC = new ContaCorrente();
		// ContaEmpresarial contaArrayTesteCE = new ContaEmpresarial();

		// contaPoupancaArray.adicionaArrayContaPoupan�a(contaPoupancaJosafa);
		// ccontaPoupancaArray.adicionaArrayContaPoupan�a(contaPoupancaKezia);
		//
		//
		// contaPoupancaArray.getPrimeiraContaPoupancaNoArray();
		// contaPoupancaArray.getPrimeiraContaPoupancaNoArray();
		// contaPoupancaArray.getTamanhoArrayContaPoupanca();
		//
		//
		//
		// contaCorrenteArray.adicionaArrayContaCorrente(contaCorrenteBartolomeu);
		// contaCorrenteArray.adicionaArrayContaCorrente(contaCorrenteCriolito);
		//
		// contaCorrenteArray.getPrimeiraContaCorrenteNoArray();
		// contaCorrenteArray.getPrimeiraContaCorrenteNoArray();
		// contaCorrenteArray.getTamanhoArrayContaCorrente();
		//
		//
		//
		// contaEmpresarialArray.adicionaArrayContaEmpresarial(contaEmpresarialJurema);
		//
		// contaEmpresarialArray.getPrimeiraContaEmpresarialNoArray();
		// contaEmpresarialArray.getTamanhoArrayCEmpresarial();
	}

	public static String clientesIguaisComEquals(Clientes cliente1, Clientes cliente2) {
		if (cliente1.getNumeroDocumentoCliente().equals(cliente2.getNumeroDocumentoCliente())) {
			return "Clientes documentos iguais";
		} else {
			return "Clientes com documentos diferentes";
		}
	}

	public static String contasIguaisComEquals(Conta conta1, Conta conta2) {
		if (conta1.getNumAgencia().equals(conta2.getNumAgencia())
				&& conta1.getNumeroConta().equals(conta2.getNumeroConta())) {
			return "Contas iguais";
		} else {
			return "Contas diferentes";
		}
	}

}