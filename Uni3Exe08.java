import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Quantos dólares foi entregue ao atendente? ");
        float valorDolar = teclado.nextFloat();

        System.out.println("Valor da cotação em dólar do atendente? ");
        float cotacaoDolar = teclado.nextFloat();

        float valorReal = valorDolar * cotacaoDolar;

        System.out.println("O total a ser devolvido é:"+ valorReal);

        teclado.close();
    }
    
}
