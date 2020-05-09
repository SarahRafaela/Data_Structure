package ex1;

public class Casa {
	private Casa vizinha;
	private int numero;
	private String endereco;
	private String cor;

	public Casa() {

	}

	public Casa(Casa vizinha, int numero, String endereco, String cor) {
		super();
		this.vizinha = vizinha;
		this.numero = numero;
		this.endereco = endereco;
		this.cor = cor;
	}

	public Casa getVizinha() {
		return vizinha;
	}

	public void setVizinha(Casa vizinha) {
		this.vizinha = vizinha;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

}
