public class Paciente {
	private double peso;
	private double altura;
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Paciente (double peso, double altura) {
		this.setPeso(peso);
		this.setAltura(altura);
	}
	
	public double calcularIMC() {
		return getPeso() / (getAltura() * getAltura());
	}
	
	public String diagnostico() {
		double valorIMC = this.calcularIMC();
		
		if (valorIMC < 16) {
			return "Baixo peso muito grave";
		} 
		else if (valorIMC >= 16 && valorIMC <= 16.99) {
			return "Baixo peso muito grave";
		}
		else if (valorIMC >= 17 && valorIMC <= 18.49) {
			return "Baixo peso";
		}
		else if (valorIMC >= 18.50 && valorIMC <= 24.99) {
			return "Peso normal";
		}
		else if (valorIMC >= 25 && valorIMC <= 29.99) {
			return "Sobrepeso";
		}
		else if (valorIMC >= 30 && valorIMC <= 34.99) {
			return "Obesidade grau I";
		}
		else if (valorIMC >= 35 && valorIMC <= 39.99) {
			return "Obesidade grau II";
		}
		else {
			return "Obesidade grau III (obesidade mórbida)";
		}
	}
}
