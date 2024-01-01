import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public  class Aluno {
	//atributos//
private String nome;
private int idade;
private String cpf;
private String dataNascimento;
private String nomeMae;
private String nomePai;
private String dataMatricula;
private String nomeEscola;
private String serieMatriculado;



  	//superconstrutor//
public Aluno() {}


	//Criando os metodos get e set padroes//
public void setNome(String valor) {
	nome = valor;
}
public String getNome() {
	return nome;
}

public void setIdade(int valor) {
	idade = valor;
}
public int getIdade() {
	return idade;
}

public void setCpf(String valor) {
	cpf = valor;
}
public String getCpf() {
	return cpf;
}

public String getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(String dataNascimento) {
	this.dataNascimento = dataNascimento;
}

public String getNomeMae() {
	return nomeMae;
}
public void setNomeMae(String nomeMae) {
	this.nomeMae = nomeMae;
}

public String getNomePai() {
	return nomePai;
}
public void setNomePai(String nomePai) {
	this.nomePai = nomePai;
}

public String getDataMatricula() {
	return dataMatricula;
}
public void setDataMatricula(String dataMatricula) {
	this.dataMatricula = dataMatricula;
}

public String getNomeEscola() {
	return nomeEscola;
}
public void setNomeEscola(String nomeEscola) {
	this.nomeEscola = nomeEscola;
}

public String getSerieMatriculado() {
	return serieMatriculado;
}
public void setSerieMatriculado(String serieMatriculado) {
	this.serieMatriculado = serieMatriculado;
}


	//instanciando lista de objeto da classe disciplina //
private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
			
	//metodos get e set padroes.
	//eles eram necessários??

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public List<Disciplina> getDisciplinas(){
		return disciplinas;
	}
	
	//metodo de media 
	
public  double mediaAnual() {
	
	double somaNotas = 0.0;
	
	for( Disciplina disciplina : disciplinas) {
		somaNotas = somaNotas + disciplina.getNota();	
	}	
	 return somaNotas/disciplinas.size();
}



	//metodo p saber se aluno esta aprovado//
public String alunoAprovado() {
	double media = this.mediaAnual();
	if( media> 50 && media < 70) {
		if ( media >=70) {
			return StatusAluno.APROVADO;
		}
		return StatusAluno.RECUPERACAO;
	}else {
	return StatusAluno.REPROVADO;
		}
	}

	//metodo para diferenciar objetos por atributos	

@Override
public int hashCode() {
	return Objects.hash(cpf, dataMatricula, dataNascimento, disciplinas, idade, nome, nomeEscola, nomeMae, nomePai,
			serieMatriculado);

}


@Override
public String toString() {
	return "Aluno [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
			+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", dataMatricula=" + dataMatricula + ", nomeEscola="
			+ nomeEscola + ", serieMatriculado=" + serieMatriculado + ", disciplinas=" + disciplinas + "]";
}






}


 