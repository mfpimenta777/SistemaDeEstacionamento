package sistemaDeEstacionamento;

import java.time.LocalDateTime;

public class Veiculo {
    private String placa;
    private String modelo;
    private String tamanho;
    LocalDateTime horaEntrada;
    LocalDateTime horaSaida;

    public Veiculo(String placa, String modelo, String tamanho) {
        this.placa = placa;
        this.setModelo(modelo);
        this.tamanho = tamanho;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void registrarEntrada(LocalDateTime horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public void registrarSaida(LocalDateTime horaSaida) {
        this.horaSaida = horaSaida;
    }

    public long calcularTempoPermanencia() {
        return java.time.Duration.between(horaEntrada, horaSaida).toHours();
    }

    public double calcularValor(double tempo) {
        if (tempo <= 1) return 5.0;
        if (tempo <= 3) return 10.0;
        return 15.0;
    }

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
}
