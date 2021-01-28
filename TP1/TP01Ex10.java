import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634

10 - Entrar via teclado com o valor de uma temperatura em graus Celsius, calcular e
exibir sua temperatura equivalente em Fahrenheit.
*/

public class TP01Ex10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em celsius: ");
        double celsius = scanner.nextDouble();
        

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("Este valor em celsius eh igual a " + Double.toString(fahrenheit) + " em fahrenheit");

        scanner.close();
    }
}