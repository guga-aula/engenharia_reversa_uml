package domain.enums;

public enum EstadoPagamento {
	PENDENTE(1, "Aguardando Pagamento"), QUITADO(2, "Pagamento Efetuado"), CANCELADO(3, "Pagamento Cancelado");

	private int cod;
	private String descricao;

	private EstadoPagamento(int codigo, String descricao) {
		this.cod = codigo;
		this.descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public static EstadoPagamento toEnum(Integer codigo) {
		if (codigo == null) {
			return null;
		}

		for (EstadoPagamento x : EstadoPagamento.values()) {
			if (x.getCod() == codigo)
				return x;
		}

		throw new IllegalArgumentException("ID inválido para estado de pagamento!");
	}

}
