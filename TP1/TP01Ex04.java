import java.util.Scanner;

/*
//Giancarlo Pelegrini CB3007634

4 - A partir dos valores da base e altura de um triângulo, calcular e exibir sua área.
*/
public class TP01Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a base do triangulo: ");
        double base = scanner.nextDouble();

        System.out.print("Digite a altura do triangulo: ");
        double altura = scanner.nextDouble();

        double area = (base * altura) / 2;

        System.out.println("A area do triangulo eh igual a " + Double.toString(area));

        scanner.close();
    }
}