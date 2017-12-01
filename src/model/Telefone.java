package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tab_telefones")
public class Telefone {

	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_TELEFONE")
	@SequenceGenerator(name = "ID_TELEFONE", sequenceName = "SEQ_TELEFONE", allocationSize = 1)
	private Integer codigo;
	
	@Column(name="ddd")
	private String ddd;
	
	@Column(name="numero")
	private String numero;
	
	@OneToOne(mappedBy = "usuario", fetch = FetchType.LAZY)
	private Usuario usuario;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDdd() {
		return ddd;
	}

	public void setDdd(String ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	
}
