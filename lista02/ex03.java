/*
 * Escreva um código Java que leia 10 números reais e, 
 * após a leitura dos números,informe qual é o maior e qual é o menor.
 * 
*/

import java.util.Scanner;

public class ex03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float vet[] = new float[10];

        for (int i = 0; i < vet.length; i ++){
            System.out.print("Digite o " + (i+1) + " valor: ");
            vet[i] = scan.nextFloat();
        }

        float vMin = vet[0];
        float vMax = vet[0];

        for (int i = 0; i < (vet.length); i ++){
            if (vet[i] < vMin){
                vMin = vet[i];
            }
            if (vet[i] > vMax){
                vMax = vet[i];
            }
        }

        System.out.println("Menor valor: " + vMin);
        System.out.println("Maior valor: " + vMax);

        scan.close();

    }
    
}
