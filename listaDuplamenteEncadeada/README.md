# Lista Duplamente Encadeada e Circular em Java
Você foi contratado como estagiário por uma empresa de tecnologia educacional que está desenvolvendo um sistema de navegação por módulos de cursos online. A equipe precisa de uma estrutura de dados eficiente para permitir que o usuário avance, 
retorne e também navegue circularmente entre os módulos. Para isso, decidiram usar duas versões da lista duplamente encadeada:

1. Uma lista duplamente encadeada comum, para o histórico linear de navegação do usuário.
2. Uma lista duplamente encadeada circular, para representar a navegação cíclica entre os módulos de um curso.

Implemente em Java duas classes distintas:

1. ListaDuplamenteEncadeada:
  - Permita adicionar elementos no início e no fim.
  - Permita remover elementos do início e do fim.
  - Implemente a navegação para frente e para trás.
  - Crie um método exibir() que mostre os elementos da lista do primeiro ao último e vice-versa.

2. ListaCircularDuplamenteEncadeada:
  - Semelhante à anterior, mas o último elemento deve apontar para o primeiro e o primeiro para o último.
  - Implemente um método navegarCircular(int passos) que percorre a lista a partir do elemento atual, indo para frente ou para trás (passos positivos ou negativos), imprimindo o conteúdo do nó a cada passo.

Regras e Requisitos:

• Você deve criar uma classe No<T> genérica, que seja usada nas duas listas.
• O código deve ser modularizado, com tratamento de exceções e sem uso de bibliotecas prontas como LinkedList.
• Crie uma classe Main para testar ambas as listas com exemplos reais de módulos como: "Introdução", "Algoritmos", "Estruturas de Dados", etc.



Exemplo de uso de ListaDuplamenteEncadeada: 
        
        public class Main {
              public static void main(String[] args) {
                    ListaDuplamenteEncadeada<String> lista = new ListaDuplamenteEncadeada<>();
                    
                    // Adicionando módulos
                    lista.adicionarFim("Introdução");
                    lista.adicionarFim("Algoritmos");
                    lista.adicionarFim("Estruturas de Dados");
                    lista.adicionarInicio("Pré-requisitos");
            
                    System.out.println("Lista (do início ao fim):");
                    lista.exibirInicioFim();
            
                    System.out.println("\nLista (do fim ao início):");
                    lista.exibirFimInicio();

                    // Remoção de elementos
                    lista.removerInicio(); // Remove "Pré-requisitos"
                    lista.removerFim();    // Remove "Estruturas de Dados"
            
                    System.out.println("\nApós remoções:");
                    lista.exibirInicioFim();
                    }
            }


Saída esperada:

        Lista (do início ao fim):
        Pré-requisitos <-> Introdução <-> Algoritmos

        Lista (do fim ao início):
        Algoritmos <-> Introdução <-> Pré-requisitos

        Após remoções:
        Introdução <-> Algoritmos
        
        
Exemplo de uso de ListaCircularDuplamenteEncadeada:

        public class MainCircular {
              public static void main(String[] args) {
                    ListaCircularDuplamenteEncadeada<String> listaCircular = new ListaCircularDuplamenteEncadeada<>();
        
                    listaCircular.adicionar("Introdução");
                    listaCircular.adicionar("Algoritmos");
                    listaCircular.adicionar("Estruturas de Dados");
                    listaCircular.adicionar("POO");
            
                    System.out.println("Navegação circular a partir do atual:");
                    listaCircular.navegarCircular(5); // Avança 5 posições (com repetição)
            
                    System.out.println("\nNavegação circular reversa:");
                    listaCircular.navegarCircular(-3); // Retrocede 3 posições
                }
            }


Saída esperada:

                    Navegação circular a partir do atual:
                    Introdução
                    Algoritmos
                    Estruturas de Dados
                    POO
                    Introdução
                    
                    Navegação circular reversa:
                    POO
                    Estruturas de Dados
                    Algoritmos

