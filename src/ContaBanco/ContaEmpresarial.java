package ContaBanco;

import java.time.LocalDate;

import Clientes.Clientes;

public class ContaEmpresarial extends Conta {

	private String nomeEmpresa;

	public ContaEmpresarial(String nomeBanco, String codigoIdentificadorBanco, String numConta, String numAgencia,
			double saldo, LocalDate dataAbertura, LocalDate dataFechamento, String motivoFechamento,
			Integer quantTransferencia, Clientes cliente, String nomeEmpresa) {
		super(nomeBanco, codigoIdentificadorBanco, numConta, numAgencia, saldo, dataAbertura, dataFechamento, motivoFechamento,
				quantTransferencia, cliente);
		this.nomeEmpresa = nomeEmpresa;
	}

	public String getNomeEmpresa() {
		return nomeEmpresa;
	}

	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}

	@Override
	public void saque(double saque) {
		if (((getSaldo() - saque) >= 0)) {
			this.saldo -= saque;
		} else {
			System.out.println("Saldo insufuciente, operação não realizada");
		}

	}

	@Override
	public void deposito(double deposito) {
		this.saldo += deposito;
	}

	public void transferencia(Conta conta, Double valor) {
		super.transferencia(conta, valor);
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString());
		sb.append("Nome da Empresa: " + getNomeEmpresa() + "\n");
		return sb.toString();
	}
	
}