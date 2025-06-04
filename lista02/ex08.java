/*
 * Dois círculos se sobrepõem (colidem) se a soma dos seus raios é maior que ou
 * igual a distância entre seus centros. A distância entre dois pontos pode ser
 * calculada usando o teorema de Pitágoras (c = √a^2! + b^2). 
 * 
 * Escreva um método estático haColisaoEntreCirculos() que recebe seis parâmetros: 
 * a posição p1(x,y) e o raio r1 do primeiro círculo e a posição p2(x,y) e o raio r2 do segundo círculo. 
 * Com os parâmetros informados, a função deve retornar true caso os círculos estejam
 * sobrepostos ou false, caso contrário.
 * 
*/

import java.util.Scanner;

public class ex08 {

    public static boolean haColisaoEntreCirculos(double a1, double b1, double c1, double a2, double b2, double c2){
        boolean colide;
        
        double dist = Math.sqrt(Math.pow((a2-a1),2) + Math.pow((b2-b1),2));

        if ((c1 + c2) >= dist){
            colide = true;
        } else {
            colide = false;
        }

        return colide;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); 

        System.out.print("Insira o posicao p1(x,y) do circulo 1: ");
        String p1 = scan.next();

        String[] pos = p1.split(",");
        double x1 = Double.parseDouble(pos[0].trim());
        double y1 = Double.parseDouble(pos[1].trim());

        System.out.print("Insira o raio do circulo 1: ");
        double r1 = scan.nextDouble();


        System.out.print("Insira o posicao p2(x,y) do circulo 2: ");
        String p2 = scan.next();
        
        pos = p2.split(",");
        double x2 = Double.parseDouble(pos[0].trim());
        double y2 = Double.parseDouble(pos[1].trim());

        System.out.print("Insira o raio do circulo 2: ");
        double r2 = scan.nextDouble();
        

        boolean colidem = haColisaoEntreCirculos(x1,y1,r1,x2,y2,r2);

        System.out.println("\nOs circulos colidem? ");
        System.out.println("Resposta: " + colidem);
        
        scan.close();
        
    }
    
}
