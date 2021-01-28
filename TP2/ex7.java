import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634
 */

public class ex7 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 double constante;
 double resul;

 int[][] mat = new int[3][4];

for(int i=0; i<3; i++){
 
    for(int j=0; j<4; j++){
        System.out.println("Digite o valor da linha " + i + " coluna " + j);
        mat[i][j] = scanner.nextInt();

    }
}
 
System.out.println("Digite a constante multiplicativa: ");
constante = scanner.nextDouble();

System.out.println("");
System.out.println("Matriz");
for(int i=0; i<3; i++){
    
    for(int j=0; j<4; j++){

        resul = constante * mat[i][j];
        System.out.print( resul +  " ");
    }
    System.out.println("");
}


 scanner.close();
    }
}