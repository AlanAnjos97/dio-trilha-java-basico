import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Boneco", 1.10, 10);
        carrinho.adicionarItem("Boneca", 2.20, 10);
        carrinho.adicionarItem("Urso de Pelúcia", 100, 150);
        carrinho.removerItem("Boneco");

        System.out.println("Valor total do carrinho: R$ " + carrinho.calcularValorTotal());
        
        System.out.println("Total de Itens: " + carrinho.obterNumeroTotalItem());
        carrinho.exibirItens();
    }


    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        this.carrinhoDeCompras = new ArrayList<>();
    }

    public int obterNumeroTotalItem() {
        return carrinhoDeCompras.size();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itenParaRemover = new ArrayList<>();

        for(Item i : carrinhoDeCompras) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itenParaRemover.add(i);
            }
        }

        carrinhoDeCompras.removeAll(itenParaRemover);
    }

    public double calcularValorTotal() {
        double precoTotal = 0.0;

        for (Item i : carrinhoDeCompras) {
            precoTotal += i.getPreco() * i.getQuantidade(); // Soma o preço multiplicado pela quantidade
        }

        return precoTotal;
    }

    public void exibirItens() {
        System.out.println(carrinhoDeCompras.toString());
    }


}
