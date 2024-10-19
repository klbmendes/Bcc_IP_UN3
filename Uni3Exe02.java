import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Qual o valor do sapato?");
        float valor = teclado.nextFloat();
        //System.out.println("Valor de desconto aplicado ao sapato?");
        //float desconto = teclado.nextFloat();

        float preco = (float) (valor * 0.12);

        double desconto = valor - preco;

        System.out.println("O valor do desconto é:" + desconto);
        System.out.println("O preço é:" + preco);
        teclado.close();
}
}