package br.com.thiago.loja.testes;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.EntityManager;

import br.com.thiago.loja.dao.CategoriaDao;
import br.com.thiago.loja.dao.ClienteDao;
import br.com.thiago.loja.dao.PedidoDao;
import br.com.thiago.loja.dao.ProdutoDao;
import br.com.thiago.loja.modelo.Categoria;
import br.com.thiago.loja.modelo.Cliente;
import br.com.thiago.loja.modelo.ItemPedido;
import br.com.thiago.loja.modelo.Pedido;
import br.com.thiago.loja.modelo.Produto;
import br.com.thiago.loja.util.JPAUtil;

public class TesteCriteria {

	public static void main(String[] args) {
		popularBancoDeDados();
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		produtoDao.buscarPorParamentrosComCriteria("PS5", null, null);
		produtoDao.buscarPorParamentrosComCriteria(null, null, LocalDate.now());
		produtoDao.buscarPorParamentrosComCriteria("PS5", null, LocalDate.now());
		
		
	}

	private static void popularBancoDeDados() {
		Categoria celulares = new Categoria("CELULARES");
		Categoria videogames = new Categoria("VIDEOGAMES");
		Categoria informatica = new Categoria("INFORMATICA");

		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), celulares);
		Produto videogame = new Produto("PS5", "Playstation 5", new BigDecimal("2000"), videogames);
		Produto macbook = new Produto("Macbook", "Macbook Pro retina", new BigDecimal("5000"), informatica);

		Cliente cliente = new Cliente("Rodrigo", "123456");

		Pedido pedido = new Pedido(cliente);
		pedido.adicionarItem(new ItemPedido(10, pedido, celular));
		pedido.adicionarItem(new ItemPedido(40, pedido, videogame));

		Pedido pedido2 = new Pedido(cliente);
		pedido2.adicionarItem(new ItemPedido(2, pedido, macbook));
		
		EntityManager em = JPAUtil.getEntityManager();
		ProdutoDao produtoDao = new ProdutoDao(em);
		CategoriaDao categoriaDao = new CategoriaDao(em);
		ClienteDao clienteDao = new ClienteDao(em);
		PedidoDao pedidoDao = new PedidoDao(em);

		em.getTransaction().begin();

		categoriaDao.cadastrar(celulares);
		categoriaDao.cadastrar(videogames);
		categoriaDao.cadastrar(informatica);
		
		produtoDao.cadastrar(celular);
		produtoDao.cadastrar(videogame);
		produtoDao.cadastrar(macbook);
		
		clienteDao.cadastrar(cliente);
		
		pedidoDao.cadastrar(pedido);
		pedidoDao.cadastrar(pedido2);

		em.getTransaction().commit();
		em.close();
	}
}
