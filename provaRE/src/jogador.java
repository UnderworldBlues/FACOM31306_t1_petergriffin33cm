public class jogador {
    private String nome;
    private String idade;
    private String altura;
    private String peso;

    public jogador(String nome, String idade, String altura, String peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public jogador() {
        this.nome = "";
        this.idade = "";
        this.altura = "";
        this.peso = "";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(){
        System.err.println("Insira o nome do jogador");
        this.nome = System.console().readLine();
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(){
        System.err.println("Insira a idade do jogador");
        this.idade = System.console().readLine();
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(){
        System.err.println("Insira a altura do jogador");
        this.altura = System.console().readLine();
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(){
        System.err.println("Insira o peso do jogador");
        this.peso = System.console().readLine();
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "jogador{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", altura='" + altura + '\'' +
                ", peso='" + peso + '\'' +
                '}';
    }
}