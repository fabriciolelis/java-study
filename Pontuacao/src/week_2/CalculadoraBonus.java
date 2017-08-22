package week_2;

public class CalculadoraBonus {
	public int bonusDoDia = 1;
	
	public int bonusUsuario(Usuario u) {
		int multiplicador = bonusDoDia;
		if (u.vip) {
			multiplicador *= 5;
		}
		return multiplicador;
	}

}
