package Accenture;

public class FornecedorJuridico {

	private String CNPJ;
	private String CPF;
	private String Nome;
	private String Email;
	private String CEP;
	
	public FornecedorJuridico() {
	
	this.CNPJ = CNPJ;
	this.Nome = Nome;
	this.CEP = CPF;
	this.Email = Email;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}
	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	
	public String getNome() {
		return Nome;
	}

	public void setNome(String NOME) {
		Nome = NOME;
	}
	public String getEmail() {
		return Email;
	}

	public void setEmail(String eMail) {
		Email = eMail;
	}
	
	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

}


