package mari.lojaVirtual.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import mari.lojaVirtual.enums.TipoEnderco;




	@Entity
	@Table(name = "endereco")
	@SequenceGenerator(name = "seq_endereco" , sequenceName = "seq_endereco", allocationSize = 1, initialValue = 1)
	
	public class Endereco implements Serializable{
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco")
		private Long id;
		
		
		@Column(nullable = false)
		private String ruaLogra;
		
		@Column(nullable = false)
		private String cep;
		
		
		@Column(nullable = false)
		private String numero;
		
		
		private String complemento;
		

		@Column(nullable = false)
		private String bairro; 
		
		
		

		@Column(nullable = false)
        private String uf;
		
		@Column(nullable = false)
		private String cidade;
		
		
		public String getBairro() {
			return bairro;
		}
		public void setBairro(String bairro) {
			this.bairro = bairro;
		}


		
		
		@ManyToOne(targetEntity = Pessoa.class)
		@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_FK"))
		
		private Pessoa pessoa;
		
		
		@Column(nullable = false)
		@Enumerated(EnumType.STRING)
		private TipoEnderco tipoEnderco;
		
		
		public TipoEnderco getTipoEnderco() {
			return tipoEnderco;
		}
		public void setTipoEnderco(TipoEnderco tipoEnderco) {
			this.tipoEnderco = tipoEnderco;
		}
		
		


		public Long getId() {
			return id;
		}


		public void setId(Long id) {
			this.id = id;
		}


		public String getRuaLogra() {
			return ruaLogra;
		}


		public void setRuaLogra(String ruaLogra) {
			this.ruaLogra = ruaLogra;
		}


		public String getCep() {
			return cep;
		}


		public void setCep(String cep) {
			this.cep = cep;
		}


		public String getNumero() {
			return numero;
		}


		public void setNumero(String numero) {
			this.numero = numero;
		}


		public String getComplemento() {
			return complemento;
		}


		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}


		public String getUf() {
			return uf;
		}


		public void setUf(String uf) {
			this.uf = uf;
		}


		public String getCidade() {
			return cidade;
		}


		public void setCidade(String cidade) {
			this.cidade = cidade;
		}


		public Pessoa getPessoa() {
			return pessoa;
		}


		public void setPessoa(Pessoa pessoa) {
			this.pessoa = pessoa;
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
			Endereco other = (Endereco) obj;
			return Objects.equals(id, other.id);
		}
		
		
	
		

	
}
