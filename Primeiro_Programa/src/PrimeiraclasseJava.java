import javax.swing.JOptionPane;

public class PrimeiraclasseJava {
	
public static void main(String[]args) {
	
/*String nome = JOptionPane.showInputDialog("Qual e o nome do aluno?");
String idade = JOptionPane.showInputDialog("Qual ea idade?");
String dataNascimento = JOptionPane.showInputDialog("Qual e a data de nascimento?");
String cpf = JOptionPane.showInputDialog("Qual e o cpf?");
String nomeMae = JOptionPane.showInputDialog("Qual e o nome da mae?");
String nomePai = JOptionPane.showInputDialog("Qual e o nome do Pai?");
String dataMatricula = JOptionPane.showInputDialog("Qual e data da matricula?");
String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");
String serieMatriculada = JOptionPane.showInputDialog("Qual e a serie matricula?");

String nota1 = JOptionPane.showInputDialog("Qual e a nota1? ");
String nota2 = JOptionPane.showInputDialog("Qual e a nota2?");
String nota3 = JOptionPane.showInputDialog("Qual e a nota3 ?");
String nota4 = JOptionPane.showInputDialog("Qual e a nota4 ?");

Aluno Aluno1 = new Aluno();

Aluno1.setNome(nome);
Aluno1.setIdade(Integer.valueOf(idade));
Aluno1.setDataNascimento("A data de nascimento e:" + dataNascimento);
Aluno1.setCpf("O cpf e:" + cpf);
Aluno1.setNomeMae("O nome da mae e: " + nomeMae);
Aluno1.setNomePai("O nome do pai e: " + nomePai);
Aluno1.setDataMatricula("O nome do pai e: " + dataMatricula);
Aluno1.setSerieMatriculado("A serie matriculada e: " + serieMatriculada);
Aluno1.setNomeEscola("O nome da escola e: " + nomeEscola);

Aluno1.setNota1(Double.parseDouble(nota1));
Aluno1.setNota2(Double.parseDouble(nota2));
Aluno1.setNota3(Double.parseDouble(nota3));
Aluno1.setNota4(Double.parseDouble(nota4));

Aluno1.MediaNota();
Aluno1.alunoAprovado();

	
	System.out.println(Aluno1);
	System.out.println("media do aluno: " + Aluno1.MediaNota());
	System.out.println("Resultado " + Aluno1.alunoAprovado());*/
	
	
	
	Aluno aluno1 = new Aluno();
	aluno1.setNome("Alex");
	
	
	Aluno aluno2 = new Aluno();
	aluno2.setNome("Alex");
	
	if(aluno1.equals(aluno2)) {
		System.out.println("Alunos sao iguais");
	} else {
		System.out.println("Alunos n sao iguais");
	}
	
	
	
	
	
	
	
}
}

