import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Giancarlo Pelegrini CB3007634
 */
public class ex3 {
    public static void main(String[] args) {
        
            DecimalFormat decimal = new DecimalFormat("0.00");
            Scanner read = new Scanner(System.in);

            int num = 0;
            int inter =0;
            int inter2=0;
            double soma = 0;
            double maior = 0;
            double media = 0;
            char conf;
            double porcp =0;
            double porcn =0;
            double porcp2 =0.0f;
            double porcn2 =0.0f;

            
            while(inter==0)
                {
                for(int i=0;i<1;i++)
                {
                    System.out.println("Digite o numero de valores.");
                    num = read.nextInt();  
                    if(num<0 || num>20){
                        System.out.println("Valor invalido, deve ser positivo e menor que 20.");
                        i--;
                    }
                }

                double val[] = new double[num];

                for(int i=0;i<=(num-1);i++)
                {
                    System.out.println("Digite o " + (i+1) + "º valor: ");
                    val[i] = read.nextDouble();
                    
                    if(val[i]>0){
                        porcp = porcp +1;
                    }
                    else{
                        porcn = porcn +1;
                    }
                }
                
                porcp2 = (porcp/num)*100;
                porcn2 = (porcn/num)*100;


                for(int i=0;i<=(num-1);i++)
                {
                    if(maior<val[i])
                    {
                        maior = val[i];
                    }
                }

                double menor = val[0];

                for(int i=0;i<=(num-1);i++)
                {
                    if(menor>val[i])
                    {
                        menor = val[i];
                    }
                }

                for(int i=0; i<=(num-1);i++)
                {
                    soma = soma + val[i];
                }

                media = soma/num;

                System.out.println("O maior valor: " + maior);
                System.out.println("A soma dos valores: " + soma);  
                System.out.println("Media aritmetica dos valores: " + media);
                System.out.println("Porcentagem positivos: " + porcp2 + "%");
                System.out.println("Porcentagem negatiivos: " + porcn2 + "%");
                
                do
                {
                System.out.println("Deseja repetir o programa? S = Sim, N = Nao");
                conf = read.next().charAt(0);
                    if(conf!='S' && conf!='N'){
                        System.out.println("Caracter invalido, digite novamente.");
                        inter2=1;
                    }
                    else
                    {
                        inter2=2;
                    }
                }
                while(inter2==1);
                
                if(conf=='S')
                {
                    inter =0;
                }
                else{
                    inter=2;
                }
        }
    }    
}