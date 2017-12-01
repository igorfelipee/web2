package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tab_os")
public class OrdemDeServico {

	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_OS")
	@SequenceGenerator(name="ID_OS", sequenceName="SEQ_OS", allocationSize=1)
	private Integer codigo;
	
	@Column(length=120)
	private String descricao;
	
	@Column(name="usuario_socilitante")
	private Usuario usuario_socilitante;
	
	@Column(name="funcionario_ator")
	private Usuario funcionario_ator;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Usuario getUsuario_socilitante() {
		return usuario_socilitante;
	}

	public void setUsuario_socilitante(Usuario usuario_socilitante) {
		this.usuario_socilitante = usuario_socilitante;
	}

	public Usuario getFuncionario_ator() {
		return funcionario_ator;
	}

	public void setFuncionario_ator(Usuario funcionario_ator) {
		this.funcionario_ator = funcionario_ator;
	}
	
	
	
}
