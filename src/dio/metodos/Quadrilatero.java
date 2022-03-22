package dio.metodos;

public class Quadrilatero {

    public static void areaQuadrilatero(double lado){
        System.out.println("A área do quadrado é: " +(lado*lado));
    }

    public static void areaQuadrilatero(double lado1, double lado2){
        System.out.println("A área do retângulo é: " +(lado1*lado2));
    }

    public static void areaQuadrilatero(double baseMaior, double baseMenor, double altura){
        System.out.println("A área do trapézio é: " + ((baseMaior+baseMenor)*altura) / 2);
    }
}
