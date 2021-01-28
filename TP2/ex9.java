import java.util.Scanner;

/*
Giancarlo Pelegrini CB3007634
 */

public class ex9 {
 public static void main(String[] args){
 
 Scanner scanner = new Scanner(System.in);
 


 int l;
 int c;



 System.out.println("Digite a quantidade de linhas: (maximo 10)");
 l = scanner.nextInt();
while (l>10){
    System.out.println("Numero invalido. Digite a quantidade de linhas: (maximo 10)"); 
    l = scanner.nextInt();
}

 System.out.println("Digite a quantidade de colunas: (maximo 10)");
 c = scanner.nextInt();

 while(c > 10){
    System.out.println("Numero invalido. Digite a quantidade de colunas: (maximo 10)");
    c = scanner.nextInt();
 }
 int[][] mat = new int[l][c];

for(int i=0; i<l; i++){
 
    for(int j=0; j<c; j++){
        System.out.println("Digite o valor da linha " + i + " coluna " + j);
        mat[i][j] = scanner.nextInt();

    }
}
 
System.out.println("");
System.out.println("Matriz");
for(int i=0; i<l; i++){
    
    for(int j=0; j<c; j++){
        System.out.print( mat[i][j] +  " ");
    }
    System.out.println("");
}


 scanner.close();
    }
}