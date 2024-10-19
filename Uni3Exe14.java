import java.util.Scanner;

public class Uni3Exe14 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    double distanciaPercorrida = teclado.nextDouble();
    double tempo = teclado.nextDouble();
    double quilometroLitro = 12.00;

    double velocidadeMedia = distanciaPercorrida / tempo;
    double combustivelGasto = distanciaPercorrida / quilometroLitro;

    System.out.println("Velocidade média: " + velocidadeMedia);
    System.out.println("Combustível gasto:" + combustivelGasto);


    teclado.close();
    }
    
}
