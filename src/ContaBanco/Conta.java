package ContaBanco;

import java.sql.Date;
import java.text.DateFormat;
import java.time.LocalDate;


import Clientes.Clientes;

public abstract class Conta {

	private String nomeBanco;
	private String codigoIdentificadorBanco;
	private String numConta;
	private String numAgencia;
	protected double saldo;
	protected LocalDate dataAbertura;
	private LocalDate dataFechamento;
	private String motivoFechamento;
	private Integer quantTransferencia;

	private Clientes clientes;

	

	public Conta(String nomeBanco, String codigoIdentificadorBanco, String numConta, String numAgencia, double saldo,
			LocalDate dataAbertura, LocalDate dataFechamento, String motivoFechamento, Integer quantTransferencia,
			Clientes clientes) {
		this.nomeBanco = nomeBanco;
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

	public String getCodigoIdentificadorBanco() {
		return codigoIdentificadorBanco;
	}

	public void setCodigoIdentificadorBanco(String codigoIdentificadorBanco) {
		this.codigoIdentificadorBanco = codigoIdentificadorBanco;
	}

	public String getNumeroConta() {
		return numConta;
	}

	public void setNumeroConta(String numConta) {
		this.numConta = numConta;
	}

	public String getNumAgencia() {
		return numAgencia;
	}

	public void setNumeroAgencia(String numAgencia) {
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

}
