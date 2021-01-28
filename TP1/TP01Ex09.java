import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634

9 - Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos
valores da resistência e corrente elétrica que serão digitados. Utilize a lei de Ohm.
*/

public class TP01Ex09 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da resistencia: ");
        double resistencia = scanner.nextDouble();

        System.out.print("Digite o valor da corrente: ");
        double corrente = scanner.nextDouble();

        double tensao = resistencia * corrente;

        System.out.println("A tensao da corrente eh igual a " + Double.toString(tensao));



        scanner.close();
    }
}