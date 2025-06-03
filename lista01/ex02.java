/*
 * 
 * Peça dois números inteiros e exiba a soma.
 * 
 */

import java.util.Scanner;

public class ex02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("SOME DOIS NUMEROS!!");

        System.out.print("Escolha o primeiro numero: ");
        int a = scan.nextInt();

        System.out.print("Escolha o segundo numero: ");
        int b = scan.nextInt();

        int c = a + b;
        System.out.println("Resultado = " + c);

        scan.close();

    }
    
}
