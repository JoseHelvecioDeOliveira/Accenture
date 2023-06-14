package Accenture;

public class Empresa {

	private String CNPJ;
	private String NomeFantasia;
	private String CEP;
	
	public Empresa(String CNPJ,String NomeFantasia, String CEP) {
	
	this.CNPJ = CNPJ;
	this.NomeFantasia = NomeFantasia;
	this.CEP = CEP;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getNomeFantasia() {
		return NomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}
	public String getCEP() {
		return CEP;
	}

	public void setCEP(String cEP) {
		CEP = cEP;
	}

}

