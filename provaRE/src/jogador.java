public class jogador {
    private String nome;
    private Integer idade;
    private Float altura;
    private Float peso;

    public jogador(String nome, Integer idade, Float altura, Float peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public Float getAltura() {
        return altura;
    }

    public Float getPeso() {
        return peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setAltura(Float altura) {
        this.altura = altura;
    }

    public void setPeso(Float peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "jogador{" +
                "nome='" + nome + '\'' +
                ", idade='" + idade + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }

}