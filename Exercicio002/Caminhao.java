package Exercicio002;

public class Caminhao extends Veiculo {
    // Definir constantes:
    private static final double VALOR_BASE = 50000;
    private static final double IPVA = 0.015;

    public Caminhao(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    @Override
    public double calcularIPVA() {
        double valorEstimado = calcularValorEstimado();
        return valorEstimado * IPVA;
    }

    public double calcularValorEstimado() {
        int idadeCaminhao = 2024 - getAnoFabricacao();
        double valorEstimado = VALOR_BASE - (5000 * idadeCaminhao);

        return Math.max(valorEstimado, 0);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("DETALHES DO CAMINHAO:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAnoFabricacao());
        System.out.printf("Valor Estimado: R$ %.2f%n", calcularValorEstimado());
        System.out.printf("IPVA: R$ %.2f%n", calcularIPVA());
    } 
}
