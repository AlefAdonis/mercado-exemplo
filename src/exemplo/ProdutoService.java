package exemplo;
import java.util.ArrayList;
import java.util.List;

public class ProdutoService {

    private ProdutoRepositorio prodRep;
    private LoteRepositorio loteRep;

    public ProdutoService(){
        this.prodRep = new ProdutoRepositorio();
        this.loteRep = new LoteRepositorio();
    }

    public List<Produto> listProductsLote(String name){
        List<Lote> allLotes = this.loteRep.getAll();
        List<Produto> prods = getProdsFromLotes(allLotes);
        return getProductsByName(name, prods);
    }

    private List<Produto> getProdsFromLotes(List<Lote> lotes) {
        List<Produto> produtos = new ArrayList<Produto>();
        for(Lote l: lotes){
            produtos.add(l.getProduto());
        }
        return produtos;
    }

    private List<Produto> getProductsByName(String nomeProduto, List<Produto> prods){
        List<Produto> produtos = new ArrayList<Produto>();
        for(Produto p: prods){
            if(p.getNome().contains(nomeProduto)){
                produtos.add(p);
            }
        }

        return produtos;
    }

    public String addProdToRepository(Produto p){
        return this.prodRep.addProduto(p);
    }

    public String addLoteToRepository(Lote l){
        return this.loteRep.addLote(l);
    }

    public void removeProdFromRepository(String id){
        this.prodRep.removeProduto(id);
    }

    public void removeLoteFromRepository(String id){
        this.loteRep.removeLote(id);
    }

    public void updateProdInRepository(Produto p){
        this.prodRep.atualizaProduto(p);
    }

    public void updateLoteInRepository(Lote l){
        this.loteRep.atualizaLote(l);
    }
    public String showProducts(){
        return this.prodRep.listaCatalogo();
    }

    public String showLotes(){
        return this.loteRep.listaLotes();
    }
}
