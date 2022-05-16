package exemplo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// São esses repositorios que se comunicam com o banco de dados
public class LoteRepositorio {

    private Map<String, Lote> armazem =  new HashMap<>();

    public String addLote(Lote l){
        if (l == null){
            return "";
        }
        String id = l.getId();
        this.armazem.put(id, l);
        return id;
    }

    public void removeLote(String id){
        if(id.equals("")) {
            return;
        }
        this.armazem.remove(id);
    }

    public void atualizaLote(Lote l){
        this.addLote(l);
    }

    public Lote getLote(String id){
        return this.armazem.get(id);
    }

    public List<Lote> getAll(){
        return List.copyOf(this.armazem.values());
    }
    public String listaLotes(){
        String lista = "Lotes:\n";

        for(Lote l : this.armazem.values()){
            lista += l.toString() + "\n";
        }

        return lista;
    }
    @Override
    public String toString() {
        return  armazem.toString();
    }
}