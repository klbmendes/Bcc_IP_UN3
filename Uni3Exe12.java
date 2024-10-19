import java.util.Scanner;

public class Uni3Exe12 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorHora = 10;
        double valorDependente = 60;
        //inss 8,5% /100
        double descontoInss = 8.5;
        //imposto de renda 5% / 100
        double descontoIp = 5.0;
        
        String nomeFuncionario = teclado.next();
        double horasTrabalhadas = teclado.nextDouble();
        double numeroDependentes = teclado.nextDouble();

        double salarioBruto = (horasTrabalhadas * valorHora) + (valorDependente * numeroDependentes); 
        double desconto1 = salarioBruto * (descontoInss/100);
        double desconto2 = salarioBruto * (descontoIp/100);
        double salarioLiquido = salarioBruto - desconto1 - desconto2;

        System.out.println("Funcionário: " + nomeFuncionario);
        System.out.println("Salário Bruto: " + salarioBruto);
        System.out.println("Salário Líquido: " + salarioLiquido);

        teclado.close();
    }
}
