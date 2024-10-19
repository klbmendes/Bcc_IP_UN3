import java.util.Scanner;

public class Uni3Exe10 {
            public static void main(String[] args) throws Exception {
                //entrada
                Scanner teclado = new Scanner(System.in);
        
                double cateto1 = teclado.nextDouble();
                double cateto2 = teclado.nextDouble();
        
                //processo
                double hipotenusa = Math.sqrt((cateto1 * cateto1) + (cateto2 * cateto2)) ;
        
                //saída
                System.out.println("A hipotenusa é: " + hipotenusa);
            
                teclado.close();
            }
        }