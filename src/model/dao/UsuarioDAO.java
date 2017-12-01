package model.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import model.Usuario;

public class UsuarioDAO extends JpaDAO<Usuario>{
	
	public List<Usuario> list(String nome){
	String jpql = "from Usuario p";
		
		if (nome != null || nome != "")
			jpql = jpql + "  where p.nome like :nome";
		
		jpql = jpql + "  order by p.nome";
		
		TypedQuery<Usuario> comando = this.getEntityManager().createQuery(jpql, Usuario.class);
		
		if (nome != null)
			comando.setParameter("nome", "%" + nome + "%");
		
		return comando.getResultList();
	}

}
