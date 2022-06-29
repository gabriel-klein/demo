package junit;

public class CalculadoraIMC {

	public String calcularImc(double peso, double altura, int idade, String sexo) {
		
		double imc = peso / (altura * altura);

		String resp = "";
		
		// Adultos 
		if(idade >= 20 && idade <= 65) {
			if(imc < 16) {
				resp = "Baixo peso muito grave";
			}
			else if (imc >= 16 && imc <= 16.99) {
				resp = "Baixo peso grave";
			}
			else if(imc >= 17 && imc <= 18.49) {
				resp = "Baixo peso";
			}
			else if(imc >= 18.50 && imc <= 24.99) {
				resp = "Peso normal";
			}
			else if (imc >= 25 && imc <= 29.99) {
				resp = "Sobrepeso";
			}
			else if(imc >= 30 && imc <= 34.99) {
				resp = "Obesidade grau I";
			}
			else if (imc >= 35 && imc <= 39.99) {
				resp = "Obesidade grau II";
			}
			else if(imc > 40) {
				resp = "Obesidade grau III (obesidade mórbida)";
			}
		}
		
		// Idosos
		else if(idade > 65) {

			if(sexo == "feminino"){
				if(imc < 21.9) {
					resp = "Baixo peso";
				}
				else if(imc >= 22 && imc <= 27) {
					resp = "Peso normal";
				}
				else if (imc >= 27.1 && imc <= 32) {
					resp = "Sobrepeso";
				}
				else if(imc >= 32.1 && imc <= 37) {
					resp = "Obesidade grau I";
				}
				else if (imc >= 37.1 && imc <= 41.91) {
					resp = "Obesidade grau II";
				}
				else if(imc > 42) {
					resp = "Obesidade grau III (obesidade mórbida)";
				}
			}

			else if(sexo == "masculino"){
				if(imc < 21.9) {
					resp = "Baixo peso";
				}
				else if(imc >= 22 && imc <= 27) {
					resp = "Peso normal";
				}
				else if (imc >= 27.1 && imc <= 30) {
					resp = "Sobrepeso";
				}
				else if(imc >= 30.1 && imc <= 35) {
					resp = "Obesidade grau I";
				}
				else if (imc >= 35.1 && imc <= 39.99) {
					resp = "Obesidade grau II";
				}
				else if(imc > 40) {
					resp = "Obesidade grau III (obesidade mórbida)";
				}
			}
		}
		
		// Crianças
		else if (idade < 20) {
			
			if(sexo == "feminino") {
				
				if(idade == 2) {
				
					if(imc < 16) {
						resp = "Baixo peso";
					}
					else if(imc >= 16 && imc < 18) {
						resp = "Peso normal";
					}
					else if(imc >= 18 && imc < 19) {
						resp = "Sobrepeso";
					}
					else if(imc >= 19) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 4) {
					
					if(imc < 14) {
						resp = "Baixo peso";
					}
					else if(imc > 14 && imc <= 16.9) {
						resp = "Peso normal";
					}
					else if(imc > 16.9 && imc < 18) {
						resp = "Sobrepeso";
					}
					else if(imc >= 18) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 6) {
					
					if(imc < 14.9) {
						resp = "Baixo peso";
					}
					else if(imc >= 14.9 && imc <= 17) {
						resp = "Peso normal";
					}
					else if(imc > 17 && imc <= 18.8) {
						resp = "Sobrepeso";
					}
					else if(imc > 18.8) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 8) {
					
					if(imc < 14) {
						resp = "Baixo peso";
					}
					else if(imc >= 14 && imc <= 18.2) {
						resp = "Peso normal";
					}
					else if(imc > 18.2 && imc <= 20.6) {
						resp = "Sobrepeso";
					}
					else if(imc > 20.6) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 10) {
					
					if(imc < 14.5) {
						resp = "Baixo peso";
					}
					else if(imc >= 14.5 && imc <= 20) {
						resp = "Peso normal";
					}
					else if(imc > 20 && imc <= 23) {
						resp = "Sobrepeso";
					}
					else if(imc > 23) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 12) {
					
					if(imc < 16.4) {
						resp = "Baixo peso";
					}
					else if(imc >= 16.4 && imc <= 21.7) {
						resp = "Peso normal";
					}
					else if(imc > 21.7 && imc <= 25) {
						resp = "Sobrepeso";
					}
					else if(imc > 25) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 14) {
		
					if(imc < 16.3) {
						resp = "Baixo peso";
					}
					else if(imc >= 16.3 && imc <= 23.1) {
						resp = "Peso normal";
					}
					else if(imc > 23.1 && imc <= 27.1) {
						resp = "Sobrepeso";
					}
					else if(imc > 27.1) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 16) {
					
					if(imc < 17.3) {
						resp = "Baixo peso";
					}
					else if(imc >= 17.3 && imc <= 24.6) {
						resp = "Peso normal";
					}
					else if(imc > 24.6 && imc <= 28.9) {
						resp = "Sobrepeso";
					}
					else if(imc > 28.9) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 18) {
					
					if(imc < 18.1) {
						resp = "Baixo peso";
					}
					else if(imc >= 18.1 && imc <= 25.7) {
						resp = "Peso normal";
					}
					else if(imc > 25.7 && imc <= 30.1) {
						resp = "Sobrepeso";
					}
					else if(imc > 30.1) {
						resp = "Obesidade";
					}
				}
				
			}

			else if(sexo == "masculino") {
				
				if(idade == 2) {
					
					if(imc < 15) {
						resp = "Baixo peso";
					}
					else if(imc >= 15 && imc <= 18) {
						resp = "Peso normal";
					}
					else if(imc > 18 && imc <= 19.1) {
						resp = "Sobrepeso";
					}
					else if(imc > 19.1) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 4) {
					
					if(imc < 14.2) {
						resp = "Baixo peso";
					}
					else if(imc >= 14.2 && imc <= 16.98) {
						resp = "Peso normal";
					}
					else if(imc > 16.98 && imc <= 17.9) {
						resp = "Sobrepeso";
					}
					else if(imc > 17.9) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 6) {
					
					if(imc < 14) {
						resp = "Baixo peso";
					}
					else if(imc >= 14 && imc <= 17) {
						resp = "Peso normal";
					}
					else if(imc > 17 && imc <= 18.2) {
						resp = "Sobrepeso";
					}
					else if(imc > 18.2) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 8) {
					
					if(imc < 14.1) {
						resp = "Baixo peso";
					}
					else if(imc >= 14.1 && imc <= 17.95) {
						resp = "Peso normal";
					}
					else if(imc > 17.95 && imc <= 20) {
						resp = "Sobrepeso";
					}
					else if(imc > 20) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 10) {
					
					if(imc < 14.6) {
						resp = "Baixo peso";
					}
					else if(imc >= 14.6 && imc <= 19.3) {
						resp = "Peso normal";
					}
					else if(imc > 19.3 && imc <= 22) {
						resp = "Sobrepeso";
					}
					else if(imc > 22) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 12) {
					
					if(imc < 15.4) {
						resp = "Baixo peso";
					}
					else if(imc >= 15.4 && imc <= 21) {
						resp = "Peso normal";
					}
					else if(imc > 21 && imc <= 24) {
						resp = "Sobrepeso";
					}
					else if(imc > 24) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 14) {
					
					if(imc < 16.5) {
						resp = "Baixo peso";
					}
					else if(imc >= 16.5 && imc <= 22.7) {
						resp = "Peso normal";
					}
					else if(imc > 22.7 && imc <= 26) {
						resp = "Sobrepeso";
					}
					else if(imc > 26) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 16) {
					
					if(imc < 17.8) {
						resp = "Baixo peso";
					}
					else if(imc >= 17.8 && imc <= 24.1) {
						resp = "Peso normal";
					}
					else if(imc > 24.1 && imc <= 27.5) {
						resp = "Sobrepeso";
					}
					else if(imc > 27.5) {
						resp = "Obesidade";
					}
				}
				
				if(idade == 18) {
					
					if(imc < 18.9) {
						resp = "Baixo peso";
					}
					else if(imc >= 18.9 && imc <= 25.6) {
						resp = "Peso normal";
					}
					else if(imc > 25.6 && imc <= 28.9) {
						resp = "Sobrepeso";
					}
					else if(imc > 28.9) {
						resp = "Obesidade";
					}
				}
			}
	
		}
		
		return resp;
	}

}
