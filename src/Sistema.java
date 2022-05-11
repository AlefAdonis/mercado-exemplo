import exemplo.Lote;
import exemplo.LoteRepositorio;
import exemplo.Produto;
import exemplo.ProdutoRepositorio;

public class Sistema {

	public static void main(String[] args) {
		
		Produto produto = new Produto("Leite", "Parmalat");
		Produto produto1 = new Produto("Pão Frances", "Padaria do Seu Inácio");
		Produto produto2 = new Produto("Presunto", "Sadia");

		//--------------------------------------------
		Lote lote = new Lote(produto, 10L);
		Lote lote1 = new Lote(produto1, 96L);
		Lote lote2 = new Lote(produto2, 77L);

		//-------------- Adicionando um catálogo de produtos --
		ProdutoRepositorio catalogo = new ProdutoRepositorio();
		String idLeite = catalogo.addProduto(produto);
		String idPao = catalogo.addProduto(produto1);
		String idPresunto = catalogo.addProduto(produto2);

		////-------------- Adicionando um armazem com Lote --
		LoteRepositorio armazem = new LoteRepositorio();
		String idLote = armazem.addLote(lote);
		String idLote1 = armazem.addLote(lote1);
		String idLote2 = armazem.addLote(lote2);
		
		System.out.println(produto);
		System.out.println(lote);
		System.out.println(catalogo.listaCatalogo());
		System.out.println(armazem.listaLotes());



	}
}
