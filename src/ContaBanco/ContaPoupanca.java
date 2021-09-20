package ContaBanco;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

import Cliente.Cliente;

public class ContaPoupanca extends Conta {

	private static final LocalDate getDataAbertura = null;
	private Double valorizacaoMensal = (double) 30;
	private Integer mesesCarencia = 7;
	private Integer qtdMaximaTransferencia = 10;


	public ContaPoupanca(String nomeBanco, Integer codigoIdentificadorBanco, Integer numConta, Integer numAgencia,
			double saldo, LocalDate dataAbertura, LocalDate dataFechamento, String motivoFechamento,
			Integer quantTransferencia, Cliente cliente) {
		super(nomeBanco, codigoIdentificadorBanco, numConta, numAgencia, saldo, dataAbertura, dataFechamento,
				motivoFechamento, quantTransferencia, cliente);

	}

	public Integer getQtdMaximaTransferencia() {
		return qtdMaximaTransferencia;
	}

	public void setQtdMaximaTransferencia(Integer qtdMaximaTransferencia) {
		this.qtdMaximaTransferencia = qtdMaximaTransferencia;
	}

	public Integer getMesesCarencia() {
		return mesesCarencia;
	}

	public void setMesesCarencia(Integer mesesCarencia) {
		this.mesesCarencia = mesesCarencia;
	}

	public Double getValorizacaoMensal() {
		return valorizacaoMensal;
	}

	public void setValorizacaoMensal(Double valorizacaoMensal) {
		this.valorizacaoMensal = valorizacaoMensal;
	}

	public void valorizacaoMensal() {
		Calendar cal = Calendar.getInstance();
		double resultado = 1.0;
		cal.setTime(new Date());
		int diaValorizacao = 27;
		int hoje = cal.get(Calendar.DAY_OF_MONTH);

		if (diaValorizacao == hoje) {
			System.out.printf("Saldo atual : %.2f\n", getSaldo());
			resultado = getSaldo() * getValorizacaoMensal();
			this.saldo += resultado;
			System.out.printf("Devido a valorização seu saldo atual é: %.2f\n", getSaldo());
		} else {
			System.out.println("Não foi cobrado juros");
		}
	}

	@Override
	public void saque(double saque) {
		LocalDate mesAtual = LocalDate.now();
		LocalDate finalCarencia = getDataAbertura;

		if (mesAtual.equals(finalCarencia) || mesAtual.isAfter(finalCarencia)) {
			if (!((getSaldo() - saque) < 0)) {
				this.saldo -= saque;
			} else {
				System.out.println("Saldo insulficiente para esta operação");
			}
		} else {
			System.out.println("O tempo para saque não ultrapassou " + getMesesCarencia() + " mese(s)");
		}
	}

	@Override
	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void transferencia(Conta conta, Double valor) {
		super.transferencia(conta, valor);
	}

	public void getPrimeiraContaPoupancaNoArray() {

	}

	public void getTamanhoArrayContaPoupanca() {

	}

	
	
	

//	@Override
//	public String toString() {
//		return "ContaPoupanca [valorizacaoMensal=" + valorizacaoMensal + ", mesesCarencia=" + mesesCarencia
//				+ ", qtdMaximaTransferencia=" + qtdMaximaTransferencia + ", cal=" + cal + ", cal2=" + cal2 + ", saldo="
//				+ saldo + "]";
//	}

}