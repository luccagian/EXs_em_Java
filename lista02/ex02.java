/*
 * Escreva um código Java que leia uma letra e indique se é uma vogal ou consoante.
 * 
 */


import java.util.Scanner;

public class ex02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma letra: ");
        char letra = scan.next().charAt(0);

        char l = Character.toLowerCase(letra);


            if (l == 'a' || l == 'e' || l == 'i' || l == 'o' || l == 'u'){
                System.out.println("A letra " + letra + " eh uma vogal");
            } else {
                System.out.println("A letra " + letra + " eh uma consoante");

            }
             
            scan.close();
        }

        
    }
    

