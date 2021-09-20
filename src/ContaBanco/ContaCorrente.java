package ContaBanco;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

import Cliente.Cliente;

public class ContaCorrente extends Conta {

	static Double tafifaBancaria = 13.0;
	private Integer quantMaximaTransferencia;
	private Integer quantMaximaSaque;
	private int quantSaque = 0;
	private int quantTransferencia = 0;
	private Conta conta;
	private Double valor;
	private double saldo;

	public ContaCorrente(String nomeBanco, Integer codigoIdentificadorBanco, Integer numConta, Integer numAgencia,
			double saldo, LocalDate dataAbertura, LocalDate dataFechamento, String motivoFechamento,
			Integer quantTransferencia, Cliente cliente, Integer quantMaximaTransferencia, Integer quantMaximaSaque) {
		super(nomeBanco, codigoIdentificadorBanco, numConta, numAgencia, saldo, dataAbertura, dataFechamento,
				motivoFechamento, quantTransferencia, cliente);
		this.quantMaximaSaque = quantMaximaSaque;
		this.quantMaximaTransferencia = quantMaximaTransferencia;
	}

	public Integer getQuantMaximaTransferencia() {
		return quantMaximaTransferencia;
	}

	public void setQuantMaximaTransferencia(Integer quantMaximaTransferencia) {
		this.quantMaximaTransferencia = quantMaximaTransferencia;
	}

	public Integer quantMaximaSaque() {
		return quantMaximaSaque;
	}

	public void setQuantSaque(Integer quantSaque) {
		this.quantSaque = quantSaque;
	}

	public void saque(double saque) {
		if (quantSaque <= quantMaximaSaque()) {
			if ((getSaldo() - saque) >= 0) {
				this.saldo -= saque;
				quantSaque++;
			} else {
				System.out.println("Saldo insuficiente");
			}
		} else {
			System.out.println("Para concluir está operação será cobrado uma taxa adicional");
			if ((getSaldo() - saque) >= 0) {
				this.saldo -= saque - 4.0;
				quantSaque++;
				System.out.println(getSaldo());
			} else {
				System.out.println("Saldo insuficiente");
			}
		}
	}

	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void transferenciaContaCorrente(Conta conta, double valor) {
		if (quantTransferencia >= getQuantMaximaTransferencia()) {
			System.out.println("Operação não realizada, você atigingiu o limite de saque");
		}

		else {
			super.transferencia(conta, valor);
			quantTransferencia++;
		}
	}

	public void tarifaBancaria() {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date(quantMaximaSaque));
		int diaTarifa = 1;

		if (cal.get(Calendar.DAY_OF_MONTH) == diaTarifa) {
			System.out.printf("Seu saldo era de %.2f\n", getSaldo());

			this.saldo -= ContaCorrente.tafifaBancaria;
			System.out.printf("Taxa mensal de 13,0 foi debitado do seu saldo, e agora seu saldo é: %.2f\n", getSaldo());
		} else {
			System.out.println("Ainda não será realizada a cobrança tarifa mensal");
		}

	}

	@Override
	public String toString() {
		return "ContaCorrente [quantMaximaTransferencia=" + quantMaximaTransferencia + ", quantMaximaSaque="
				+ quantMaximaSaque + ", quantSaque=" + quantSaque + ", quantTransferencia=" + quantTransferencia
				+ ", conta=" + conta + ", valor=" + valor + ", saldo=" + saldo + "cliente = "
				+ getCliente().getNomeCliente() + "]";
	}

}