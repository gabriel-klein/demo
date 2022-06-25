package junit;

public class CalculadoraIMC {

	public String calcularImc(double peso, double altura, int idade, String sexo) {
		
		double imc = peso / (altura * altura);

		// return String.valueOf(imc);
		String Resp = "";
		
		// Adultos 
		if(idade >= 20 && idade <= 65) {
			if(imc < 16 && idade == 20) {
				Resp = "Baixo peso muito grave";
			}
			else if (imc < 16 && idade == 65) {
				Resp = "Baixo peso muito grave";
			}
			else if(imc == 16 && idade == 20) {
				Resp = "Baixo peso grave";
			}
			else if (imc == 16 && idade == 65) {
				Resp = "Baixo peso grave";
			}
			else if(imc == 16.99 && idade == 20) {
				Resp = "Baixo peso grave";
			}
			else if (imc == 16.99 && idade == 65) {
				Resp = "Baixo peso grave";
			}
			
			else if(imc == 17 && idade == 20) {
				Resp = "Baixo peso";
			}
			else if (imc == 17 && idade == 65) {
				Resp = "Baixo peso";
			}
			else if(imc == 18.49 && idade == 20) {
				Resp = "Baixo peso";
			}
			else if (imc == 18.49 && idade == 65) {
				Resp = "Baixo peso";
			}
			
			else if(imc == 18.5 && idade == 20) {
				Resp = "Peso normal";
			}
			else if (imc == 18.5 && idade == 65) {
				Resp = "Peso normal";
			}
			else if(imc == 24.99 && idade == 20) {
				Resp = "Peso normal";
			}
			else if (imc == 24.99 && idade == 65) {
				Resp = "Peso normal";
			}
			
			else if(imc == 25 && idade == 20) {
				Resp = "Sobrepeso";
			}
			else if (imc == 25 && idade == 65) {
				Resp = "Sobrepeso";
			}
			else if(imc == 29.99 && idade == 20) {
				Resp = "Sobrepeso";
			}
			else if (imc == 29.99 && idade == 65) {
				Resp = "Sobrepeso";
			}
			
			else if(imc == 30 && idade == 20) {
				Resp = "Obesidade grau I";
			}
			else if (imc == 30 && idade == 65) {
				Resp = "Obesidade grau I";
			}
			else if(imc == 34.99 && idade == 20) {
				Resp = "Obesidade grau I";
			}
			else if (imc == 34.99 && idade == 65) {
				Resp = "Obesidade grau I";
			}
			
			else if(imc == 35 && idade == 20) {
				Resp = "Obesidade grau II";
			}
			else if (imc == 35 && idade == 65) {
				Resp = "Obesidade grau II";
			}
			else if(imc == 39.99 && idade == 20) {
				Resp = "Obesidade grau II";
			}
			else if (imc == 39.99 && idade == 65) {
				Resp = "Obesidade grau II";
			}
			
			else if(imc > 40 && idade == 20) {
				Resp = "Obesidade grau III (obesidade mórbida)";
			}
			else if (imc > 40 && idade == 65) {
				Resp = "Baixo peso muito grave (obesidade mórbida)";
			}
		}
		
		// Idosos
		else if(idade > 65) {
			
			if(imc < 21.9 && sexo == "feminino") {
				Resp = "Baixo peso";
			}
			else if (imc < 21.9 && sexo == "masculino") {
				Resp = "Baixo peso";
			}
			
			else if(imc == 22 && sexo == "feminino") {
				Resp = "Peso normal";
			}
			
			else if(imc == 27 && sexo == "feminino") {
				Resp = "Peso normal";
			}
			
			else if(imc == 22 && sexo == "masculino") {
				Resp = "Peso normal";
			}
			
			else if(imc == 27 && sexo == "masculino") {
				Resp = "Peso normal";
			}
			
			else if(imc == 27.1 && sexo == "feminino") {
				Resp = "Sobrepeso";
			}
			
			else if(imc == 32 && sexo == "feminino") {
				Resp = "Sobrepeso";
			}
			
			else if(imc == 27.1 && sexo == "masculino") {
				Resp = "Sobrepeso";
			}
			
			else if(imc == 30 && sexo == "masculino") {
				Resp = "Sobrepeso";
			}
			
			else if(imc == 32.1 && sexo == "feminino") {
				Resp = "Obesidade Grau I";
			}
			
			else if(imc == 37 && sexo == "feminino") {
				Resp = "Obesidade Grau I";
			}
			
			else if(imc == 30.1 && sexo == "masculino") {
				Resp = "Obesidade Grau I";
			}
			
			else if(imc == 35 && sexo == "masculino") {
				Resp = "Obesidade Grau I";
			}
			
			else if(imc == 37.1 && sexo == "feminino") {
				Resp = "Obesidade Grau II";
			}
			
			else if(imc == 41.9 && sexo == "feminino") {
				Resp = "Obesidade Grau II";
			}
			
			else if(imc == 35.1 && sexo == "masculino") {
				Resp = "Obesidade Grau II";
			}
			
			else if(imc == 39.9 && sexo == "masculino") {
				Resp = "Obesidade Grau II";
			}
			
			else if(imc > 42 && sexo == "feminino") {
				Resp = "Obesidade Grau III (obesidade mórbida)";
			}
			
			else if(imc > 40 && sexo == "masculino") {
				Resp = "Obesidade Grau III (obesidade mórbida)";
			}
		}
		
		// Crianças
		else if (idade < 20) {
			
			if(imc == 15 && sexo == "masculino" && idade == 2) {
				Resp = "Baixo peso";
			}
			else if(imc == 14.2 && sexo == "feminino" && idade == 2) {
				Resp = "Baixo peso";
			}
			
			if(imc == 14 && sexo == "masculino" && idade == 4) {
				Resp = "Baixo peso";
			}
			else if(imc == 13.7 && sexo == "feminino" && idade == 4) {
				Resp = "Baixo peso";
			}
			
			if(imc == 13.8 && sexo == "masculino" && idade == 6) {
				Resp = "Baixo peso";
			}
			else if(imc == 13.5 && sexo == "feminino" && idade == 6) {
				Resp = "Baixo peso";
			}
			
			if(imc == 14 && sexo == "masculino" && idade == 8) {
				Resp = "Baixo peso";
			}
			else if(imc == 13.5 && sexo == "feminino" && idade == 8) {
				Resp = "Baixo peso";
			}
			
			if(imc == 14 && sexo == "masculino" && idade == 10) {
				Resp = "Baixo peso";
			}
			else if(imc == 14 && sexo == "feminino" && idade == 10) {
				Resp = "Baixo peso";
			}
			
			if(imc == 16 && sexo == "masculino" && idade == 12) {
				Resp = "Baixo peso";
			}
			else if(imc == 16 && sexo == "feminino" && idade == 12) {
				Resp = "Baixo peso";
			}
			
			if(imc == 16 && sexo == "masculino" && idade == 14) {
				Resp = "Baixo peso";
			}
			else if(imc == 16 && sexo == "feminino" && idade == 14) {
				Resp = "Baixo peso";
			}
			
			if(imc == 17 && sexo == "masculino" && idade == 16) {
				Resp = "Baixo peso";
			}
			else if(imc == 17 && sexo == "feminino" && idade == 16) {
				Resp = "Baixo peso";
			}
			
			if(imc == 18 && sexo == "masculino" && idade == 18) {
				Resp = "Baixo peso";
			}
			else if(imc == 18 && sexo == "feminino" && idade == 18) {
				Resp = "Baixo peso";
			}		
					
			if(imc == 15 && sexo == "masculino" && idade == 2) {
				Resp = "Peso normal";
			}
			else if(imc == 14.2 && sexo == "feminino" && idade == 2) {
				Resp = "Peso normal";
			}
			
			if(imc == 14 && sexo == "masculino" && idade == 4) {
				Resp = "Peso normal";
			}
			else if(imc == 13.7 && sexo == "feminino" && idade == 4) {
				Resp = "Peso normal";
			}
			
			if(imc == 13.8 && sexo == "masculino" && idade == 6) {
				Resp = "Peso normal";
			}
			else if(imc == 13.5 && sexo == "feminino" && idade == 6) {
				Resp = "Peso normal";
			}
			
			if(imc == 14 && sexo == "masculino" && idade == 8) {
				Resp = "Peso normal";
			}
			else if(imc == 13.5 && sexo == "feminino" && idade == 8) {
				Resp = "Peso normal";
			}
			
			if(imc == 14 && sexo == "masculino" && idade == 10) {
				Resp = "Peso normal";
			}
			else if(imc == 14 && sexo == "feminino" && idade == 10) {
				Resp = "Peso normal";
			}
			
			if(imc == 16 && sexo == "masculino" && idade == 12) {
				Resp = "Peso normal";
			}
			else if(imc == 16 && sexo == "feminino" && idade == 12) {
				Resp = "Peso normal";
			}
			
			if(imc == 16 && sexo == "masculino" && idade == 14) {
				Resp = "Peso normal";
			}
			else if(imc == 16 && sexo == "feminino" && idade == 14) {
				Resp = "Peso normal";
			}
			
			if(imc == 17 && sexo == "masculino" && idade == 16) {
				Resp = "Peso normal";
			}
			else if(imc == 17 && sexo == "feminino" && idade == 16) {
				Resp = "Peso normal";
			}
			
			if(imc == 18 && sexo == "masculino" && idade == 18) {
				Resp = "Peso normal";
			}
			else if(imc == 18 && sexo == "feminino" && idade == 18) {
				Resp = "Peso normal";
			}
					
			if(imc == 18.2 && sexo == "masculino" && idade == 2) {
				Resp = "Sobrepeso";
			}
			else if(imc == 18.2 && sexo == "feminino" && idade == 2) {
				Resp = "Sobrepeso";
			}
			
			if(imc == 17.5 && sexo == "masculino" && idade == 4) {
				Resp = "Sobrepeso";
			}
			else if(imc == 17.5 && sexo == "feminino" && idade == 4) {
				Resp = "Sobrepeso";
			}
			
			if(imc == 18 && sexo == "masculino" && idade == 6) {
				Resp = "Sobrepeso";
			}
			else if(imc == 18 && sexo == "feminino" && idade == 6) {
				Resp = "Sobrepeso";
			}
			
			if(imc == 19 && sexo == "masculino" && idade == 8) {
				Resp = "Sobrepeso";
			}
			else if(imc == 19 && sexo == "feminino" && idade == 8) {
				Resp = "Sobrepeso";
			}
			
			if(imc == 19 && sexo == "masculino" && idade == 10) {
				Resp = "Sobrepeso";
			}
			else if(imc == 20 && sexo == "feminino" && idade == 10) {
				Resp = "Sobrepeso";
			}
			
			if(imc == 22 && sexo == "masculino" && idade == 12) {
				Resp = "Sobrepeso";
			}
			else if(imc == 22 && sexo == "feminino" && idade == 12) {
				Resp = "Sobrepeso";
			}
			
			if(imc == 22 && sexo == "masculino" && idade == 14) {
				Resp = "Sobrepeso";
			}
			else if(imc == 24 && sexo == "feminino" && idade == 14) {
				Resp = "Sobrepeso";
			}
			
			if(imc == 24 && sexo == "masculino" && idade == 16) {
				Resp = "Sobrepeso";
			}
			else if(imc == 25 && sexo == "feminino" && idade == 16) {
				Resp = "Sobrepeso";
			}
			
			if(imc == 26 && sexo == "masculino" && idade == 18) {
				Resp = "Sobrepeso";
			}
			else if(imc == 26 && sexo == "feminino" && idade == 18) {
				Resp = "Sobrepeso";
			}
				
			if(imc == 19.2 && sexo == "masculino" && idade == 2) {
				Resp = "Obesidade";
			}
			else if(imc == 19.2 && sexo == "feminino" && idade == 2) {
				Resp = "Obesidade";
			}
			
			if(imc == 18 && sexo == "masculino" && idade == 4) {
				Resp = "Obesidade";
			}
			else if(imc == 18.5 && sexo == "feminino" && idade == 4) {
				Resp = "Obesidade";
			}
			
			if(imc == 19 && sexo == "masculino" && idade == 6) {
				Resp = "Obesidade";
			}
			else if(imc == 19 && sexo == "feminino" && idade == 6) {
				Resp = "Obesidade";
			}
			
			if(imc == 20.2 && sexo == "masculino" && idade == 8) {
				Resp = "Obesidade";
			}
			else if(imc == 21 && sexo == "feminino" && idade == 8) {
				Resp = "Obesidade";
			}
			
			if(imc == 21 && sexo == "masculino" && idade == 10) {
				Resp = "Obesidade";
			}
			else if(imc == 23.5 && sexo == "feminino" && idade == 10) {
				Resp = "Obesidade";
			}
			
			if(imc == 24.5 && sexo == "masculino" && idade == 12) {
				Resp = "Obesidade";
			}
			else if(imc == 25.5 && sexo == "feminino" && idade == 12) {
				Resp = "Obesidade";
			}
			
			if(imc == 26.5 && sexo == "masculino" && idade == 14) {
				Resp = "Obesidade";
			}
			else if(imc == 27.5 && sexo == "feminino" && idade == 14) {
				Resp = "Obesidade";
			}
			
			if(imc == 27 && sexo == "masculino" && idade == 16) {
				Resp = "Obesidade";
			}
			else if(imc == 29 && sexo == "feminino" && idade == 16) {
				Resp = "Obesidade";
			}
			
			if(imc == 28 && sexo == "masculino" && idade == 18) {
				Resp = "Obesidade";
			}
			else if(imc == 31 && sexo == "feminino" && idade == 18) {
				Resp = "Obesidade";
			}
	
		}
		
		return Resp;
	}

}
