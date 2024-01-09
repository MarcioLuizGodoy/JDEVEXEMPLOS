import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;


public class PrimeiraclasseJava {
	
public static void main(String[]args) {
	
	String login = JOptionPane.showInputDialog("Informe o login");
	String senha = JOptionPane.showInputDialog("Informe a senha");
	
	
Secretario  secretario = new Secretario();
	

	
	if( secretario.autenticar(login, senha)) { 
		// se true acessa, se false não acessa.
	
		
	
	//instanciando lista de alunos
	
	List<Aluno> alunos = new ArrayList<Aluno>();
	
	HashMap< String , List<Aluno> > colecao = new HashMap<String, List<Aluno>>();
	
	
	for(int qtd = 1; qtd<=2; qtd++ ) {
		//inicio do for gigante
	
	//Pedindo para usuario definir os dados dos atributos 
	//e guardando em variaveis para depois definitivamente setar
		
String nome = JOptionPane.showInputDialog("Qual e o nome do aluno" + qtd +"?");
/*String idade = JOptionPane.showInputDialog("Qual ea idade?");
String dataNascimento = JOptionPane.showInputDialog("Qual e a data de nascimento?");
String cpf = JOptionPane.showInputDialog("Qual e o cpf?");
String nomeMae = JOptionPane.showInputDialog("Qual e o nome da mae?");
String nomePai = JOptionPane.showInputDialog("Qual e o nome do Pai?");
String dataMatricula = JOptionPane.showInputDialog("Qual e data da matricula?");
String serieMatriculada = JOptionPane.showInputDialog("Qual e a serie matricula?");
String nomeEscola = JOptionPane.showInputDialog("Qual o nome da escola?");*/


	//instanciando objeto da classe Aluno

Aluno Aluno1 = new Aluno();


	//setando os dados que estavam salvos nas variaveis 
	//preenchidas pelo usuario

Aluno1.setNome(nome);

/*Aluno1.setIdade(Integer.valueOf(idade));
Aluno1.setDataNascimento("A data de nascimento e:" + dataNascimento);
Aluno1.setCpf("O cpf e:" + cpf);
Aluno1.setNomeMae("O nome da mae e: " + nomeMae);
Aluno1.setNomePai("O nome do pai e: " + nomePai);
Aluno1.setDataMatricula("A data matricula e: " + dataMatricula);
Aluno1.setSerieMatriculado("A serie matriculada e: " + serieMatriculada);
Aluno1.setNomeEscola("O nome da escola e: " + nomeEscola);*/


	for (int  posicao = 1; posicao <= 1; posicao ++) {
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
		
		// final do for gigante
		}
	colecao.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
	colecao.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
	colecao.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
	for (Aluno aluno : alunos) {
			
			if(aluno.alunoAprovado().equalsIgnoreCase(StatusAluno.APROVADO)) {
				colecao.get(StatusAluno.APROVADO).add(aluno);
				
			} else if (aluno.alunoAprovado().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
				colecao.get(StatusAluno.RECUPERACAO).add(aluno);
				
			} 	else if (aluno.alunoAprovado().equalsIgnoreCase(StatusAluno.REPROVADO)) {
				colecao.get(StatusAluno.REPROVADO).add(aluno);
			}
		}
	
	
		System.out.println("----Lista dos Aprovados----");	
		
		for (Aluno aluno : colecao.get(StatusAluno.APROVADO) ) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Resultado:" + aluno.alunoAprovado()+ "com media de : " 
					+aluno.mediaAnual());
		}
		
		System.out.println("----Lista dos Recuperacao----");
		
		for (Aluno aluno : colecao.get(StatusAluno.RECUPERACAO)) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Resultado:" + aluno.alunoAprovado()+ "com media de : " 
					+aluno.mediaAnual());			
		}
		
		System.out.println("----Lista dos Reprovados----");
		
		for (Aluno aluno : colecao.get(StatusAluno.REPROVADO)) {
			System.out.println("Nome: " + aluno.getNome());
			System.out.println("Resultado:" + aluno.alunoAprovado()+ "com media de : " 
					+aluno.mediaAnual());
		}
	
	} else {
		JOptionPane.showMessageDialog(null, "Ta errado cuzão <3");
	}
	//chaves finais do main
	}
}

