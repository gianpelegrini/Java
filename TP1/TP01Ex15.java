import java.util.Scanner;
/*
Giancarlo Pelegrini CB3007634

15 - Entrar via teclado com o valor da cotação do dólar e uma certa quantidade de
dólares. Calcular e exibir o valor correspondente em Reais (R$).
*/

public class TP01Ex15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	double real = 0;

        System.out.print("Digite a cotação do dólar: ");
        double cot = scanner.nextDouble();

        System.out.print("Digite a quantidade de dólares: ");
        double qt = scanner.nextDouble();

        real = qt * cot;

        	System.out.println("O valor em reais: " + real);
        
        scanner.close();
    }
}