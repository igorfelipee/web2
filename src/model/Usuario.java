package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="tab_usuarios")
public class Usuario {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="ID_USUARIO")
	@SequenceGenerator(name="ID_USUARIO", sequenceName="SEQ_USUARIO", allocationSize=1)
	private Integer codigo;
	
	@Column(name="nome_usuario")
	private String nome;
	
	@Column(name="cpf_cnpj", length = 14, unique=true, nullable = false)
	private String cpfCnpj;
	
	@Column(name="id_endereco_fk")
	private String endereco;
	
	@ManyToOne
	@JoinColumn(name="id_telefone_fk")
	private Telefone telefone;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpfCnpj() {
		return cpfCnpj;
	}

	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}
	
}
