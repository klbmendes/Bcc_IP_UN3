import java.util.Scanner;

public class Uni3Java09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        // V = pi * r2 * h
        System.out.println("Qual o raio da lata de óleo? ");
        double raioLata = teclado.nextDouble();

        System.out.println("Qual a altura da lata de óleo? ");
        double alturaLata = teclado.nextDouble();

        double piLata = 3.14159265359;
        
        double volumeLata = piLata * (raioLata * 2) * alturaLata;

        System.out.println("O volume da lata de óleo é:"+ volumeLata);

        teclado.close();
    

    }
    
}
