import java.util.Scanner;

public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o valor do carro: ");
        double valorCarro = scan.nextDouble();

        System.out.print("Digite a taxa de juros ao mês (em decimal): ");
        double taxaJuros = scan.nextDouble();

        double valorParcelaMinima = 1000;
        int numeroParcelas = 0;

        double valorParcela = valorCarro;

        while (valorParcela >= valorParcelaMinima) {
            numeroParcelas++;
            valorParcela = (valorCarro + (valorCarro * taxaJuros * numeroParcelas)) / numeroParcelas;

            if (valorParcela < valorParcelaMinima) {
                numeroParcelas--;
                valorParcela = (valorCarro + (valorCarro * taxaJuros * numeroParcelas)) / numeroParcelas;
                break;
            }
        }
            System.out.println("O carro pode ser parcelado em até " + numeroParcelas + " vezes de " + valorParcela + " a uma taxa de juros de " + (taxaJuros * 100) + "% ao mês.");
    }
}