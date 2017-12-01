package model.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import model.Telefone;
import model.Usuario;

public class TelefoneDAO extends JpaDAO<Telefone>{
	
	public List<Telefone> list(String numero){
	String jpql = "from Telefone p";
		
		if (numero != null || numero != "")
			jpql = jpql + "  where p.numero like :numero";
		
		jpql = jpql + "  order by p.numero";
		
		TypedQuery<Telefone> comando = this.getEntityManager().createQuery(jpql, Telefone.class);
		
		if (numero != null)
			comando.setParameter("numero", "%" + numero + "%");
		
		return comando.getResultList();
	}
	public List<Telefone> lerPorUsuario(Usuario usuario){
	String jpql = "from Telefone p";
		
		if (usuario != null)
			jpql = jpql + "  where p.usuario like :usuario";
		
		jpql = jpql + "  order by p.usuario";
		
		TypedQuery<Telefone> comando = this.getEntityManager().createQuery(jpql, Telefone.class);
		
		if (usuario != null)
			comando.setParameter("numero", "%" + usuario + "%");
		
		return comando.getResultList();
	}

}
