public class professor {
    String nome;
    String fID; // funcionario ID
    String dataContratacao;
    String dataNascimento;

    public professor(String nome, String fID, String dataContratacao, String dataNascimento) {
        this.nome = nome;
        this.fID = fID;
        this.dataContratacao = dataContratacao;
        this.dataNascimento = dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setFID(String fID) {
        this.fID = fID;
    }

    public String getFID() {
        return this.fID;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public String getDataContratacao() {
        return this.dataContratacao;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + " FID: " + this.fID + " Data de Contratacao: " + this.dataContratacao + " Data de Nascimento: " + this.dataNascimento;
    }

}
