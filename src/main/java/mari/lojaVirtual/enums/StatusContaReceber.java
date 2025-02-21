package mari.lojaVirtual.enums;

public enum StatusContaReceber {

	COBRANCA("Pagar"),
	VENCIDA("Venciada"),
	ABERTA("Aberta"),
	QUITADA("Quitada");
	
	
	private String descricao;
	
	private StatusContaReceber(String descricao) {
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
