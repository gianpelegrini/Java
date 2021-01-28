import java.util.Scanner;
/*
Giancarlo Pelegrini CB3007634
11 - A partir do diâmetro de um círculo que será digitado, calcular e exibir sua área.
*/

public class TP01Ex11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Digite o valor do diametro da esfera: ");
        double diametro = scanner.nextDouble();

        double raio = diametro / 2;

        double area = pi * Math.pow(raio, 2);

        System.out.println("O area do circulo eh igual a " + Double.toString(area) + " m²");

        scanner.close();
    }
}