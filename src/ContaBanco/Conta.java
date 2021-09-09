package ContaBanco;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import Clientes.Clientes;

public abstract class Conta implements Comparable<Conta> {


	private String nomeBanco;
	private Integer codigoIdentificadorBanco;
	private Integer numConta;
	private Integer numAgencia;
	protected double saldo;
	protected LocalDate dataAbertura;
	private LocalDate dataFechamento;
	private String motivoFechamento;
	private Integer quantTransferencia;

	private Clientes clientes;

	public Conta(String nomeBanco, Integer codigoIdentificadorBanco, Integer numConta, Integer numAgencia, double saldo,
			LocalDate dataAbertura, LocalDate dataFechamento, String motivoFechamento, Integer quantTransferencia,
			Clientes clientes) {
		// this.nomeBanco = nomeBanco;
		this.codigoIdentificadorBanco = codigoIdentificadorBanco;
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.saldo = saldo;
		this.dataAbertura = dataAbertura;
		this.dataFechamento = dataFechamento;
		this.motivoFechamento = motivoFechamento;
		this.quantTransferencia = quantTransferencia;
		this.clientes = clientes;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public Integer getCodigoIdentificadorBanco() {
		return codigoIdentificadorBanco;
	}

	public void setCodigoIdentificadorBanco(Integer codigoIdentificadorBanco) {
		this.codigoIdentificadorBanco = codigoIdentificadorBanco;
	}

	public Integer getNumeroConta() {
		return numConta;
	}

	public void setNumeroConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Integer getNumAgencia() {
		return numAgencia;
	}

	public void setNumeroAgencia(Integer numAgencia) {
		this.numAgencia = numAgencia;
	}

	public Double getSaldo() {
		return this.saldo;
	}

	public LocalDate getDataAbertura() {
		return dataAbertura;
	}

	public LocalDate getDataFechamento() {
		return dataFechamento;
	}

	public void setDataFechamento(LocalDate dataFechamento) {
		this.dataFechamento = dataFechamento;
	}

	public String getMotivoFechamento() {
		return motivoFechamento;
	}

	public void setMotivoFechamento(String motivoFechamento) {
		this.motivoFechamento = motivoFechamento;
	}

	public Clientes getClientes() {
		return clientes;
	}

	public void setClientes(Clientes clientes) {
		this.clientes = clientes;
	}

	public Integer getQuantTransferencia() {
		return quantTransferencia;
	}

	public abstract void saque(double saque);

	public abstract void deposito(double deposito);

	public void transferencia(Conta conta, double valor) {
		if (saldo > 0) {
			saldo -= valor;
			conta.deposito(valor);
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numAgencia == null) ? 0 : numAgencia.hashCode());
		result = prime * result + ((numConta == null) ? 0 : numConta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conta other = (Conta) obj;
		if (numAgencia == null) {
			if (other.numAgencia != null)
				return false;
		} else if (!numAgencia.equals(other.numAgencia))
			return false;
		if (numConta == null) {
			if (other.numConta != null)
				return false;
		} else if (!numConta.equals(other.numConta))
			return false;
		return true;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(clientes.toString());
		sb.append("Nome do Banco: " + getNomeBanco() + "\n");
		sb.append("Codigo Identificador: " + getCodigoIdentificadorBanco() + "\n");
		sb.append("Numero da Conta: " + getNumAgencia() + "\n");
		sb.append("Numero da Agencia: " + getNumAgencia() + "\n");
		sb.append("Saldo Atual: " + String.format("%.2f", getSaldo()) + "\n");
		sb.append("Data de Abertura: " + (getDataAbertura()) + "\n");
		return sb.toString();
	}

	public void transferencia(Conta conta, Double valor) {
		if (getSaldo() >= valor) {
			this.saldo -= valor;
			conta.deposito(valor);
		} else {
			System.out.println("Você não possui saldo suficiente para está operação");
		}
	}

	public int compareTo(Conta conta) {
		if ((this.numAgencia) < (conta.numAgencia)) {
				return -1;
		}
		if ((this.numAgencia) > (conta.numAgencia)) {
				return 1;
		}
		if ((this.numConta) < (conta.numConta)) {
				return -1;
		}
		if ((this.numConta) > (conta.numConta)) {
				return 1;
		}
		return 0;
	}

}