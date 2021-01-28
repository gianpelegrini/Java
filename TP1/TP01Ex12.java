import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634

12 - Calcular e exibir o volume de um cone a partir dos valores da altura e do raio da
base que serão digitados.
*/

public class TP01Ex12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Digite a altura do cone: ");
        double h = scanner.nextDouble();

        System.out.print("Digite o valor do raio da base: ");
        double raio = scanner.nextDouble();

        double volume = (pi * (raio * raio) * h) / 3;

        System.out.println("o valor do volume do cone eh igual a " + Double.toString(volume) + " m³");
        
        scanner.close();
    }
}