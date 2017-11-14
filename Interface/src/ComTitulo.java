
public class ComTitulo implements FormatadorNome {
	private String titulo;
	
	public ComTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	@Override
	public String formatarNome(String nome, String sobrenome) {
		
		return getTitulo() + " " + nome + " " + sobrenome ;
	}

}
