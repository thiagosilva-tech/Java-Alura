package br.com.thiago.loja.testes;

import javax.persistence.EntityManager;

import br.com.thiago.loja.modelo.Categoria;
import br.com.thiago.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {

		Categoria celulares = new Categoria("CELULARES");

		EntityManager em = JPAUtil.getEntityManager();

		em.getTransaction().begin();

		em.persist(celulares);
		celulares.setNome("XPTO");

		em.flush();
		em.clear();
		
		celulares = em.merge(celulares);
		celulares.setNome("1234");
		em.flush();
		em.remove(celulares);
		em.flush();
		
	}
}
