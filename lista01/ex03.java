/*
 * 
 * Peça um número e exiba se ele é par ou ímpar
 * 
 */



import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Par ou impar?");

        System.out.print("Escolha um numero: ");
        int num = scan.nextInt();

        if (num % 2 == 0){
            System.out.println("O numero " + num + " eh par");
        } else System.out.println("O numero " + num + " eh impar");

        scan.close();

    }
    
}
