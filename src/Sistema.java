import exemplo.*;

public class Sistema {

	public static void main(String[] args) {

		ProdutoService ps = new ProdutoService();
		
		Produto produto = new Produto("Leite", "Parmalat");
		Produto produto1 = new Produto("Pão Frances", "Padaria do Seu Inácio");
		Produto produto2 = new Produto("Presunto", "Sadia");
		Produto produto3 = new Produto("Presunto Novo", "Perdigao");

		//--------------------------------------------
		Lote lote = new Lote(produto, 10L);
		Lote lote1 = new Lote(produto1, 96L);
		Lote lote2 = new Lote(produto2, 77L);

		//-------------- Adicionando um catálogo de produtos --
		String idLeite = ps.addProdToRepository(produto);
		String idPao = ps.addProdToRepository(produto1);
		String idPresunto = ps.addProdToRepository(produto2);
		String idPrsuntoOutro = ps.addProdToRepository(produto3);

		////-------------- Adicionando um armazem com Lote --
		String idLote = ps.addLoteToRepository(lote);
		String idLote1 = ps.addLoteToRepository(lote1);
		String idLote2 = ps.addLoteToRepository(lote2);
		
		System.out.println(produto);
		System.out.println(lote);
		System.out.println(ps.showProducts());
		System.out.println(ps.showLotes());

	}
}
