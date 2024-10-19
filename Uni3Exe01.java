import java.util.Scanner;

public class Uni3Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //dados

        //entrada
        System.out.println("digite largura do terreno");
        float largura = teclado.nextFloat();
        System.out.println("digite comprimento do terreno");
        float comprimento = teclado.nextFloat();

        float area = largura * comprimento;
        //saída

        System.out.println("A area vai ser "+ area);
        teclado.close();

    }
}
