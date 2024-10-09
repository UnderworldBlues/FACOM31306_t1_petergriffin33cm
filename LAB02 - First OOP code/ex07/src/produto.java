public class produto {
    private String nome;
    private Float preco;
    private Integer estoque;

    public produto (String nome, Float preco, Integer estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public Float getPreco () {
        return preco;
    }

    public void setPreco (Float preco) {
        this.preco = preco;
    }

    public Integer getEstoque () {
        return estoque;
    }

    public void setEstoque (Integer estoque) {
        this.estoque = estoque;
    }

    @Override
    public String toString () {
        return "Nome: " + this.nome + "\nPreço: " + this.preco + "\nEstoque: " + this.estoque;
    }
}
