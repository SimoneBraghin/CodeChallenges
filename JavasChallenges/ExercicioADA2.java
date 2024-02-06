import java.util.Arrays;

public class ExercicioADA2 {

    // Joãozinho descobriu que tem uma facilidade com português na escola e então resolveu estudar 
    // soletrando para participar de uma competição que vai ocorrer em sua cidade.
    // Para ajudar joão com seus estudos, crie uma função que receba uma palavra (String), 
    // separe todos os caracteres em um array eretorne esse array.

    // Ex. Entrada: amor
    // Saída : ["a", "m", "o", "r"]

    // Ex: 
    // Entrada: carro 
    // Saída: ["c", "a", "r", "r", "o"]
    
    public static String[] separarPalavra(String palavra) {
        String[] caracteres = new String[palavra.length()];

            for (int i = 0; i < palavra.length(); i++) {
            caracteres[i] = String.valueOf(palavra.charAt(i));
        }

        return caracteres;
    }

    public static void main(String[] args) {
        
        String palavra1 = "abacate";
        String palavra2 = "Vovó Juju";

        
        String[] resultado1 = separarPalavra(palavra1);
        String[] resultado2 = separarPalavra(palavra2);

        
        System.out.println("Entrada: " + palavra1);
        System.out.println("Saída: " + Arrays.toString(resultado1));

        System.out.println("\nEntrada: " + palavra2);
        System.out.println("Saída: " + Arrays.toString(resultado2));
    }
}