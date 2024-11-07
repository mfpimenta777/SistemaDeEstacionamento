package sistemaDeEstacionamento;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Estacionamento {
    private List<Vaga> vagas;
    private List<Veiculo> veículos;

    public Estacionamento() {
        vagas = new ArrayList<>();
        veículos = new ArrayList<>();
    }

    public void adicionarVaga(Vaga vaga) {
        vagas.add(vaga);
    }

    public boolean registrarEntrada(Veiculo veiculo) {
        for (Vaga vaga : vagas) {
            if (vaga.isDisponivel() && vaga.getTamanho().equals(veiculo.getTamanho())) {
                vaga.ocupar();
                veiculo.registrarEntrada(LocalDateTime.now());
                veículos.add(veiculo);
                return true;
            }
        }
        return false;
    }

    public boolean registrarSaida(String placa) {
        for (Veiculo veiculo : veículos) {
            if (veiculo.getPlaca().equals(placa)) {
                veiculo.registrarSaida(LocalDateTime.now());
                double tempo = veiculo.calcularTempoPermanencia();
                double valor = veiculo.calcularValor(tempo);
                System.out.println("Veículo " + veiculo.getPlaca() + " permaneceu por " + tempo + " horas e deve pagar R$ " + valor);
                liberarVaga(veiculo);
                return true;
            }
        }
        return false;
    }

    private void liberarVaga(Veiculo veiculo) {
        for (Vaga vaga : vagas) {
            if (!vaga.isDisponivel() && vaga.getTamanho().equals(veiculo.getTamanho())) {
                vaga.liberar();
                break;
            }
        }
    }

    public void exibirRelatorioVagasOcupadas() {
        System.out.println("Vagas Ocupadas:");
        for (Vaga vaga : vagas) {
            if (!vaga.isDisponivel()) {
                System.out.println("Vaga " + vaga.getNumero() + " - Tamanho: " + vaga.getTamanho());
            }
        }
    }

    public void exibirHistoricoVeiculos() {
        System.out.println("Histórico de Veículos:");
        for (Veiculo veiculo : veículos) {
            System.out.println("Placa: " + veiculo.getPlaca());
            System.out.println("Entrada: " + veiculo.horaEntrada);
            System.out.println("Saída: " + veiculo.horaSaida);
        }
    }
}
