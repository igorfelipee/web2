package controle.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;
import javax.faces.component.html.HtmlInputText;

import model.Telefone;
import model.Usuario;
import model.dao.TelefoneDAO;
import model.dao.UsuarioDAO;

@ManagedBean(name = "usuarioMB")
@RequestScoped
public class UsuarioMB implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private HtmlInputText campoDescricao;

	@ManagedProperty("#{param.codParam}")
	private String codParam;
	
	private Usuario usuario = new Usuario();
	private UsuarioDAO usuariodao = new UsuarioDAO();
	
	private Telefone telefone = new Telefone();
	private TelefoneDAO telefonedao = new TelefoneDAO();
	
	private List<Telefone> telefones = null;
	
	public List<Telefone> getTelefones(){
		if(this.telefones == null){
			this.telefones = telefonedao.lerPorUsuario(this.usuario);
		}
		return telefones;
	}
	
	
}
