/*
 * Escreva um programa que imprime "Bem-vindo à disciplina de Estrutura de Dados!". Depois, modifique para pedir o nome do aluno e
 * imprimir "Bem-vindo, [nome]!".
 */


import java.util.Scanner;

public class ex01{

        public static void main(String[] args) {

            System.out.println("Bem-vindo à disciplina de Estrutura de Dados!");

            System.out.print("Digite seu nome: ");

            Scanner scan = new Scanner(System.in);

            String input = scan.nextLine();

            System.out.println("Bem-vindo, " + input + "!");

            scan.close();
        }

}
