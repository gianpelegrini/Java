import java.util.Scanner;
/*
Giancarlo Pelegrini CB3007634

18 - Entrar via teclado com o valor de cinco produtos. Após as entradas, digitar um
valor referente ao pagamento da somatória destes valores. Calcular e exibir o troco
que deverá ser devolvido.
*/

public class TP01Ex18 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Digite o valor do produto 1: ");
        double p1 = scanner.nextDouble();

	System.out.print("Digite o valor do produto 2: ");
        double p2 = scanner.nextDouble();

	System.out.print("Digite o valor do produto 3: ");
        double p3 = scanner.nextDouble();

	System.out.print("Digite o valor do produto 4: ");
        double p4 = scanner.nextDouble();

	System.out.print("Digite o valor do produto 5: ");
        double p5 = scanner.nextDouble();

	System.out.print("Digite o valor pago: ");
        double pago = scanner.nextDouble();

	double soma = p1 + p2 + p3 + p4 + p5;
	
	double troco = pago - soma;


        System.out.printf("O troco do valor do pago: %.2f\n", troco);


        scanner.close();
    }
}