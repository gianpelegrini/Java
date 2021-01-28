import java.util.Scanner;
/*
Giancarlo Pelegrini CB3007634

7 - Calcular e exibir a média geométrica de dois valores quaisquer que serão
digitados.
*/
public class TP01Ex07 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double total = 1;
        
        for (int i = 0; i < 2; i++) {
            System.out.print("Digite o " + Integer.toString(i + 1) + "º valor: ");
            total *= scanner.nextDouble();
        }

        double media = Math.sqrt(total);
        

        System.out.println("A media geometrica eh igual a " + Double.toString(media));

        scanner.close();
    }
} 