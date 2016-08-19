package bc.edu.uricer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author -Tiago
 */
public class CalculoTest {
    
    //Homem abaixo do peso
    @Test
    public void TesteHomemAbaixoDoPeso(){
        Calculo calculo = new Calculo("M", 1.90, 50);
        
        int esperado = 0;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    //Homem peso ideal
    @Test
    public void TesteHomemPesoIdeal(){
        Calculo calculo = new Calculo("M", 1.70, 70);
        
        int esperado = 1;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    }
    // Homem acima do peso
    @Test
    public void testeHomemAcimaDoPeso(){
        Calculo calculo = new Calculo("M", 1.50, 90);
        
        int esperado = 2;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    } 
    //Mulher abaixo do peso
     @Test
    public void testeMulherAbaixoDoPeso(){
        Calculo calculo = new Calculo("F", 1.90, 40);
        
        int esperado = 0;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    } 
    //Mulher peso ideal
    @Test
    public void testeMulherPesoIdeal(){
        Calculo calculo = new Calculo("F", 1.70, 65);
        
        int esperado = 1;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    } 
    // Mulher acima do peso
    @Test
    public void testeMulherAcimaDoPeso(){
        Calculo calculo = new Calculo("F", 1.50, 90);
        
        int esperado = 2;
        int resultado = calculo.calcular();
        
        assertEquals(esperado, resultado);
    } 
}

    