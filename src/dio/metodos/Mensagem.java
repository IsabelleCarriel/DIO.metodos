package dio.metodos;

public class Mensagem {

    int hora = 1;

    public static void mensagens(int hora){
        if(hora>=5 && hora <=12){

            System.out.println("Bom Dia! Agora são: " + hora + "h");

        } else if(hora>=13 && hora<=17){

            System.out.println("Boa Tarde! Agora são: " + hora + "h");

        } else{

            System.out.println("Boa Noite! Agora são: " + hora + "h");

        }
    }

}
