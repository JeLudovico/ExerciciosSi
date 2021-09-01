package Clientes;

public class Clientes {

	private String nomeCliente;
	private Integer numeroDocumentoCliente;
	private Integer numConta;
	private Integer numAgencia;
	private PerfilCliente PerfilCliente;

	public Clientes(String nomeCliente, Integer numeroDocumentoCliente, Integer numConta, Integer numAgencia,
			PerfilCliente perfilCliente) {
		this.nomeCliente = nomeCliente;
		this.numeroDocumentoCliente = numeroDocumentoCliente;
		this.numConta = numConta;
		this.numAgencia = numAgencia;
		this.PerfilCliente = perfilCliente;
	}

	public Clientes(String string, String string2, double d, PerfilCliente pessoaJuridica) {
		// TODO Auto-generated constructor stub
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCLiente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Integer getNumeroDocumentoCliente() {
		return numeroDocumentoCliente;
	}

	public void setNumeroDocumentoCliente(Integer numeroDocumentoCliente) {
		this.numeroDocumentoCliente = numeroDocumentoCliente;
	}

	public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public Integer getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(Integer numConta) {
		this.numAgencia = numAgencia;
	}

	public PerfilCliente getPerfilCliente() {
		return PerfilCliente;
	}

	public void setPerfil_Cliente(PerfilCliente perfilCliente) {
		this.PerfilCliente = PerfilCliente;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroDocumentoCliente == null) ? 0 : numeroDocumentoCliente.hashCode());
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
		Clientes other = (Clientes) obj;
		if (numeroDocumentoCliente == null) {
			if (other.numeroDocumentoCliente != null)
				return false;
		} else if (!numeroDocumentoCliente.equals(other.numeroDocumentoCliente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [nomeCliente=" + nomeCliente + ", numeroDocumentoCliente=" + numeroDocumentoCliente
				+ ", numConta=" + numConta + ", numAgencia=" + numAgencia + ", Perfil_Cliente=" + PerfilCliente + "]";
	}

}
