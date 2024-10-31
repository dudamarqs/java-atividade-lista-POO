package Exercicio001;

import java.util.ArrayList;
import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        contas.add(new ContaPoupanca("Maria Eduarda", 379, 1500, 7));
        contas.add(new ContaEspecial("João Pedro", 123, 2000, 200));

        boolean continuarPrograma = true;
        while (continuarPrograma) {
            System.out.println("\nCONTAS DISPONNÍVEIS:");
            for (ContaBancaria conta : contas) {
                System.out.println("Número da Conta: " + conta.getNumConta() + " - Nome: " + conta.getCliente());
            }
            
            System.out.print("\nDigite o número da conta que deseja acessar (ou 0 para sair): ");
            int numeroConta = sc.nextInt();
            
            if (numeroConta == 0) {
                continuarPrograma = false;
                continue;
            }

            ContaBancaria contaSelecionada = null;
            for (ContaBancaria conta : contas) {
                if (conta.getNumConta() == numeroConta) {
                    contaSelecionada = conta;
                    break;
                }
            }

            if (contaSelecionada != null) {
                boolean continuarConta = true;

                System.out.println("\nDADOS DA CONTA SELECIONADA:");
                System.out.println(contaSelecionada);
                
                while (continuarConta) {                    
                    System.out.println("\nEscolha uma opção:");
                    System.out.println("1 - Sacar");
                    System.out.println("2 - Depositar");
                    if (contaSelecionada instanceof ContaPoupanca) {
                        System.out.println("3 - Calcular novo saldo com rendimento");
                    }
                    System.out.println("0 - Voltar ao menu de contas");

                    System.out.print("\nOpção: ");
                    int opcao = sc.nextInt();

                    switch (opcao) {
                        case 1:
                            System.out.print("\nDigite o valor para sacar: R$ ");
                            double valorSaque = sc.nextDouble();
                            contaSelecionada.sacar(valorSaque);
                            break;

                        case 2:
                            System.out.print("\nDigite o valor para depositar: R$ ");
                            double valorDeposito = sc.nextDouble();
                            contaSelecionada.depositar(valorDeposito);
                            break;

                        case 3:
                            if (contaSelecionada instanceof ContaPoupanca) {
                                System.out.print("\nDigite a taxa de rendimento (%): ");
                                double taxa = sc.nextDouble();
                                ((ContaPoupanca) contaSelecionada).novoSaldo(taxa);
                            } else {
                                System.out.println("Opção inválida para este tipo de conta.");
                            }
                            break;

                        case 0:
                            continuarConta = false;
                            break;

                        default:
                            System.out.println("Opção inválida. Tente novamente.");
                            break;
                    }

                    sc.nextLine();

                    System.out.println("\nDADOS DA CONTA ATUALIZADOS:");
                    System.out.println(contaSelecionada);
                }
            } else {
                System.out.println("Conta não encontrada. Verifique o número e tente novamente.");
            }
        }

        sc.close();
    }
}
