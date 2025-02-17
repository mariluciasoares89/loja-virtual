package mari.lojaVirtual.enums;

public enum TipoEnderco {

	COBRANCA("Cobrança"),
	ENTREGA("Entrega");
	
	private String descricao;
	
	private TipoEnderco(String descricao) {
		this.descricao = descricao;
	}
 
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		
		return this.getDescricao();
	}
}
