package entities;

import lombok.Setter;
import java.time.LocalDate;

@Setter
public class Mentoria extends Conteudo {
	private LocalDate data;

	@Override
	public double calcularXp() {
		return XP_PADRAO + 20d;
	}

	@Override
	public String toString() {
		return "Mentoria{" +
				"titulo='" + titulo + '\'' +
				", descricao='" + descricao + '\'' +
				", data=" + data +
				'}';
	}
}