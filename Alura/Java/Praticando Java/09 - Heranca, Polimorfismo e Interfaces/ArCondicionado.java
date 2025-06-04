public class ArCondicionado implements  Controlavel {
    boolean ligado;

    public ArCondicionado() {
        ligado = false;
    }

    @Override
    public void ligar() {
        if(!ligado){
            System.out.println("Ar Condicionado ligado.");
            ligado = true;
        }else{
            System.out.println("Ar Condicionado ja está ligado.");
        }
    }

    @Override
    public void desligar() {
        if(ligado){
            System.out.println("Ar Condicionado desligado.");
        }else{
            System.out.println("Ar Condicionado ja está desligado.");
        }
    }
}
