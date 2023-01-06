package br.com.thiago.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.thiago.loja.dao.CategoriaDao;
import br.com.thiago.loja.dao.ProdutoDao;
import br.com.thiago.loja.modelo.Categoria;
import br.com.thiago.loja.modelo.Produto;
import br.com.thiago.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {

		Categoria celulares = new Categoria("CELULARES");
		
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), 
				celulares );	

		EntityManager em = JPAUtil.getEntityManager();			
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		
		em.getTransaction().begin();
		categoriaDao.cadastrar(celulares);
		produtoDao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
		

	}
}
