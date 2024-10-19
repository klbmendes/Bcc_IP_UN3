import java.util.Scanner;

public class Uni3Exe04 {

public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        double Nota1 = teclado.nextDouble();

        System.out.println("Digite a segunda nota:");
        double Nota2 = teclado.nextDouble();

        System.out.println("Digite a terceira nota:");
        double Nota3 = teclado.nextDouble();

        Double MediaPonderada = (Nota1 * 0.5) + (Nota2 * 0.3) + (Nota3 * 0.2) / 3;
        System.out.println("A média ponderada das notas é:" + MediaPonderada);
        
        teclado.close();

}
}
