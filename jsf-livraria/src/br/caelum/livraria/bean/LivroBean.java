package br.caelum.livraria.bean;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();

	public void gravar() {
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		return "LivroBean [titulo=" + livro.titulo + ", isbn=" + livro.isbn
				+ ", preco=" + livro.preco + ", dataLancamento="
				+ livro.dataLancamento + "]";
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

}
