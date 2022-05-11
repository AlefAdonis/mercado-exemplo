package exemplo;
import java.util.HashMap;
import java.util.Map;

public class ProdutoRepositorio {

    private Map<String, Produto> catalago =  new HashMap<>();

    public String addProduto(Produto p){
        if (p == null){
            return "";
        }
        String id = p.getId();
        this.catalago.put(id, p);
        return id;
    }

    public void removeProduto(String id){
        if(id.equals("")) {
            return;
        }
        this.catalago.remove(id);
    }

    public void atualizaProduto(Produto p){
        this.addProduto(p);
    }

    public Produto getProduto(String id){
        return this.catalago.get(id);
    }

    public String listaCatalogo(){
        String lista = "Catalogo de Produtos:\n";

        for(Produto p : this.catalago.values()){
            lista += p.toString() + "\n";
        }

        return lista;
    }
    @Override
    public String toString() {
        return  catalago.toString();
    }
}
