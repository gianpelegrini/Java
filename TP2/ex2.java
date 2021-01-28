import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634
 */

public class ex2 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 double v;
 int valor = 1;
 double soma = 0;
 double media = 0;
 double maior = 0;


 while (valor <= 10)
 {
    System.out.println("Digite o "+valor+"° valor positivo: ");
    v = scanner.nextDouble();
    while(v < 0){
        System.out.println("Você digitou um valor negativo. Digite o "+valor+"° valor positivo: ");
        v = scanner.nextDouble();
    }

    soma += v; 
    if(v > maior)
    {
        maior = v;
    }
    

    valor++;
   
 }
 
    media = soma/10;
    System.out.println("Soma: "+ soma);
    System.out.println("Media: "+ media);
    System.out.println("Maior: "+ maior);


 


 scanner.close();
    }
}