import java.util.Scanner;

public class Uni3Exe03 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o preço do litro");
        float Preco = teclado.nextFloat();

        System.out.println("Valor do pagamento");
        float Pagamento = teclado.nextFloat();

        float Litros = Pagamento / Preco;

        System.out.println("O total de litros abastecidos é:" + Litros);
        teclado.close();
}
}
