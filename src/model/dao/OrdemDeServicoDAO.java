package model.dao;

import java.util.List;

import javax.persistence.TypedQuery;

import model.OrdemDeServico;

public class OrdemDeServicoDAO extends JpaDAO<OrdemDeServico>{
	
	public List<OrdemDeServico> list(String descricao){
	String jpql = "from OrdemDeServico p";
		
		if (descricao != null || descricao != "")
			jpql = jpql + "  where p.descricao like :descricao";
		
		jpql = jpql + "  order by p.descricao";
		
		TypedQuery<OrdemDeServico> comando = this.getEntityManager().createQuery(jpql, OrdemDeServico.class);
		
		if (descricao != null)
			comando.setParameter("descricao", "%" + descricao + "%");
		
		return comando.getResultList();
	}

}

