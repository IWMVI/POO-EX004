package model;

public class Produto {

	private String nome;
	private float preco;
	private int qtdEstoque;

	public Produto() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		if (preco < 0)
			this.preco = 0.01f;
		else
			this.preco = preco;
	}

	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < 0)
			this.qtdEstoque = 0;
		else
			this.qtdEstoque = qtdEstoque;
	}

	public boolean verificarProdutoDisponivel(String nome) {
		if ((getNome().equalsIgnoreCase(nome)) && getQtdEstoque() > 0)
			return true;
		else
			return false;
	}

	public float totalValorEstoque() {
		return getQtdEstoque() * getPreco();
	}
}
