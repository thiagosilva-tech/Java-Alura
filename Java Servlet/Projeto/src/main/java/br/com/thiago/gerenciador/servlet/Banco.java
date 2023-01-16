package br.com.thiago.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {

	private static List<Empresa> listaEmpresas = new ArrayList<>();
	private static Integer chaveSequencial = 1;

	static {
		Empresa empresa = new Empresa();
		empresa.setId(chaveSequencial++);
		empresa.setNome("Alura");
		Empresa empresa2 = new Empresa();
		empresa2.setId(chaveSequencial++);
		empresa2.setNome("Caelum");
		listaEmpresas.add(empresa);
		listaEmpresas.add(empresa2);

	}

	public void adiciona(Empresa empresa) {
		empresa.setId(Banco.chaveSequencial++);
		listaEmpresas.add(empresa);

	}

	public List<Empresa> getEmpresas() {
		return Banco.listaEmpresas;
	}

	public void removeEmpresa(Integer id) {

		Iterator<Empresa> it = listaEmpresas.iterator();

		while (it.hasNext()) {
			Empresa emp = it.next();
			if (emp.getId() == id) {
				it.remove();
			}
		}
	}
}
