/*
 * Escreva um código Java que leia 10 números inteiros e, em seguida, exiba-os na
 * ordem inversa que foram inseridas pelo usuário.
 * 
*/

import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int vet[] = new int[10];

        for (int i = 0; i < vet.length; i++){
            System.out.print("Digite o " + (i+1) + " valor: ");
            vet[i] = scan.nextInt();
        }

        System.out.print("vetor: [");

        for (int i = (vet.length - 1); i >= 0; i--){
            System.out.print(vet[i] + ", ");
        }

        System.out.print("]");
        
        scan.close();
    }
    
}
