import java.util.Scanner;
/*
Giancarlo Pelegrini CB3007634
16 - Entrar via teclado com o valor de um ângulo em graus, calcular e exibir as
seguintes funções trigonométricas: seno, cosseno, tangente e secante deste ângulo.
Lembre-se que uma função trigonométrica trabalha em radianos.
*/

public class TP01Ex16 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   
        System.out.print("Digite o angulo (em radianos): ");
        double a = scanner.nextDouble();

	double sen = Math.sin(a);
	double cos = Math.cos(a);
	double tan = Math.tan(a);
	double sec;



        System.out.printf("Seno: %.2f\n", sen);
        System.out.printf("Cosseno: %.2f\n", cos);
       	System.out.printf("Tangente: %.2f\n", tan);
	if (cos != 0){	
		sec = 1/cos;
       	System.out.printf("Secante: %.2f\n", sec);
	}

        scanner.close();
    }
}