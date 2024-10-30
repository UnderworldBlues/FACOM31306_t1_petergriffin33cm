public class candidatoPrefeito {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean candidatoReeleicao;
    private int numeroPartido;
    private String nomeVicePrefeito;
    private String partidoVicePrefeito;

    public candidatoPrefeito(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido, String nomeVicePrefeito, String partidoVicePrefeito) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.candidatoReeleicao = candidatoReeleicao;
        this.numeroPartido = numeroPartido;
        this.nomeVicePrefeito = nomeVicePrefeito;
        this.partidoVicePrefeito = partidoVicePrefeito;
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

    public void setNomeVicePrefeito(String nomeVicePrefeito) {
        this.nomeVicePrefeito = nomeVicePrefeito;
    }

    public String getNomeVicePrefeito() {
        return this.nomeVicePrefeito;
    }

    public void setPartidoVicePrefeito(String partidoVicePrefeito) {
        this.partidoVicePrefeito = partidoVicePrefeito;
    }

    public String getPartidoVicePrefeito() {
        return this.partidoVicePrefeito;
    }

    public String toString() {
        return "Nome Completo: " + this.nomeCompleto + "\nData de Nascimento: " + this.dataNascimento + "\nGênero: " + this.genero + "\nTotal de Bens: " + this.totalBens + "\nCandidato a reeleição: " + this.candidatoReeleicao + "\nNúmero do Partido: " + this.numeroPartido + "\nNome do Vice-Prefeito: " + this.nomeVicePrefeito + "\nPartido do Vice-Prefeito: " + this.partidoVicePrefeito;
    }
    
}
