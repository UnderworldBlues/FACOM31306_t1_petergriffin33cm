public class EstudanteMestrado extends EstudantePosGrad {
    private String tipo; // tipo pode ser acadêmico ou profisional
    private String tituloDissertacao;

    public EstudanteMestrado(String nome, String endereco, String formacao,
                             String linhadDePesquisa, String tipo, String tituloDissertacao) {
        super(nome, endereco, formacao, linhadDePesquisa);
        this.tipo = tipo;
        this.tituloDissertacao = tituloDissertacao;
    }

    @Override
    public void print() {
        super.print();
        System.out.println("EstudanteMestrado{" +
                "tipo='" + tipo + '\'' +
                ", tituloDissertacao='" + tituloDissertacao + '\'' +
                '}');
    }

    public void print(boolean mesmaLinha) {

        if (mesmaLinha) {
            System.out.println("(ESTUDANTE MESTRADO) Nome: " + getNome() + "; Endereço: " + getEndereco() + "; Formação: " + getFormacao() + "; Linha de Pesquisa: " + getLinhaDePesquisa() + "; Dissertação: " + getTituloDissertacao());
        } else {
            System.out.println("<< ESTUDANTE MESTRADO >>");
            System.out.println("Nome: " + getNome());
            System.out.println("Endereço: " + getEndereco());
            System.out.println("Formação: " + getFormacao());
            System.out.println("Linha de Pesquisa: " + getLinhaDePesquisa());
            System.out.println("Dissertação: " + getTituloDissertacao());
        }

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTituloDissertacao() {
        return tituloDissertacao;
    }

    public void setTituloDissertacao(String tituloDissertacao) {
        this.tituloDissertacao = tituloDissertacao;
    }
}
