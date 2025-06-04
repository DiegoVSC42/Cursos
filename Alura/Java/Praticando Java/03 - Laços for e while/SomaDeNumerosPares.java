public class SomaDeNumerosPares {
    public static void main(String[] args) {
        int soma = 0;
        for(int i = 2 ; i <= 100 ; i++){
            soma = i % 2 == 0 ? soma + i : soma;
        }
        System.out.println("A soma dos números pares de 1 a 100 é: " + soma);
    }
}
