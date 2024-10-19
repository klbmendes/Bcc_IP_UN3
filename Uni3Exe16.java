import java.util.Scanner;

public class Uni3Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        //entrada
        System.out.print("Troco em reais: ");
        int troco = teclado.nextInt();
        int notas100 = troco / 100;
        troco %= 100;
        int notas10 = troco / 10;
        troco %= 10; 
        int notas1 = troco; 

        //processo
        int totalNotas = notas100 + notas10 + notas1;

        //saída
        System.out.println("Número mínimo de notas necessárias: " + totalNotas);
        System.out.println("Notas de 100 reais: " + notas100);
        System.out.println("Notas de 10 reais: " + notas10);
        System.out.println("Notas de 1 real: " + notas1);

        teclado.close();
    }
    
}
