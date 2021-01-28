import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634

14 - Calcular e exibir o volume livre de um ambiente que contém uma esfera de raio
r inscrita em um cubo perfeito de aresta a. Os valores de r  e a serão
digitados.
*/

public class TP01Ex14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ve = 0;
	double vc = 0;
	double pi = 3.14;
	double arealivre = 0;
	
      
        System.out.print("Digite o raio da esfera (cm): ");
        double r = scanner.nextDouble();

        System.out.print("Digite a aresta do quadrado (cm), maior ou igual o dobro do raio do cubo: ");
        double a = scanner.nextDouble();

	while(a < r*2){
        System.out.print("Digite a aresta do quadrado (cm), maior ou igual o dobro do raio do cubo: ");
            a = scanner.nextDouble();
	}

	ve = 4 * pi * (r * r * r);
	ve /= 3;

	vc = a * a * a;

	arealivre = vc - ve;

        System.out.printf("Volume da Esfera:  %.2fcm³ \n", ve);
       	System.out.printf("Volume do cubo: %.2fcm3 \n", vc);
       	System.out.printf("Area livre: %.2fcm³ \n", arealivre);


        scanner.close();
    }
}