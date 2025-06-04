import java.util.Scanner;

public class SomaDeNumeros {
    public static void main(String[] args) {
        int[] valores = {10,20,30,40,50};
        int resultado = 0;
        for(int valor : valores){
            resultado += valor;
        }
        System.out.print("A soma total das receitas é: " + resultado);
    }
}
