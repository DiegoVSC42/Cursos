public class Reserva {

    public void reservar(){
        System.out.println("Reserva realizada");
    }

    public void reservar(String data){
        System.out.printf("Reserva feita para o dia %s\n",data);
    }

    public void reservar(String data,int quantidade){
        System.out.printf("Reserva feita para o dia %s para %d pessoas\n",data,quantidade);
    }

}
