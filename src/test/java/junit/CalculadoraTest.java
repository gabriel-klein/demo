package junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    CalculadoraIMC calc;
	
    @BeforeEach
    public void setup() {
        calc = new CalculadoraIMC();
    }
   
    @Test
    public void testeAdultoBaixoPesoMuitoGraveLimiteMinimoIdade()
    {
        assertEquals("Baixo peso muito grave", calc.calcularImc(50.00, 1.84, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoMuitoGraveLimiteMaximoIdade()
    {
        assertEquals("Baixo peso muito grave", calc.calcularImc(50.00, 1.84, 65, "masculino"));
    }
    
    @Test
    public void testeAdultoBaixoPesoGraveLimiteMinimoIdadeLimiteMinimoImc()
    {
        assertEquals("Baixo peso grave", calc.calcularImc(51.84, 1.80, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteMaximoIdadeLimiteMinimoImc()
    {
        assertEquals("Baixo peso grave", calc.calcularImc(52.00, 1.80, 65, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteMinimoIdadeLimiteMaximoImc()
    {
        assertEquals("Baixo peso grave", calc.calcularImc(55.0476, 1.80, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoGraveLimiteMaximoIdadeLimiteMaximoImc()
    {
        assertEquals("Baixo peso grave", calc.calcularImc(55.0476, 1.80, 65, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteMinimoIdadeLimiteMinimoImc()
    {
        assertEquals("Baixo peso", calc.calcularImc(55.08, 1.80, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteMaximoIdadeLimiteMinimoImc()
    {
        assertEquals("Baixo peso", calc.calcularImc(55.08, 1.80, 65, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteMinimoIdadeLimiteMaximoImc()
    {
        assertEquals("Baixo peso", calc.calcularImc(59.9076, 1.80, 20, "masculino"));
    }

    @Test
    public void testeAdultoBaixoPesoLimiteMaximoIdadeLimiteMaximoImc()
    {
        assertEquals("Baixo peso", calc.calcularImc(59.9076, 1.80, 65, "masculino"));
    }
    
    @Test
    public void testeAdultoPesoNormalLimiteMinimoIdadeLimiteMinimoImc()
    {
        assertEquals("Peso normal", calc.calcularImc(56.65625, 1.75, 20, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteMaximoIdadeLimiteMinimoImc()
    {
        assertEquals("Peso normal", calc.calcularImc(56.65625, 1.75, 65, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteMinimoIdadeLimiteMaximoImc()
    {
        assertEquals("Peso normal", calc.calcularImc(80.9676, 1.80, 20, "masculino"));
    }

    @Test
    public void testeAdultoPesoNormalLimiteMaximoIdadeLimiteMaximoImc()
    {
        assertEquals("Peso normal", calc.calcularImc(80.9676, 1.80, 65, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLimiteMinimoIdadeLimiteMinimoImc()
    {
        assertEquals("Sobrepeso", calc.calcularImc(81.00, 1.80, 20, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLimiteMaximoIdadeLimiteMinimoImc()
    {
        assertEquals("Sobrepeso", calc.calcularImc(81.00, 1.80, 65, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLimiteMinimoIdadeLimiteMaximoImc()
    {
        assertEquals("Sobrepeso", calc.calcularImc(91.844375, 1.75, 20, "masculino"));
    }

    @Test
    public void testeAdultoSobrepesoLimiteMaximoIdadeLimiteMaximoImc()
    {
        assertEquals("Sobrepeso", calc.calcularImc(91.844375, 1.75, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauILimiteMinimoIdadeLimiteMinimoImc()
    {
        assertEquals("Obesidade grau I", calc.calcularImc(97.2, 1.80, 20, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauILimiteMaximoIdadeLimiteMinimoImc()
    {
        assertEquals("Obesidade grau I", calc.calcularImc(97.2, 1.80, 65, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauILimiteMinimoIdadeLimiteMaximoImc()
    {
        assertEquals("Obesidade grau I", calc.calcularImc(107.156875, 1.75, 20, "masculino"));
    }

    @Test
    public void testeAdultoObesidadeGrauILimiteMaximoIdadeLimiteMaximoImc()
    {
        assertEquals("Obesidade grau I", calc.calcularImc(107.156875, 1.75, 65, "masculino"));
    }
}
