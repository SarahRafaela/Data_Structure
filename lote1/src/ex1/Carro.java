package ex1;

public class Carro {

	private String marca;
	private String placa;
	private int anoLancamento;
	private int numPortas;
	private boolean airbag;
	private Carro next;

	public Carro(String marca, String placa, int anoLancamento, int numPortas, boolean airbag, Carro next) {
		super();
		this.marca = marca;
		this.placa = placa;
		this.anoLancamento = anoLancamento;
		this.numPortas = numPortas;
		this.airbag = airbag;
		this.next = next;
	}

	public Carro() {

	}

	public Carro getNext() {
		return next;
	}

	public void setNext(Carro next) {
		this.next = next;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnoLancamento() {
		return anoLancamento;
	}

	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}

	public boolean isAirbag() {
		return airbag;
	}

	public void setAirbag(boolean airbag) {
		this.airbag = airbag;
	}

}
