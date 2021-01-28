import java.util.Scanner;
/*
Giancarlo Pelegrini CB3007634

8. - Sabendo que uma milha marítima equivale a um mil, oitocentos e cinquenta e
dois metros e que um quilômetro possui mil metros, fazer um programa para
converter milhas marítimas em quilômetros.
*/

public class TP01Ex08 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("DIgite o valor de milhas: ");
        double milhas = scanner.nextDouble();

        double kilometros = milhas * 1.852;

        System.out.println("O numero digitado de milhas em kilometros vale " + Double.toString(kilometros) + " km");

        scanner.close();
    }
}