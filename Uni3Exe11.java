import java.util.Scanner;

public class Uni3Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int valorFahrenheit = 32;
        double valorCelcius = teclado.nextInt();

        double fahrenheit = (9/5) * valorCelcius + valorFahrenheit;

        System.out.println("°F= "+ fahrenheit);


        teclado.close();
    }
}
