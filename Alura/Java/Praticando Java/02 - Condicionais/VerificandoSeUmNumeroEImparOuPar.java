public class VerificandoSeUmNumeroEImparOuPar {
    public static void main(String[] args) {
        int numero = 7;
        System.out.println("O número " + numero+ " é " + (numero % 2 == 0 ? "par." : "ímpar."));
    }
}
