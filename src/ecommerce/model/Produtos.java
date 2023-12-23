package ecommerce.model;

public class Produtos {
	
	private String nome;
	private String descricao;
	private double preco;
	private String categoria;
	
	//método construtor
	public Produtos(String nome, String descricao, double preco, String categoria) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria = categoria;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	
	public void mostrarDetalhes() {
		System.out.println("\nNome: "+nome);
		System.out.println("\nDescrição: "+descricao);
		System.out.printf("\nPreço: R$ %.3f \n",getPreco());
		System.out.println("\nCategoria: "+categoria);
	}
}