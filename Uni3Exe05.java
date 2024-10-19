import java.util.Scanner;

public class Uni3Exe05 {

    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o número de identificação dos frangos na granja");
        int frangos = teclado.nextInt();

        double ValorGasto = frangos * (4 + (3.5 * 2));

        System.out.println("O valor total gasto foi:" + ValorGasto);
        teclado.close();


}
}

