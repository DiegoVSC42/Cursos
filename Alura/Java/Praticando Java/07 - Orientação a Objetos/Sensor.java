public class Sensor {
    String local;
    double temperaturaAtual;

    public void mostrarInformacoes(){
        System.out.printf("Sensor no local: %s\n" , local);
        System.out.printf("Temperatura: %.1fºC\n" , temperaturaAtual);
        if(temperaturaAtual > 37.5){
            System.out.println("Alerta: Temperatura acima do limite!");
        }
    }
}
