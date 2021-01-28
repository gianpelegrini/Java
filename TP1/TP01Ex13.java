import java.util.Scanner;
/*
Giancarlo Pelegrini CB3007634

13 - Calcular e exibir a velocidade final (em km/h) de um automóvel, a partir dos
valores da velocidade inicial (em m/s), da aceleração (m/s2) e do tempo de percurso
(em s) que serão digitados.

*/
public class TP01Ex13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vf = 0;
	double vfc = 0;
	
       
      

        System.out.print("Digite a velocidade inicial (em m/s): ");
        double vi = scanner.nextDouble();

        System.out.print("Digite a aceleração (em m/s²): ");
        double a = scanner.nextDouble();

        System.out.print("Digite o tempo (em s): ");
	double t = scanner.nextDouble();

	vf = vi + (a * t);
	vfc =vf * 3.6;

	
	

        System.out.println("Velocidade final (m/s): " + vf);
        System.out.println("Velocidade final (k/h): " + vfc);
        
        scanner.close();
    }
}