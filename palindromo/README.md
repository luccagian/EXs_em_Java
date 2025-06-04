#Java e POO – Classe Palindromo

Declare uma classe Java chamada Palindromo que possui um atributo privado chamado texto, do tipo String, e os seguintes métodos públicos:
 - Construtor sem parâmetro = Define que o atributo texto é uma string vazia ("").
 - Construtor que recebe um parâmetro do tipo String = O valor do parâmetro é atribuído ao atributo texto.
 - "Getter" para o atributo texto = Retorna o valor do atributo texto.
 - "Setter" para o atributo texto = Altera o valor do atributo texto de acordo com o parâmetro passado ao método. Esse método deve validar o parâmetro com a seguinte regra: não deve ser permitido passar o valor null para o parâmetro.
 - verificar() = Verifica se o atributo texto armazena um texto que é palíndromo. Em caso positivo, retorna true. Em caso negativo, retorna false.

Restrições de implementação da classe Palindromo:
 - A verificação de palíndromo não deve usar pilha(s).
 - Não devem existir chamadas à System.out.print*() nos métodos da classe Palindromo.

Seu programa deve ter uma classe Main que contém o ponto de partida do programa Java.

Na main(), o programa deve pedir para a pessoa informar um texto qualquer e, em seguida, indicar se o texto informado é ou não é um palíndromo, usando a classe Palindromo que você implementou.

O programa deve considerar a string vazia ("") como palíndromo.

O programa tem que avaliar palíndromos que possuem palavras com acentos, sinais de pontuação e outros símbolos/caracteres especiais.

O programa deve continuar pedindo para a pessoa informar um texto qualquer (e continue mostrando se o texto informado é ou não é um palíndromo), até que a pessoa informe o texto "/sair", condição que faz com que o programa seja encerrado.
