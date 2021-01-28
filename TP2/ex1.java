import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634
 */

public class ex1 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 double v1, v2;
 
 System.out.println("Digite o primeiro valor: ");
 v1 = scanner.nextDouble();
 
 System.out.println("Digite o segundo valor (maior do que o primeiro): ");
 v2 = scanner.nextDouble();

 while(v1 >= v2){
    System.out.println("Digite o segundo valor (maior do que o primeiro): ");
    v2 = scanner.nextDouble();

 }
 

 
 System.out.println("Valor 1: " + v1);
 System.out.println("Valor 2: " + v2);

 scanner.close();
    }
}