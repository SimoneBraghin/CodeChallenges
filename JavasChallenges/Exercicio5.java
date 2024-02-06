import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int quantidadeDeParametros = args.length;
        int somaFinal = 0;

        int[] numeros = new int[2];

        if (quantidadeDeParametros == 0) {
            System.out.println("Informe 2 números:");
            numeros[0] = scan.nextInt();
            numeros[1] = scan.nextInt();
        } else if (quantidadeDeParametros == 1) {
            System.out.println("Informe mais 1 número:");
            numeros[0] = Integer.parseInt(args[0]);
            numeros[1] = scan.nextInt();
        } else if (quantidadeDeParametros == 2) {
            numeros[0] = Integer.parseInt(args[0]);
            numeros[1] = Integer.parseInt(args[1]);
        } else {
            System.exit(0);
            System.out.println("Quantidade de parâmetros inválida.");
        }

        for (int i = 0; i < numeros.length; i++) {
            somaFinal += numeros[i];
        }

        System.out.println("A soma final foi: " + somaFinal);

    }

}
