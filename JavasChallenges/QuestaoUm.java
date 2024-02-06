import java.util.Scanner;

public class QuestaoUm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual o valor do empréstimo? ");
        double valor_emprestimo = scan.nextDouble();

        System.out.print("Qual a taxa de juros?  ");
        double taxa_juros = scan.nextDouble();

        System.out.print("Qual o número de meses para o pagamento? ");
        int total_de_meses = scan.nextInt();

        double total_saldo_devedor = valor_emprestimo;
        double amortizacao = valor_emprestimo / total_de_meses;
        double total_juros = 0;
        double total_pago = 0;

        System.out.println("Valor fixo da amortização é R$ " + amortizacao);

        for (int i = 1; i <= total_de_meses; i++) {
            double juros_mensal = total_saldo_devedor * taxa_juros;
            double parcela_mensal = juros_mensal + amortizacao;
            total_saldo_devedor -= amortizacao;

            total_juros += juros_mensal;
            total_pago += parcela_mensal;

            System.out.println("Parcela " + i + " | Juros: R$ " + juros_mensal +
                    " | Prestação: R$ " + parcela_mensal + " | Saldo devedor: R$ " + total_saldo_devedor);
        }

        System.out.println("Total: Prestação R$ " + total_pago + ", Juros R$ " + total_juros +
                ", Amortização R$ " + valor_emprestimo);
    }
}
