public class aluno {
    String nome;
    Integer idade;
    String matricula;

    public aluno(String nome, int idade, String matricula) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Integer getIdade() {
        return this.idade;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " Idade: " + this.idade + " Matricula: " + this.matricula;
    }

}
