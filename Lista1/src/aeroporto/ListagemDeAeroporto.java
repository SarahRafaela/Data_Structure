package aeroporto;

public class ListagemDeAeroporto {
	public static void main(String[] args) {
		
	
	AeroportoList lista = new AeroportoList();
	lista.addInicio(new Aeroporto("GRU"));
	lista.addInicio(new Aeroporto("REC"));
	lista.addInicio(new Aeroporto("LAX"));
	lista.addFim(new Aeroporto("ABQ"));
	lista.addFim(new Aeroporto ("AAR"));
	
	lista.show();
	
	
}
	}
