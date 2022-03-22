package dio.metodos;

public class Calculadora {

    public static void adicionar (float a, float b){
        System.out.println("A soma de " + a + " + " + b + " = " + (a+b));
    }

    public static void subtrair (float a, float b){
        System.out.println("A subtração de " + a + " - " + b + " = " + (a-b));
    }

    public static void divir (float a, float b){
        System.out.println("A divisão de " + a + " / " + b + " = " + (a/b));
    }

    public static void multiplicar (float a, float b){
        System.out.println("A multiplicação de " + a + " * " + b + " = " + (a*b));
    }

}
