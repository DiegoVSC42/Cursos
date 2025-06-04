import java.util.Scanner;

public class ContandoNumerosPositivosENegativos {
    public static void main(String[] args) {
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        Scanner sc = new Scanner(System.in);
        String valor = "";
        while(!valor.equals("fim")){
            System.out.print("Digite um número (ou 'fim' para encerrar): ");
            valor = sc.nextLine();
            if(!valor.equals("fim")){
                if(Integer.parseInt(valor) > 0){
                    contadorPositivos++;
                }else{
                    contadorNegativos++;
                }
            }
        }
        System.out.println("Números positivos: " + contadorPositivos);
        System.out.println("Números negativos: " + contadorNegativos);
    }
}
