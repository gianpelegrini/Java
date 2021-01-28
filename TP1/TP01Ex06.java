import java.util.Scanner;
/*
Giancarlo Pelegrini CB3007634

6 - Calcular e exibir a média aritmética de quatro valores quaisquer que serão
digitados.
*/

public class TP01Ex06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 0;
        
        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o " + Integer.toString(i + 1) + "º valor: ");
            total += scanner.nextDouble();
        }

        double media = total / 4;

        System.out.println("A media aritimetica eh igual a " + Double.toString(media));

        scanner.close();
    }
}