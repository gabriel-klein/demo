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

    // ADULTOS
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
        assertEquals("Baixo peso grave", calc.calcularImc(51.84, 1.80, 65, "masculino"));
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

    @Test
    public void testObesidadeGrauDoisLimiteMinimoAdultoMasculino20anos() {
    	assertEquals("Obesidade grau II", calc.calcularImc(107.0,1.748,20,"masculino"));
    }

    @Test
    public void testObesidadeGrauDoisLimiteMinimoAdultoMasculino65anos() {
    	assertEquals("Obesidade grau II", calc.calcularImc(107.0,1.748,65,"masculino"));
    }

    @Test
    public void testObesidadeGrauDoisLimiteMaximoAdultoMasculino20anos() {
    	assertEquals("Obesidade grau II", calc.calcularImc(122.0,1.747,20,"masculino"));
    }

    @Test
    public void testObesidadeGrauDoisLimiteMaximoAdultoMasculino65anos() {
    	assertEquals("Obesidade grau II", calc.calcularImc(122.0,1.747,65,"masculino"));
    }

    @Test
    public void testObesidadeGrauTresAdultoMasculino20anos() {
    	assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(123.0,1.753,20,"masculino"));
    }

    @Test
    public void testObesidadeGrauTresAdultoMasculino65anos() {
    	assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(123.0,1.753,65,"masculino"));
    }

    // ==========================================================================================================================

    // IDOSO (MASCULINO)
    @Test
    public void testBaixoPesoIdoso() {
    	assertEquals("Baixo peso", calc.calcularImc(67.0,1.75,66,"masculino"));
    }
    
    @Test
    public void testPesoNormalLimiteMinimoIdoso() {
    	assertEquals("Peso normal", calc.calcularImc(67.0,1.745,66,"masculino"));
    }
    
    @Test
    public void testPesoNormalLimiteMaximoIdoso() {
    	assertEquals("Peso normal", calc.calcularImc(82.0,1.743,66,"masculino"));
    }
    
    @Test
    public void testSobrepesolLimiteMinimoIdoso() {
    	assertEquals("Sobrepeso", calc.calcularImc(82.0,1.739,66,"masculino"));
    }

    @Test
    public void testSobrepesolLimiteMaximoIdoso() {
    	assertEquals("Sobrepeso", calc.calcularImc(88.0,1.72,66,"masculino"));
    }
    
    @Test
    public void testObesidadeGrauUmlLimiteMinimoIdoso() {
    	assertEquals("Obesidade grau I", calc.calcularImc(89.0,1.716,66,"masculino"));
    }

    @Test
    public void testObesidadeGrauUmlLimiteMaximoIdoso() {
    	assertEquals("Obesidade grau I", calc.calcularImc(109.0,1.765,66,"masculino"));
    }
    
    @Test
    public void testObesidadeGrauDoislLimiteMinimoIdoso() {
    	assertEquals("Obesidade grau II", calc.calcularImc(109.0,1.76,66,"masculino"));
    }

    @Test
    public void testObesidadeGrauDoislLimiteMaximoIdoso() {
    	assertEquals("Obesidade grau II", calc.calcularImc(123.0,1.759,66,"masculino"));
    }

    @Test
    public void testObesidadeGrauTreslLimiteMinimoIdoso() {
    	assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(140.00,1.80,66,"masculino"));
    }

    //====================================================================================================================

    // IDOSO (FEMINIO)

    @Test
    public void testBaixoPesoIdosa() {
    	assertEquals("Baixo peso", calc.calcularImc(67.0,1.75,66,"feminino"));
    }
    
    @Test
    public void testPesoNormalLimiteMinimoIdosa() {
    	assertEquals("Peso normal", calc.calcularImc(67.0,1.745,66,"feminino"));
    }
    
    @Test
    public void testPesoNormalLimiteMaximoIdosa() {
    	assertEquals("Peso normal", calc.calcularImc(82.0,1.743,66,"feminino"));
    }
    
    @Test
    public void testSobrepesolLimiteMinimoIdosa() {
    	assertEquals("Sobrepeso", calc.calcularImc(82.0,1.739,66,"feminino"));
    }
    
    @Test
    public void testSobrepesolLimiteMaximoIdosa() {
    	assertEquals("Sobrepeso", calc.calcularImc(88.0,1.659,66,"feminino"));
    }
    
    @Test
    public void testObesidadeGrauUmlLimiteMinimoIdosa() {
    	assertEquals("Obesidade grau I", calc.calcularImc(95.0,1.72,66,"feminino"));
    }
    
    @Test
    public void testObesidadeGrauUmlLimiteMaximoIdosa() {
    	assertEquals("Obesidade grau I", calc.calcularImc(95.0,1.603,66,"feminino"));
    }
    
    @Test
    public void testObesidadeGrauDoislLimiteMinimoIdosa() {
    	assertEquals("Obesidade grau II", calc.calcularImc(95.0,1.60,66,"feminino"));
    }
    
    @Test
    public void testObesidadeGrauDoislLimiteMaximoIdosa() {
    	assertEquals("Obesidade grau II", calc.calcularImc(107.0,1.599,66,"feminino"));
    }
    
    @Test
    public void testObesidadeGrauTreslLimiteMinimoIdosa() {
    	assertEquals("Obesidade grau III (obesidade mórbida)", calc.calcularImc(108.0,1.603,66,"feminino"));
    }
   
    //=================================================================================================================
    
    // CRIANÇA (MASCULINO)
    
    // 2 anos

    @Test
    public void testeBaixoPesoCriancaMenino2Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(12.0,0.9,2,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino2Anos() {
    	assertEquals("Peso normal", calc.calcularImc(14.0,0.9,2,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino2Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(15.0,0.9,2,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino2Anos() {
    	assertEquals("Obesidade", calc.calcularImc(18.0,0.96,2,"masculino"));
    }
    
    // 4 anos

    @Test
    public void testeBaixoPesoCriancaMenino4Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(15.0,1.03,4,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino4Anos() {
    	assertEquals("Peso normal", calc.calcularImc(17.0,1.03,4,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino4Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(19.0,1.04,4,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino4Anos() {
    	assertEquals("Obesidade", calc.calcularImc(20.0,1.05,4,"masculino"));
    }
    
    // 6 anos 

    @Test
    public void testeBaixoPesoCriancaMenino6Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(16.0,1.07,6,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino6Anos() {
    	assertEquals("Peso normal", calc.calcularImc(19.0,1.07,6,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino6Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(21.0,1.08,6,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino6Anos() {
    	assertEquals("Obesidade", calc.calcularImc(22.0,1.08,6,"masculino"));
    }
    
    // 8 anos

    @Test
    public void testeBaixoPesoCriancaMenino8Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(20.0,1.20,8,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino8Anos() {
    	assertEquals("Peso normal", calc.calcularImc(23.0,1.20,8,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino8Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(28.0,1.21,8,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino8Anos() {
    	assertEquals("Obesidade", calc.calcularImc(30.0,1.21,8,"masculino"));
    }
    
    // 10 anos

    @Test
    public void testeBaixoPesoCriancaMenino10Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(24.0,1.299,10,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino10Anos() {
    	assertEquals("Peso normal", calc.calcularImc(27.0,1.29,10,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino10Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(34.0,1.29,10,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino10Anos() {
    	assertEquals("Obesidade", calc.calcularImc(38.0,1.29,10,"masculino"));
    }
    
    // 12 anos

    @Test
    public void testeBaixoPesoCriancaMenino12Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(29.0,1.38,12,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino12Anos() {
    	assertEquals("Peso normal", calc.calcularImc(33.0,1.38,12,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino12Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(42.0,1.38,12,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino12Anos() {
    	assertEquals("Obesidade", calc.calcularImc(47.0,1.38,12,"masculino"));
    }
    
    // 14 anos

    @Test
    public void testeBaixoPesoCriancaMenino14Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(37.0,1.51,14,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino14Anos() {
    	assertEquals("Peso normal", calc.calcularImc(42.0,1.51,14,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino14Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(54.0,1.50,14,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino14Anos() {
    	assertEquals("Obesidade", calc.calcularImc(61.0,1.50,14,"masculino"));
    }
    
    // 16 anos

    @Test
    public void testeBaixoPesoCriancaMenino16Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(45.0,1.62,16,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino16Anos() {
    	assertEquals("Peso normal", calc.calcularImc(52.0,1.62,16,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino16Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(65.0,1.62,16,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino16Anos() {
    	assertEquals("Obesidade", calc.calcularImc(74.0,1.62,16,"masculino"));
    }
    
    // 18 anos

    @Test
    public void testeBaixoPesoCriancaMenino18Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(53.0,1.7,18,"masculino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenino18Anos() {
    	assertEquals("Peso normal", calc.calcularImc(60.0,1.7,18,"masculino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenino18Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(78.0,1.7,18,"masculino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenino18Anos() {
    	assertEquals("Obesidade", calc.calcularImc(90.0,1.7,18,"masculino"));
    }
    
    
    // CRIANÇA (FEMINIO)

    // 2 anos

    @Test
    public void testeBaixoPesoCriancaMenina2Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(12.0,0.9,2,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina2Anos() {
    	assertEquals("Peso normal", calc.calcularImc(14.0,0.9,2,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina2Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(15.0,0.9,2,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina2Anos() {
    	assertEquals("Obesidade", calc.calcularImc(18.0,0.96,2,"feminino"));
    }
    
    // 4 anos

    @Test
    public void testeBaixoPesoCriancaMenina4Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(14.0,1.03,4,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina4Anos() {
    	assertEquals("Peso normal", calc.calcularImc(17.0,1.03,4,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina4Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(19.0,1.04,4,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina4Anos() {
    	assertEquals("Obesidade", calc.calcularImc(20.0,1.05,4,"feminino"));
    }
    
    // 6 anos

    @Test
    public void testeBaixoPesoCriancaMenina6Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(16.0,1.07,6,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina6Anos() {
    	assertEquals("Peso normal", calc.calcularImc(19.0,1.07,6,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina6Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(21.0,1.08,6,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina6Anos() {
    	assertEquals("Obesidade", calc.calcularImc(22.0,1.08,6,"feminino"));
    }
    
    // 8 anos

    @Test
    public void testeBaixoPesoCriancaMenina8Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(20.0,1.20,8,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina8Anos() {
    	assertEquals("Peso normal", calc.calcularImc(23.0,1.20,8,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina8Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(28.0,1.21,8,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina8Anos() {
    	assertEquals("Obesidade", calc.calcularImc(32.0,1.21,8,"feminino"));
    }
    
    // 10 anos

    @Test
    public void testeBaixoPesoCriancaMenina10Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(24.0,1.299,10,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina10Anos() {
    	assertEquals("Peso normal", calc.calcularImc(27.0,1.29,10,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina10Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(34.0,1.29,10,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina10Anos() {
    	assertEquals("Obesidade", calc.calcularImc(39.0,1.29,10,"feminino"));
    }
    
    // 12 anos

    @Test
    public void testeBaixoPesoCriancaMenina12Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(29.0,1.38,12,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina12Anos() {
    	assertEquals("Peso normal", calc.calcularImc(33.0,1.38,12,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina12Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(42.0,1.38,12,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina12Anos() {
    	assertEquals("Obesidade", calc.calcularImc(48.0,1.38,12,"feminino"));
    }
    
    // 14 anos

    @Test
    public void testeBaixoPesoCriancaMenina14Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(37.0,1.51,14,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina14Anos() {
    	assertEquals("Peso normal", calc.calcularImc(42.0,1.51,14,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina14Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(54.0,1.50,14,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina14Anos() {
    	assertEquals("Obesidade", calc.calcularImc(61.0,1.50,14,"feminino"));
    }
    
    // 16 anos

    @Test
    public void testeBaixoPesoCriancaMenina16Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(45.0,1.62,16,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina16Anos() {
    	assertEquals("Peso normal", calc.calcularImc(52.0,1.62,16,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina16Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(65.0,1.62,16,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina16Anos() {
    	assertEquals("Obesidade", calc.calcularImc(77.0,1.62,16,"feminino"));
    }
    
    // 18 anos

    @Test
    public void testeBaixoPesoCriancaMenina18Anos() {
    	assertEquals("Baixo peso", calc.calcularImc(50.0,1.7,18,"feminino"));
    }
    
    @Test
    public void testePesoNormalCriancaMenina18Anos() {
    	assertEquals("Peso normal", calc.calcularImc(60.0,1.7,18,"feminino"));
    }
    
    @Test
    public void testeSobrepesoCriancaMenina18Anos() {
    	assertEquals("Sobrepeso", calc.calcularImc(78.0,1.7,18,"feminino"));
    }
    
    @Test
    public void testeObesidadeCriancaMenina18Anos() {
    	assertEquals("Obesidade", calc.calcularImc(90.0,1.7,18,"feminino"));
    }
}
