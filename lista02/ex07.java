/*
 * Escreva um método estático contarVogais() que recebe uma string como parâmetro
 * e retorna a quantidade de vogais encontradas na string.
 */

import java.util.Scanner;

public class ex07 {

    public static int contarVogais(String s){

        int n = 0;
        char[] str = s.toCharArray();


        for (int i = 0; i < str.length; i++){
            if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u'){
                n++;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String word = scan.nextLine();

        int count = contarVogais(word);

        System.out.println("Vogais encontradas: " + count);

        scan.close();
        
    }
    
}