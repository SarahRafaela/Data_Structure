package ex1;

public class Paciente {
	private Paciente proxPaciente;
	private String nome;
	private String horarioAgendado;

	public Paciente() {

	}

	public Paciente(Paciente proxPaciente, String nome, String horarioAgendado) {
		super();
		this.proxPaciente = proxPaciente;
		this.nome = nome;
		this.horarioAgendado = horarioAgendado;
	}

	public Paciente getProxPaciente() {
		return proxPaciente;
	}

	public void setProxPaciente(Paciente proxPaciente) {
		this.proxPaciente = proxPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getHorarioAgendado() {
		return horarioAgendado;
	}

	public void setHorarioAgendado(String horarioAgendado) {
		this.horarioAgendado = horarioAgendado;
	}

}
