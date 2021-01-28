import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634

2 - Calcular e exibir a área de um quadrado, a partir do valor de sua aresta que será
digitado.
*/

public class TP01Ex02 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 double aresta, areaQuadrado;
 
 System.out.println("Informe o valor da aresta: ");
 aresta = scanner.nextDouble();
 

 areaQuadrado = aresta * aresta;
 
 System.out.println("A area do quadrado é: " + areaQuadrado);

 scanner.close();
 }

}