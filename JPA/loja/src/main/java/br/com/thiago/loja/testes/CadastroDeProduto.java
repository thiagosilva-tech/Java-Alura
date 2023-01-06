package br.com.thiago.loja.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.thiago.loja.dao.ProdutoDao;
import br.com.thiago.loja.modelo.Produto;
import br.com.thiago.loja.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {

		Produto celular = new Produto();
		celular.setNome("Xiaomi Redmi");
		celular.setDescricao("Muito legal");
		celular.setPreco(new BigDecimal("800"));

		EntityManager em = JPAUtil.getEntityManager();			
		ProdutoDao dao = new ProdutoDao(em);
		
		em.getTransaction().begin();
		dao.cadastrar(celular);
		em.getTransaction().commit();
		em.close();
		

	}
}
