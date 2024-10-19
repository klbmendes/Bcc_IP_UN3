import java.util.Scanner;

public class Uni3Java07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double volumeLata = 0.35;
        double volumeGarrafa600 = 0.60;
        double volumeGarrafa2L = 2.00;

        //quantidade de cada formato
        System.out.println("Digite a quantidade de latas de 350ml: ");
        int quantidadeLatas = teclado.nextInt();

        System.out.println("Digite a quantidade de garrafas de 600ml: ");
        int quantidadeGarrafas600 = teclado.nextInt();

        System.out.println("Digite a quantidade de garrafas de 2l: ");
        int quantidadeGarrafas2l = teclado.nextInt();

        //total de litros comprados
        double totalLitros = (quantidadeLatas * volumeLata) + 
        (quantidadeGarrafas600 * volumeGarrafa600) + 
        (quantidadeGarrafas2l * volumeGarrafa2L);

System.out.println(" O total de litros de refrigerantes comprados é:  " + totalLitros);

teclado.close();

    }
}
