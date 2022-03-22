package dio.metodos;

public class Main {
    public static void main(String[] args) {

        // Mensagem de acordo com a hora do dia
        System.out.println("########## Mensagem do dia ##########");
        Mensagem.mensagens(8);
        Mensagem.mensagens(23);
        Mensagem.mensagens(15);

        //Calculadora simples
        System.out.println("########## Calculadora simples ##########");
        Calculadora.adicionar(22,47);
        Calculadora.subtrair(45,12);
        Calculadora.divir(22,11);
        Calculadora.multiplicar(10, 7);

        //Emprestimo
        System.out.println("########## Empréstimos ##########");
        Emprestimo.calcular(1000,2);
        Emprestimo.calcular(1000,3);
        Emprestimo.calcular(1000,4);


    }
}
