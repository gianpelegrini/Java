import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634
1 - Entrar via teclado com a base e a altura de um retângulo, calcular e exibir sua
área.

 */

public class TP01Ex01 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 double base, altura, areaRetangulo;
 
 System.out.println("Informe o valor da base: ");
 base = scanner.nextDouble();
 
 System.out.println("Informe o valor da altura: ");
 altura = scanner.nextDouble();
 
 areaRetangulo = base * altura;
 
 System.out.println("A area do retangulo é: " + areaRetangulo);

 scanner.close();
    }
}