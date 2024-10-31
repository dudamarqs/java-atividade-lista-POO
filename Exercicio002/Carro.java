package Exercicio002;

public class Carro extends Veiculo {
    // Definir constantes:
    private static final double VALOR_BASE = 20000;
    private static final double IPVA = 4/100;

    public Carro(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }
    
    @Override
    public double calcularIPVA() {
        double valorEstimado = calcularValorEstimado();
        return valorEstimado * IPVA;
    }

    public double calcularValorEstimado() {
        int idadeCarro = 2024 - getAnoFabricacao();
        double valorEstimado = VALOR_BASE - (2000 * idadeCarro);

        return Math.max(valorEstimado, 0); // impede que o valor estimado seja negativo.
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("DETALHES DO CARRO:");
        System.out.println("Placa: " + getPlaca());
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Ano de fabricação: " + getAnoFabricacao());
        System.out.printf("Valor Estimado: R$ %.2f%n", calcularValorEstimado());
        System.out.printf("IPVA: R$ %.2f%n", calcularIPVA());
    } 
}
