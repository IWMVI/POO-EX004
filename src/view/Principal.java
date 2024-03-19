package view;

import model.Produto;

public class Principal {
	public static void main(String[] args) {
		Produto produto = new Produto();
		produto.setNome("Notebook");
		produto.setPreco(12000);
		produto.setQtdEstoque(5);

		String nome = produto.getNome();
		float preco = produto.getPreco();
		int estoque = produto.getQtdEstoque();

		System.out.println("Produto: " + Character.toUpperCase(nome.charAt(0)) + nome.substring(1));
		System.out.println("Preço R$ " + preco);
		System.out.println("Quantidade em estoque: " + estoque);
		System.out.println("Valor em estoque R$ " + produto.totalValorEstoque());
		System.out.println("Produto está disponível: " + produto.verificarProdutoDisponivel("NOTEBOOK".toLowerCase()));

		System.out.println();
		
		Produto produto2 = new Produto();
		produto.setNome("Grão de arroz");
		produto.setPreco(-12);
		produto.setQtdEstoque(-1);

		nome = produto.getNome();
		preco = produto.getPreco();
		estoque = produto.getQtdEstoque();

		System.out.println("Produto: " + Character.toUpperCase(nome.charAt(0)) + nome.substring(1));
		System.out.println("Preço R$ " + preco);
		System.out.println("Quantidade em estoque: " + estoque);
		System.out.println("Valor em estoque R$ " + produto.totalValorEstoque());
		System.out.println("Produto está disponível: " + produto.verificarProdutoDisponivel("Grão de arroz".toLowerCase()));
	}
}
