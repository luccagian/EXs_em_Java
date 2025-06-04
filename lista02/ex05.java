/*
 * Escreva um método estático min() que recebe dois parâmetros numéricos inteiros
 * e retorna o menor valor entre eles e um método estático max() que recebe dois
 * parâmetros numéricos inteiros e retorna o maior valor entre eles.
 * 
*/

import java.util.Scanner;

public class ex05 {

    public static int min(int a, int b){
        int x;

        if (a < b){
            x = a;
        } else {
            x = b;
        }

        return x;
    }

    public static int max(int a, int b){
        int y;

        if (a > b){
            y = a;
        } else {
            y = b;
        }

        return y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int n1 = scan.nextInt();

        System.out.print("Digite outro numero: ");
        int n2 = scan.nextInt();

        int vMin = min(n1, n2);
        int vMax = max(n1, n2);


        System.out.println("Menor valor: " + vMin);
        System.out.println("Maior valor: " + vMax);

        scan.close();
        
    }
    
}
