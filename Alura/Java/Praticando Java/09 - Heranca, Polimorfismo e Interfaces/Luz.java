public class Luz implements Controlavel{
    boolean ligado;

    public Luz() {
        ligado = false;
    }

    @Override
    public void ligar() {
        if(!ligado){
            System.out.println("Luz ligada.");
            ligado = true;
        }else{
            System.out.println("Luz ja está ligada.");
        }
    }

    @Override
    public void desligar() {
        if(ligado){
            System.out.println("Luz desligada.");
        }else{
            System.out.println("Luz ja está desligada.");
        }
    }
}
