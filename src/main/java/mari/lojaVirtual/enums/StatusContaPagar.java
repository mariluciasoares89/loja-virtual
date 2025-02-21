package mari.lojaVirtual.enums;

public enum StatusContaPagar {

	COBRANCA("Pagar"),
	VENCIDA("Venciada"),
	ABERTA("Aberta"),
	QUITADA("Quitada"),
	FUNCIONARIO("Funcionário"),
	ALUGUEL("Aluguel"),
	NEGOCIADA("Renegociada");
	
	
	private String descricao;
	
	private StatusContaPagar(String descricao) {
		this.descricao = descricao;
	}
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		
		return this.descricao;
	}
}
