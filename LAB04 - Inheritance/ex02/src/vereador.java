public class vereador extends candidato{
    private String numeroVereador;
    private String bairro;

    public vereador(String nomeCompleto, String dataNascimento, String genero, double totalBens, boolean candidatoReeleicao, int numeroPartido, String numeroVereador, String bairro) {
        super(nomeCompleto, dataNascimento, genero, totalBens, candidatoReeleicao, numeroPartido);
        this.numeroVereador = numeroVereador;
        this.bairro = bairro;
    }

    public String getNumeroVereador() {
        return numeroVereador;
    }

    public void setNumeroVereador(String numeroVereador) {
        this.numeroVereador = numeroVereador;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return super.toString() + " Vereador: " + numeroVereador + " - " + bairro;
    }

}
