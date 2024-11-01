public class candidato {
    private String nomeCompleto;
    private String dataNascimento;
    private String genero;
    private double totalBens;
    private boolean candidatoReeleicao;
    private int numeroPartido;

    public candidato(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido) {
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.totalBens = totalBens;
        this.candidatoReeleicao = candidatoReeleicao;
        this.numeroPartido = numeroPartido;
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

    @Override
    public String toString() {
        return "candidato [candidatoReeleicao=" + candidatoReeleicao + ", dataNascimento=" + dataNascimento + ", genero="
                + genero + ", nomeCompleto=" + nomeCompleto + ", numeroPartido=" + numeroPartido + ", totalBens="
                + totalBens + "]";
    }
}
