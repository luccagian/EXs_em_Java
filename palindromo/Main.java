import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while(true){

            System.out.print("Digite um texto ou /sair para sair: ");
            String entrada = scan.nextLine();

            if (entrada.equals("/sair")){ // se digitado o comando /sair a execucao para
                System.out.println("\nVoce saiu do programa!");
                break;

            }

            Palindromo paliObj = new Palindromo(); // cria um objeto paliObj

            try {
                paliObj.setTexto(entrada); // insere a entrada do usuario no objeto
                } catch (Exception e) {
                    System.out.println("\nErro: " + e.getMessage());  // caso estiver vazia a entrada retorna uma mensagem 
                }

            if (!entrada.equals("")){  // caso a entrada nao estiver vazia executar o resultado
                boolean resultado = paliObj.verificar();

                System.out.println("\nPalindromo?");
                System.out.println("Resposta: " + resultado);
            }

        }

        scan.close();
    }
    
}
