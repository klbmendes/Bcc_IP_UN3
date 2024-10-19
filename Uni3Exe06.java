import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a quantidade em quilogramas:");
        double precoPrato = 0.75; teclado.nextDouble();

        double precoQuilo = 25.00;

        double valorPagar = precoPrato * precoQuilo;

        System.out.println("O valor a pagar é: R$ "+ valorPagar);

    teclado.close();
    }
}
