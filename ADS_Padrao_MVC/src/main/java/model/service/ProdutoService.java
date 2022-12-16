package model.service;
import model.entidade.Produto;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProdutoService {

    private List<Produto> listaProdutos = new ArrayList<>();

    @PostConstruct
    private void setup(){
        Produto p1 = new Produto(1L, "Furadeira", 300.00);
        Produto p2 = new Produto(2L, "Lixeira", 200.00);
        Produto p3 = new Produto(3L, "Serra circular", 500.00);

        listaProdutos.add(p1);
        listaProdutos.add(p2);
        listaProdutos.add(p3);
    }

    public List<Produto> findAll() {
        return listaProdutos;
    }
}
