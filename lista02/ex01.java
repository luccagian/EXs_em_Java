/*
 * Escreva um código Java que leia dois números inteiros informados pelo usuário.
 * Cada número deve ser salvo em variáveis distintas, por exemplo, valor1 e valor2.
 * Após ler os dois números, o código deve trocar o conteúdo das variáveis.
 * 
 */

import java.util.Scanner;

public class ex01{

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Insira o valor de 1: ");
        int valor1 = scan.nextInt();

        System.out.print("Insira o valor de 2: ");
        int valor2 = scan.nextInt();

        int aux = valor1;
        valor1 = valor2;
        valor2 = aux;
        
        System.out.println("Valor de 1: " + valor1);
        System.out.println("Valor de 2: " + valor2);

        scan.close();
    }

}
