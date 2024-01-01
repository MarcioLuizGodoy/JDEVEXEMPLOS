import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class PrimeiraclasseJava {
	
public static void main(String[]args) {
	
	//instanciando lista de alunos
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	for(int qtd = 1; qtd<=2; qtd++ ) { //inicio do for gigante
	
	//Pedindo para usuario definir os dados dos atributos e guardando em variaveis para depois definitivamente setar
String nome = JOptionPane.showInputDialog("Qual e o nome do aluno" + qtd +"?");
String idade = JOptionPane.showInputDialog("Qual ea idade?");
String dataNascimento = JOptionPane.showInputDialog("Qual e a data de nascimento?");
String cpf = JOptionPane.showInputDialog("Qual e o cpf?");
String nomeMae = JOptionPane.showInputDialog("Qual e o nome da mae?");
String nomePai = JOptionPane.showInputDialog("Qual e o nome do Pai?");
String dataMatricula = JOptionPane.showInputDialog("Qual e data da matricula?");
String serieMatriculada = JOptionPane.showInputDialog("Qual e a serie matricula?");
String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");


	//instanciando objeto da classe Aluno
Aluno Aluno1 = new Aluno();


	//setando os dados que estavam salvos nas variaveis preenchidas pelo usuario
Aluno1.setNome(nome);
Aluno1.setIdade(Integer.valueOf(idade));
Aluno1.setDataNascimento("A data de nascimento e:" + dataNascimento);
Aluno1.setCpf("O cpf e:" + cpf);
Aluno1.setNomeMae("O nome da mae e: " + nomeMae);
Aluno1.setNomePai("O nome do pai e: " + nomePai);
Aluno1.setDataMatricula("A data matricula e: " + dataMatricula);
Aluno1.setSerieMatriculado("A serie matriculada e: " + serieMatriculada);
Aluno1.setNomeEscola("O nome da escola e: " + nomeEscola);


	for (int  posicao = 1; posicao <= 4; posicao ++) {
		String nomeDisciplina = JOptionPane.showInputDialog
				("Nome da disciplina"+posicao+"?");
		String notaDisciplina = JOptionPane.showInputDialog
				("Nota da disciplina"+posicao+ "?");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina(nomeDisciplina);
		disciplina.setNota(Double.valueOf(notaDisciplina));
		Aluno1.getDisciplinas().add(disciplina);		
	}
	
	
			//Perguntando se o usuario quer remover e continuar removendo disciplinas
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplpina?");
		if (escolha == 0) { // opção sim é 0
		int continuarRemover = 0;	
		int posicao =1;
		while( continuarRemover == 0) { 
		String disciplinaRemover = JOptionPane.showInputDialog("Qual a disciplina 1,2,3,4 ?");		 
		Aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -posicao);			
		posicao ++;
		continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar a remover");
			 }
	}
		//adicionando o aluno a lista de alunos
		alunos.add(Aluno1); 
		
		} // final do for gigante
	
for ( int pos = 0; pos <alunos.size(); pos++) {
	
		//Variavel instanciada na classe Aluno
	Aluno aluno = alunos.get(pos);
	
	if ( aluno.getNome().equalsIgnoreCase("Alex")) {
		Aluno trocar = new Aluno();
		 trocar.setNome("Aluno foi trocado");
		 
		 Disciplina disciplina = new Disciplina();
		 disciplina.setDisciplina("Matematica");
		 disciplina.setNota(100);
		 
		 trocar.getDisciplinas().add(disciplina);
		 
		 alunos.set(pos, trocar);
		 aluno = alunos.get(pos);
	}
	
	System.out.println("Aluno = " + aluno.getNome());
	System.out.println("Media = " + aluno.mediaAnual());
	System.out.println("Situação: " + aluno.alunoAprovado());
	System.out.println("--------------------------------------");
	
	for ( int posd = 0; posd < aluno.getDisciplinas().size(); posd++ ) {
		Disciplina disc = aluno.getDisciplinas().get(posd);
		System.out.println("Materia = " + disc.getDisciplina() + 
				"Nota = " + disc.getNota());
		
	}
}
	
	
	
	//chaves finais do main
	}
}

