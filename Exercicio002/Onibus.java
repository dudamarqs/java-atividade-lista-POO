package Exercicio002;

public class Onibus extends Veiculo {
    // Definir constantes:
    private static final double VALOR_BASE = 80000;
    private static final double IPVA = 2/100;

    public Onibus (String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        double valorEstimado = calcularValorEstimado();
        return valorEstimado * IPVA;
    }

    public double calcularValorEstimado() {
        int idadeOnibus = 2024 - getAnoFabricacao();
        double valorEstimado = VALOR_BASE - (3000 * idadeOnibus);

        return Math.max(valorEstimado, 0); 
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("DETALHES DO ONIBUS:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAnoFabricacao());
        System.out.printf("Valor Estimado: R$ %.2f%n", calcularValorEstimado());
        System.out.printf("IPVA: R$ %.2f%n", calcularIPVA());
    } 

}
