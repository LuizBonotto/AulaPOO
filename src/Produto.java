public class Produto {
    String nome;
    String descricao;
    private Double preco;
    Integer quantidadeEmEstoque;

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    Produto(String nome, String descricao, Double preco) {

        this(nome, descricao, preco, 0);
    }

    Produto(String nome, String descricao, Double preco, Integer quantidadeEmEstoque) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    @Override
    public String toString() {
        return "\nProduto{" +
                "nome='" + nome + '\'' +
                ", descrição=" + descricao +
                ", preço=" + preco +
                ", quantidadeEmEstoque=" + quantidadeEmEstoque +
                '}';
    }
}
