import java.util.Scanner;
/*
//Giancarlo Pelegrini CB3007634

5 - Calcular e exibir o volume de uma esfera a partir do valor de seu diâmetro que
será digitado.
*/

public class TP01Ex05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14;

        System.out.print("Digite o valor do diametro da esfera: ");
        double diametro = scanner.nextDouble();

        double raio = diametro / 2;

        double volume = (4 / 3) * pi * Math.pow(raio, 3);

        System.out.println("O volume da esfera eh igual a " + Double.toString(volume) + " m³");

        scanner.close();
    }
}