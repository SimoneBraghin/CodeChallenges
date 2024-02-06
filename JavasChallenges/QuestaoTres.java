import java.util.Scanner;

public class QuestaoTres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int tamanho = scan.nextInt();

        desenharTriangulo(tamanho);

        System.out.println("\n\n");

        desenharTriangulo(tamanho);
        desenharPiramide(tamanho);
    }
    public static void desenharTriangulo(int tamanho) {
        for (int linha = 1; linha <= tamanho; linha++) {
            for (int espaco = tamanho - linha; espaco > 0; espaco--) {
                System.out.print(" ");
            }

            for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void desenharPiramide(int tamanho) {
        for (int linha = tamanho - 1; linha >= 1; linha--) {
            for (int espaco = tamanho - linha; espaco > 0; espaco--) {
                System.out.print(" ");
            }

            for (int asterisco = 1; asterisco <= 2 * linha - 1; asterisco++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}