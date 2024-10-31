package Exercicio002;

import java.util.ArrayList;
import java.util.List;

public class Automoveis {
    public static void main(String[] args) {
        List<Veiculo> v = new ArrayList<>();
        
        v.add(new Carro("ABC-1234", "Caminhonete", "Volkswagen", 2020));
        v.add(new Caminhao("XYZ-0123", "Mercedes", "Actros", 2006));
        v.add(new Onibus("LMN-2222", "Mercedes", "0500", 2012));

        for (Veiculo veiculo : v) {
            veiculo.exibirDetalhes();
            System.out.println("-----------------------------------");
        }

    }
    
}
