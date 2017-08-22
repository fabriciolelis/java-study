package week_2;

public class RegistroPontos {
	private CalculadoraBonus bonus;
	
	public RegistroPontos(CalculadoraBonus cb) {
		bonus = cb;
	}
	
	public void fazerUmComentario(Usuario u) {
		u.pontos += 3 * bonus.bonusUsuario(u);
	}
	
	public void criarUmTopico(Usuario u) {
		u.pontos += 5 * bonus.bonusUsuario(u);
	}
	
	public void darUmLike(Usuario u) {
		u.pontos += 1 * bonus.bonusUsuario(u);
	}
}
