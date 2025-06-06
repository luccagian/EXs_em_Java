import java.text.Normalizer;
import java.util.regex.Pattern;
import java.lang.Exception;

public class Palindromo{
    private String texto;

    public Palindromo(){
        texto  = new String(""); // cria um objeto vazio
    }

    public Palindromo(String texto){ // cria o objeto com o texto por parametro
        this.texto = texto;
    }

    public String getTexto(){ 
        return texto;
    }

    public void setTexto(String texto) throws Exception { // cria o objeto e caso o parametro for vazio mostra excessao
        if (texto == ""){
            throw new Exception("O texto inserido nao pode estar vazio");
        }
        this.texto = texto;
    }

    public boolean verificar(){
        boolean palindromo = true;

        this.texto = this.texto.replaceAll("[\\s+,!?.]",""); //remove os sinais e pontos
        this.texto = this.texto.toLowerCase(); // converte string para letras minusculas

        String normalizer = Normalizer.normalize(this.texto, Normalizer.Form.NFD); // retira os acentos da palavra 
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        this.texto = pattern.matcher(normalizer).replaceAll("");
        
        char[] textoVet = this.texto.toCharArray(); // cria array com a string utilizada
        char[] aux = new char[textoVet.length]; // cria auxiliar com tamanho do array original

        for (int i = (textoVet.length - 1 ); i >= 0; i--){
            aux[(textoVet.length - (i+1))] = textoVet[i]; // preeenche array auxliar com ordem inversa do original
        }

        for (int i = 0; i < textoVet.length; i++){
            if (aux[i] != textoVet[i]) { // compara se tiver uma letra diferente e retona false
                palindromo = false;
                break;
            } 
        }
        
        return palindromo;
    }
}