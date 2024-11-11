public class EstudanteDoutorado extends EstudantePosGrad {
    String tituloTese;

    public EstudanteDoutorado(String nome, String endereco, String formacao,
                              String linhadDePesquisa, String tituloTese) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tituloTese = tituloTese;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteDoutorado{" +
                "tituloTese='" + tituloTese + '\'' +
                '}');

    }

    public void print(boolean mesmaLinha) {

        if (mesmaLinha) {
            System.out.println("(ESTUDANTE DOUTORADO) Nome: " + getNome() + "; Endereço: " + getEndereco() + "; Formação: " + getFormacao() + "; Linha de Pesquisa: " + getLinhaDePesquisa());
        } else {
            System.out.println("<< ESTUDANTE DOUTORADO >>");
            System.out.println("Nome: " + getNome());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Formação: " + getFormacao());
            System.out.println("Linha de Pesquisa: " + getLinhaDePesquisa());
        }

    }

    public String getTituloTese() {
        return tituloTese;
    }

    public void setTituloTese(String tituloTese) {
        this.tituloTese = tituloTese;
    }
}
