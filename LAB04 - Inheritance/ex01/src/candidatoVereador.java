public class candidatoVereador {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean candidatoReeleicao;
    private int numeroPartido;
    private String numeroVereador;
    private String bairro;

    public candidatoVereador(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido, String numeroVereador, String bairro) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.candidatoReeleicao = candidatoReeleicao;
        this.numeroPartido = numeroPartido;
        this.numeroVereador = numeroVereador;
        this.bairro = bairro;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getNomeCompleto() {
        return this.nomeCompleto;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setTotalBens(double totalBens) {
        this.totalBens = totalBens;
    }

    public double getTotalBens() {
        return this.totalBens;
    }

    public void setCandidatoReeleicao(boolean candidatoReeleicao) {
        this.candidatoReeleicao = candidatoReeleicao;
    }

    public boolean getCandidatoReeleicao() {
        return this.candidatoReeleicao;
    }

    public void setNumeroPartido(int numeroPartido) {
        this.numeroPartido = numeroPartido;
    }

    public int getNumeroPartido() {
        return this.numeroPartido;
    }

    public void setNumeroVereador(String numeroVereador) {
        this.numeroVereador = numeroVereador;
    }

    public String getNumeroVereador() {
        return this.numeroVereador;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String toString() {
        return "Nome Completo: " + this.nomeCompleto + "\nData de Nascimento: " + this.dataNascimento + "\nGênero: " + this.genero + "\nTotal de Bens: " + this.totalBens + "\nCandidato a reeleição: " + this.candidatoReeleicao + "\nNúmero do Partido: " + this.numeroPartido + "\nNúmero do Vereador: " + this.numeroVereador + "\nBairro: " + this.bairro;
    }
    
}
