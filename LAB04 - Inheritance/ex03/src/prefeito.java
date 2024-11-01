public class prefeito extends candidato{
    private String nomeVicePrefeito;
    private String partidoVicePrefeito;

    public prefeito (String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido, String nomeVicePrefeito, String partidoVicePrefeito) {
        super(nomeCompleto, dataNascimento, genero, totalBens, candidatoReeleicao, numeroPartido);
        this.nomeVicePrefeito = nomeVicePrefeito;
        this.partidoVicePrefeito = partidoVicePrefeito;
    }

    public String getNomeVicePrefeito() {
        return nomeVicePrefeito;
    }

    public void setNomeVicePrefeito(String nomeVicePrefeito) {
        this.nomeVicePrefeito = nomeVicePrefeito;
    }

    public String getPartidoVicePrefeito() {
        return partidoVicePrefeito;
    }

    public void setPartidoVicePrefeito(String partidoVicePrefeito) {
        this.partidoVicePrefeito = partidoVicePrefeito;
    }

    @Override
    public String toString() {
        return super.toString() + " Vice: " + nomeVicePrefeito + " - " + partidoVicePrefeito;
    }

}
