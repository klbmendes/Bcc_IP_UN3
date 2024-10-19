import java.util.Scanner;

public class Uni3Exe13 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double azulejo = 12.50;
        double comprimentoParede = teclado.nextDouble();
        double alturaParede = teclado.nextDouble();

        double area = comprimentoParede * alturaParede;
        double totalPagar = area * (9 * azulejo);

        System.out.println("Comprimento e altura da parede: " + area);
        System.out.println("O total pago para cobrir a parede de azulejos é: " + totalPagar);


        teclado.close();

    }
    
}
