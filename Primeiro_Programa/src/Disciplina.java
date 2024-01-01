
import java.util.*;

		//classe disciplina 
		//p todos os objetos notas e materias

public class Disciplina {
	
		//Atributos: Nome e Nota
	
	private String disciplina;
	private double nota;
	
	//construtor
	public Disciplina(){};
	
	
	//metodos get e set para disciplina e nota//
	public String getDisciplina() {
		return disciplina;
	}
	
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(double nota) {
		this.nota = nota;
	}
	
	
	
	//diferenciar objetos por atributos #hashcode
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
			//toString para mostrar
	@Override
	public String toString() {
		return "Disciplina [disciplina=" + disciplina + ", nota=" + nota + "]";
	}
	

}
	
	
	
	