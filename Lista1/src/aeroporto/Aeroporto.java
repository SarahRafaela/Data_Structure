package aeroporto;

public class Aeroporto {
 private String sigla;
 private Aeroporto prox;

 
 public Aeroporto() {
	 
 }
 
 public Aeroporto(String s, Aeroporto p) {
	 this.sigla = s;
	 this.prox = p;
 }
 
 public Aeroporto(String s) {
	 this.sigla = s;
 }

public String getSigla() {
	return sigla;
}

public void setSigla(String sigla) {
	this.sigla = sigla;
}

public Aeroporto getProx() {
	return prox;
}

public void setProx(Aeroporto prox) {
	this.prox = prox;
}
 
}
