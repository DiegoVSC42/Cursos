public class Bateria {
    private int nivel = 0;

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void exibeStatus(){
        if(nivel <= 20){
            System.out.println("Status: Bateria fraca");
        }else if(nivel <= 79){
            System.out.println("Status: Bateria ok");
        }else{
            System.out.println("Status: Bateria cheia");
        }
    }
}
