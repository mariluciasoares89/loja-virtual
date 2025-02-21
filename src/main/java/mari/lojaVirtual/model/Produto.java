package mari.lojaVirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto" , sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable{

	
	 
	private static final long serialVersionUID = 1L;

	

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
	private Long id;
	
	private String tipoUnidade;
	
	private String nome;
	
	private Boolean ativo = Boolean.TRUE;
	
	
	@Column(columnDefinition = "text", length = 2000)
	private String descricao;
	
	
	/**Nota item nota produto - ASSOCIAR **/
	
	private Double peso; /**  1000.55 G **/
	
	private Double largura;
	

	private Double altura;
	
	private Double profundidade;
	
	private BigDecimal valorVenda = BigDecimal.ZERO;
	
	private Integer QtEstoque;
	
	private Integer QtdeAlertaEstoque = 0;
	
	private String Youtube;
	
	private Boolean alertaQtEstoque = Boolean.FALSE;
	
	private Integer QtdeClique = 0;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTipoUnidade() {
		return tipoUnidade;
	}

	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	
	
	public Boolean getAtivo() {
		return ativo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Double getLargura() {
		return largura;
	}

	public void setLargura(Double largura) {
		this.largura = largura;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getProfundidade() {
		return profundidade;
	}

	public void setProfundidade(Double profundidade) {
		this.profundidade = profundidade;
	}

	public BigDecimal getValorVenda() {
		return valorVenda;
	}

	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}

	public Integer getQtEstoque() {
		return QtEstoque;
	}

	public void setQtEstoque(Integer qtEstoque) {
		QtEstoque = qtEstoque;
	}

	public Integer getQtdeAlertaEstoque() {
		return QtdeAlertaEstoque;
	}

	public void setQtdeAlertaEstoque(Integer qtdeAlertaEstoque) {
		QtdeAlertaEstoque = qtdeAlertaEstoque;
	}

	public String getYoutube() {
		return Youtube;
	}

	public void setYoutube(String youtube) {
		Youtube = youtube;
	}

	public Boolean getAlertaQtEstoque() {
		return alertaQtEstoque;
	}

	public void setAlertaQtEstoque(Boolean alertaQtEstoque) {
		this.alertaQtEstoque = alertaQtEstoque;
	}

	public Integer getQtdeClique() {
		return QtdeClique;
	}

	public void setQtdeClique(Integer qtdeClique) {
		QtdeClique = qtdeClique;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
