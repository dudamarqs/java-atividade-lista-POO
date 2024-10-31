package Exercicio003;

public class QuartoDuplo implements Acomodacao, ServicoAdicional {
    private static final double DIARIA = 180;

    public double calcularDiaria() {
        return DIARIA;
    }

    public double calcularServico(int dias, int pessoas) {
        double cafeDaManha = 20.0 * pessoas * dias;
        double limpezaExtra = 30.0 * dias;
        return cafeDaManha + limpezaExtra;
    }
    
    public void exibirDetalhes(int dias) {
        double valorAcomodacao = calcularDiaria() * dias;
        double valorServico = calcularServico(dias, 2);
        double valorTotal = valorAcomodacao + valorServico;

        System.out.println("\nQUARTO DUPLO - " + dias + " dias:");
        System.out.println("Custo da acomodação: R$ " + valorAcomodacao);
        System.out.println("Custo dos serviços: R$ " + valorServico);
        System.out.println("Custo total: R$ " + valorTotal);
    }
}