package exAluno;

import javax.swing.JOptionPane;

public class MenuPrincipal {
	public static void main(String[] args) {
		Aluno aluno = new Aluno();

		ListaEncadeada lista = new ListaEncadeada();
		// lista.adcionaAluno(aluno);
		int opc = 0;

		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane
					.showInputDialog("MENU PRINCIPAL" + "\n ESCOLA" + "\n 1 - ADCIONAR ALUNOS" + "\n 2 - REMOVER ALUNOS"
							+ "\n 3 - LISTAR ALUNOS" + "\n 4 - OBTER MÉDIA ALUNOS" + "\n 9 - TERMINAR EXECUÇÃO"));
			switch (opc) {
			case 1:
				aluno = new Aluno();
				aluno = recolheDados();
				lista.adcionaAluno(aluno);
				break;

			case 2:
				String aluno_nome = JOptionPane.showInputDialog("informe o nome do  Aluno a ser removido:");
				JOptionPane.showMessageDialog(null, lista.removeAluno(aluno_nome));
				break;
			case 3:
				lista.ListarAluno();
				break;
			case 4:
				String nome_aluno = JOptionPane.showInputDialog("informe o nome do  Aluno para obter a média:");
				try {
					lista.obterMediaAluno(nome_aluno);
				} catch (UnderflowException e) {
					e.printStackTrace();
				}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Operação Inválida!", "Error", 2);
				break;
			}

		}
	}

	public static Aluno recolheDados() {
		String nome = JOptionPane.showInputDialog("informe o nome do  Aluno:");
		String numeroDeMatricula = JOptionPane.showInputDialog("informe o numero da Matrícula:");
		String disciplina = JOptionPane.showInputDialog("informe a disciplina cursada:");

		float notaP1 = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a primeira nota?"));
		float notaP2 = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a segunda nota?"));

		float notaSub = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a nota substitutiva?"));
		float notaEx = Float.parseFloat(JOptionPane.showInputDialog("Qual foi a nota do exercicio?"));
		Aluno aluno = new Aluno(nome, numeroDeMatricula, disciplina, notaP1, notaP2, notaSub, notaEx);
		return aluno;

	}
}
