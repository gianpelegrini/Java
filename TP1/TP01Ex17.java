import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634

17 - Entrar via teclado com dois valores quaisquer X e Y. Calcular e exibir o
cálculo XY (X elevado a Y). Pesquisar as funções Exp e Ln.
*/

public class TP01Ex17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

  
	
      
        System.out.print("Digite X: ");
        double x = scanner.nextDouble();

        System.out.print("Digite Y: ");
        double y = scanner.nextDouble();

	double r = Math.pow(x, y);
	double lnx = Math.log(x);
	double lny = Math.log(y);

       	System.out.printf("X elevado a Y: %.2f \n", r);
	System.out.printf("Log neperiano de X: %.2f \n", lnx);
	System.out.printf("Log neperiano de Y: %.2f \n", lny);

        scanner.close();
    }
}