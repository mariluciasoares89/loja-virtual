package mari.lojaVirtual.model;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.ConstraintMode;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "vd_cp_loja_virtual")
@SequenceGenerator(name = "seq_vd_cp_loja_virtual" , sequenceName = "seq_vd_cp_loja_virtual", allocationSize = 1, initialValue = 1)
public class vendaCompraLojaVirtual implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_vd_cp_loja_virtual")
	private Long id;
	
	
	@ManyToOne(targetEntity = Pessoa.class)
	@JoinColumn(name = "pessoa_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "pessoa_FK"))
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(name = "endereco_entrega_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_entrega_FK"))
	private Endereco enderecoEntrega;
	
	
	@ManyToOne
	@JoinColumn(name = "endereco_cobranca_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "endereco_cobranca_FK"))
	private Endereco enderecoCobranca;
	
	private BigDecimal valorTotal;
	
	private BigDecimal valorDesconto;
	
	
	@ManyToOne
	@JoinColumn(name = "forma_pagamento_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "forma_pagamento_FK"))
	private FormaPagamento formaPagamento;
	
	@OneToOne
	@JoinColumn(name = "nota_fiscal_venda_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "nota_fiscal_venda_FK"))
	private NotaFiscalVenda notaFiscalVenda;
	
	
	@ManyToOne
	@JoinColumn(name = "cupom_desconto_id", nullable = false, foreignKey = @ForeignKey(value = ConstraintMode.CONSTRAINT, name = "cupom_desconto_FK"))
	private CupDesc cupDesc;
	
}
