/*
 * 
 * Peça três números e retorne o maior valor usando uma função
 * 
 */


import java.util.Scanner;

public class ex04 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] vet = new int[3] ;

        int nMax = 0;
        
        for (int i = 0; i < vet.length; i++){
            System.out.print("Insira um numero: ");
            vet[i] = scan.nextInt();
        }


        for (int i = 0; i < (vet.length - 1); i++){
            if (vet[i] < vet[i+1]){
                nMax = vet[i+1];
            } else {
                nMax = vet[i];
                break; 
                }
            }

        System.out.print("Maior numero: "+ nMax);
        
        scan.close();
        
    }
    
}
