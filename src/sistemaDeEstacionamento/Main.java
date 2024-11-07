package sistemaDeEstacionamento;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Estacionamento estacionamento = new Estacionamento();

        estacionamento.adicionarVaga(new Vaga(1, "pequeno"));
        estacionamento.adicionarVaga(new Vaga(2, "médio"));
        estacionamento.adicionarVaga(new Vaga(3, "grande"));

        while (true) {
            System.out.println("\n1. Registrar Entrada");
            System.out.println("2. Registrar Saída");
            System.out.println("3. Relatório de Vagas Ocupadas");
            System.out.println("4. Histórico de Veículos");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 0) break;

            switch (opcao) {
                case 1:
                    System.out.print("Placa do veículo: ");
                    String placa = scanner.nextLine();
                    System.out.print("Modelo do veículo: ");
                    String modelo = scanner.nextLine();
                    System.out.print("Tamanho do veículo (pequeno, médio, grande): ");
                    String tamanho = scanner.nextLine();
                    Veiculo veiculo = new Veiculo(placa, modelo, tamanho);
                    if (estacionamento.registrarEntrada(veiculo)) {
                        System.out.println("Entrada registrada com sucesso!");
                    } else {
                        System.out.println("Não há vagas disponíveis para o veículo.");
                    }
                    break;

                case 2:
                    System.out.print("Placa do veículo para saída: ");
                    String placaSaida = scanner.nextLine();
                    if (estacionamento.registrarSaida(placaSaida)) {
                        System.out.println("Saída registrada com sucesso!");
                    } else {
                        System.out.println("Veículo não encontrado.");
                    }
                    break;

                case 3:
                    estacionamento.exibirRelatorioVagasOcupadas();
                    break;

                case 4:
                    estacionamento.exibirHistoricoVeiculos();
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }

        scanner.close();
    }
}
