package br.edu.uricer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class CalculoTest {

    //Homem abaixo do peso
    @Test
    public void testHomemAbaixoDoPeso() {
        Calculo calculo = new Calculo(Calculo.MASCULINO, 1.90, 50);
        
        int esperado = Calculo.ABAIXO_DO_PESO;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Homem no peso ideal
    @Test
    public void testHomemNoPesoIdeal() {
        Calculo calculo = new Calculo(Calculo.MASCULINO, 1.70, 70);
        
        int esperado = Calculo.PESO_IDEAL;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    
    //Homem acima do peso
    @Test
    public void testHomemAcimaDoPeso() {
        Calculo calculo = new Calculo(Calculo.MASCULINO, 1.50, 90);
        
        int esperado = Calculo.ACIMA_DO_PESO;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }    
    
    //Mulher abaixo do peso
    @Test
    public void testMulherAbaixoDoPeso() {
        Calculo calculo = new Calculo(Calculo.FEMININO, 1.90, 40);
        
        int esperado = Calculo.ABAIXO_DO_PESO;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }     
    
    //Mulher no peso ideal
    @Test
    public void testMulherNoPesoIdeal() {
        Calculo calculo = new Calculo(Calculo.FEMININO, 1.70, 65);
        
        int esperado = Calculo.PESO_IDEAL;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    } 
    
    //Mulher acima do peso
    @Test
    public void testMulherAcimaDoPeso() {
        Calculo calculo = new Calculo(Calculo.FEMININO, 1.50, 90);
        
        int esperado = Calculo.ACIMA_DO_PESO;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }     
    
}
