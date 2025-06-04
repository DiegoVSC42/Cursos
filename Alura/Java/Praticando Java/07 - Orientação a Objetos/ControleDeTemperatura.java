public class ControleDeTemperatura {
    public static void main(String[] args) {
        Sensor sensor = new Sensor();
        sensor.local = "Setor A";
        sensor.temperaturaAtual = 39.2;
        sensor.mostrarInformacoes();
    }
}
