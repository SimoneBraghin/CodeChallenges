import java.util.Scanner;

public class ExercicioAda {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Digite o número de linhas: ");
            int numeroLinhas = scanner.nextInt();
            
            for (int linha = numeroLinhas; linha >= 1; linha--) {
                for (int coluna = 1; coluna <= linha; coluna++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
