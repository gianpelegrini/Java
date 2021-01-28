import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634
 */

public class ex8 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 int constante;
 int resul;

 int[][] mat = new int[3][4];
 int[][] newMat = new int [3][4];
for(int i=0; i<3; i++){
 
    for(int j=0; j<4; j++){
        System.out.println("Digite o valor da linha " + i + " coluna " + j);
        mat[i][j] = scanner.nextInt();

    }
}
 
System.out.println("Digite a constante multiplicativa: ");
constante = scanner.nextInt();

System.out.println("");
System.out.println("Matriz 1");

for(int i=0; i<3; i++){
    
    for(int j=0; j<4; j++){

        System.out.print( mat[i][j] +  " ");
    }
    System.out.println("");
}
System.out.println("");
System.out.println("Matriz 2");

for(int i=0; i<3; i++){
    
    for(int j=0; j<4; j++){

        resul = constante * mat[i][j];
        newMat[i][j] = resul; 
        System.out.print( resul +  " ");
    }
    System.out.println("");
}



 scanner.close();
    }
}