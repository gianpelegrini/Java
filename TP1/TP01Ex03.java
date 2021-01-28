import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634
3 - Calcular e exibir a área de um quadrado a partir do valor de sua diagonal que será
digitado.
*/

class TP01Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da diagonal do quadrado: ");
        double diagonal = scanner.nextDouble();

        double h = diagonal * diagonal;

        double base = Math.sqrt(h/2); 

        double area = base * base;


        System.out.println("diagonal: " + Double.toString(diagonal));

        System.out.println("h: " + Double.toString(h));
        System.out.println("base: " + Double.toString(base));
        System.out.println("O valor da area do quadrado eh " + Double.toString(area));

        scanner.close();
    }
}