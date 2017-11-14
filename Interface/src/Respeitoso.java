
public class Respeitoso implements FormatadorNome {
	private String sexo;
	
	public Respeitoso(String sexo) {
		this.sexo = sexo;
	}

	public String getSexo() {
		return sexo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		if (getSexo().equals("m")) {
			return "Sr. " + nome + " " + sobrenome; 
		} else {
			return "Sra. " + nome + " " + sobrenome;
		}
	}
}
