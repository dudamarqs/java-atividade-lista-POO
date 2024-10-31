package Exercicio003;

import java.util.Scanner;

public class Hotel {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("\nAdicione suas informações abaixo:");
        System.out.println("Informe a quantidade de dias: ");
        int dias = sc.nextInt();

        Acomodacao simples = new QuartoSimples();
        Acomodacao duplo = new QuartoDuplo();
        Acomodacao suite = new Suite();

        System.out.println("\n--- Detalhes das acomodações: ---");
        simples.exibirDetalhes(dias);
        System.out.println("------------------------");
        duplo.exibirDetalhes(dias);
        System.out.println("------------------------");
        suite.exibirDetalhes(dias);
        System.out.println("------------------------");

        sc.close();
     }
}
