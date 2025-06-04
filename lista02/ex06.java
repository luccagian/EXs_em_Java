/*
 * Escreva um método estático mulComAdicao() que recebe dois números como
 * parâmetros. O primeiro parâmetro é um número real e o segundo parâmetro um
 * número inteiro. A função deve retornar a multiplicação entre os parâmetros,
 * porém, a multiplicação deve ser feita usando apenas a operação de adição.
 * 
*/

import java.util.Scanner;

public class ex06 {

    public static float mulComAdicao(float x, int y){
        float a = 0;
        for (int i = 0; i < y; i++){
            a += x;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        float n = scan.nextFloat();

        System.out.print("N de vezes a multiplicar: ");
        int mlt = scan.nextInt();

        float result = mulComAdicao(n, mlt);

        System.out.println("Resultado: " + result);

        scan.close();
    }
    
}
