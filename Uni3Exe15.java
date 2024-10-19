
import java.util.Scanner;

public class Uni3Exe15 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
//Construa um programa para ler um número inteiro (assuma até 3 dígitos) e imprima a saída da seguinte forma:

//dados
int centena = 0;
int dezena = 0;
int unidade = 0;
int numero;

//entrada
System.out.println("Número: ");
numero = teclado.nextInt();


//processo
centena = numero / 100;
numero = numero - (centena * 100);
dezena = numero / 10;
numero = numero - (dezena * 10);
unidade = numero;


//saida
System.out.println(centena + "centena(s) - "+ dezena + "dezena(s) - "+ unidade + "unidade(s)-");

teclado.close();
}
}


