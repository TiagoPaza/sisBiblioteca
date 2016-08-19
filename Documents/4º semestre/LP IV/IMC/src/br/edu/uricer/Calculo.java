package br.edu.uricer;

/**
 *
 * @author Rodrigo Rosa <rodrigorosa@urice.edu.br>
 */
public class Calculo {
    
    public static final int ABAIXO_DO_PESO = 0;
    public static final int PESO_IDEAL = 1;
    public static final int ACIMA_DO_PESO =2;
    public static final String MASCULINO = "M";
    public static final String FEMININO = "F";

    private final String sexo;
    private final double estatura;
    private final double peso;

    public Calculo(String sexo, double estatura, double peso) {
        this.sexo = sexo;
        this.estatura = estatura;
        this.peso = peso;
    }

    public int calcular() {
        double imcGeral = calcularImcGeral();

        if (sexo.equals(MASCULINO)) {
            return calcularImcHomem(imcGeral);

        } else {
            return calcularImcMulher(imcGeral);
        }
    }

    private double calcularImcGeral() {
        return peso / Math.pow(estatura, 2);
    }

    private int calcularImcHomem(double imcGeral) {
        int imc = PESO_IDEAL;

        if (imcGeral < 20.7) {
            imc = ABAIXO_DO_PESO;
        } else if (imcGeral > 26.4) {
            imc = ACIMA_DO_PESO;
        }

        return imc;
    }

    private int calcularImcMulher(double imcGeral) {
        int imc = PESO_IDEAL;

        if (imcGeral < 19.1) {
            imc =  ABAIXO_DO_PESO;
        } else if (imcGeral > 25.8) {
            imc = ACIMA_DO_PESO;
        }

        return imc;
    }

}
