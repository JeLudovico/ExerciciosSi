package Exercicio08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import Cliente.Cliente;
import Cliente.PerfilCliente;
import ContaBanco.Conta;
import ContaBanco.ContaCorrente;
import ContaBanco.ContaEmpresarial;
import ContaBanco.ContaPoupanca;

public class Exercicio08 {

//	private static String StringTextAccount = null;

	public static void main(String[] args) {

		Cliente cliente1 = new Cliente("Josafa", 999888999, 0101, 012, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente2 = new Cliente("Bartolomeu", 800110333, 02, 802.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente3 = new Cliente("Jurema", 0050011111, 03, 10034.1, PerfilCliente.PESSOA_JURIDICA);
		Cliente cliente4 = new Cliente("Josafa1", 1080099999, 04, 2002.7, PerfilCliente.FUNCIONARIO_BANCO);
		Cliente cliente5 = new Cliente("Bartolomeu1", 780011000, 05, 502.0, PerfilCliente.PESSOA_FISICA);
		Cliente cliente6 = new Cliente("jurema1", 305001111, 06, 9034.1, PerfilCliente.PESSOA_JURIDICA);

		ContaPoupanca contaPoupanca = new ContaPoupanca("BancoBrasil", 87, 29, 67, 900.0, LocalDate.parse("2003-04-11"),
				LocalDate.parse("2013-04-29"), "Aluguel", 9, cliente1);
		ContaCorrente contaCorrente = new ContaCorrente("NuBank", 37, 8080, 17, 7000.0, LocalDate.parse("2011-09-09"),
				LocalDate.parse("2019-01-09"), "null", 50, cliente2, 5, 8);
		ContaEmpresarial contaEmpresarial = new ContaEmpresarial("Bradesco", 44, 543, 54, 2800.0,
				LocalDate.parse("1999-04-10"), LocalDate.parse("2009-07-10"), "Divida", 10, cliente3, "Perreira Top");
		ContaPoupanca contaPoupanca1 = new ContaPoupanca("Santander", 57, 19, 67, 1900.0, LocalDate.parse("2003-11-11"),
				LocalDate.parse("2013-04-29"), "Problemas pessoais", 7, cliente4);
		ContaCorrente contaCorrente1 = new ContaCorrente("Itau", 27, 2080, 27, 7000.0, LocalDate.parse("2009-09-09"),
				LocalDate.parse("2019-01-09"), "Null", 50, cliente5, 5, 8);
		ContaEmpresarial contaEmpresarial1 = new ContaEmpresarial("Nubank", 64, 643, 64, 9800.0,
				LocalDate.parse("1999-04-10"), LocalDate.parse("2006-07-10"), "Divida", 10, cliente6, "Premium");

		//System.out.println(BuilderTextAccount(contaPoupanca1));
		System.out.println(StringTextAccount(contaPoupanca1));
	}

	public static String BuilderTextAccount(Conta conta) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d 'de' MMMM 'de' YYY");
		StringBuilder builderTextAccount = new StringBuilder();

		builderTextAccount.append(
				"A/O " + conta.getCliente().getPerfilCliente() + " de nome " + conta.getCliente().getNomeCliente());
		builderTextAccount.append(", numero do documento " + conta.getCliente().getNumeroDocumentoCliente());
		builderTextAccount.append(" possui uma " + conta.getClass().getSimpleName());
		builderTextAccount.append(
				" nesta instituição financeira, reconhecida pelo codigo " + conta.getCodigoIdentificadorBanco());
		builderTextAccount.append(", com valor de " + conta.getSaldo());
		builderTextAccount.append(" em conta em " + LocalDate.now());
		builderTextAccount.append("A " + conta.getClass().getSimpleName());
		builderTextAccount.append(", agencia " + conta.getNumAgencia());
		builderTextAccount.append(", foi aberta pelo " + conta.getCliente().getNomeCliente());
		builderTextAccount.append(" na data de " + conta.getDataAbertura());
		builderTextAccount.append(", na unidade presencial ou por meio de acesso digital nessa instituição.\n");

		if (conta.getDataFechamento() != null) {
			builderTextAccount.append("O Cliente " + conta.getCliente().getPerfilCliente());
			builderTextAccount.append(" encerrou sua " + conta.getClass().getSimpleName());
			builderTextAccount.append(" nesta instituição na data de " + conta.getDataFechamento());
			builderTextAccount.append(", pelo seguinte motivo: " + conta.getMotivoFechamento());
		}

		return builderTextAccount.toString();

	}

	public static String StringTextAccount(Conta conta) {

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("d 'de' MMM 'de' YYY");
		String StringTextAccount;

		StringTextAccount = ("A/O " + conta.getCliente().getPerfilCliente() + " de nome "
				+ conta.getCliente().getNomeCliente() + ", numero do documento "
				+ conta.getCliente().getNumeroDocumentoCliente() + ", possui uma conta "
				+ conta.getClass().getSimpleName() + " nesta instituição financeira, reconhecida pelo código "
				+ conta.getCodigoIdentificadorBanco() + ", com o valor de R$ " + String.format("%.2f", conta.getSaldo())
				+ " em conta em dia " + dtf.format(LocalDate.now()) + " A " + conta.getClass().getSimpleName()
				+ ", da agência " + conta.getNumAgencia() + ", e da conta " + conta.getNumeroConta()
				+ ", foi aberta pelo " + conta.getCliente().getNomeCliente() + " na data de "
				+ dtf.format(conta.getDataAbertura())
				+ ", em uma unidade presencial ou por meio de acesso digital desta instituição.\n");

		if (conta.getDataFechamento() != null) {
			StringTextAccount += ("" + "O cliente " + conta.getCliente().getNomeCliente() + " encerrou sua "
					+ conta.getClass().getSimpleName() + " nesta instituição na data de "
					+ dtf.format(conta.getDataFechamento()) + ", pelo seguinte motivo: " + conta.getMotivoFechamento());
		}
		return StringTextAccount;
	}
}
