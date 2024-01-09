import curso.javainterfaces.PermitirAcesso;

public class Secretario extends Pessoa  implements PermitirAcesso{

	private String registro;
	private String nivelCargo;
	private String experiencia;
	
	
	
	
	
	//metodos get e sets dos atributos proprios do objeto
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}	
	
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	
	//to string
	@Override
	public String toString() {
		return "Secretario [registro=" + registro + ", nivelCargo=" + nivelCargo + ", experiencia=" + experiencia + "]";
	}
	
	//sobreescrita do  metodo salario declarado em class Pessoa.
	@Override
	public double salario() {
		
		return 1800.80 * 0.9;
	}
	
	/*É necessario sobreescrever o metodo da interface*/
	@Override
	public boolean autenticar(String login, String senha) {
		
		return login.equals("admin") && senha.equals("admin");
		// principal parte do metodo que foi apenas declarado na interface
	}
	

	

	
	
}
