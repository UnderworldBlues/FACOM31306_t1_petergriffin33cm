public class Universidade {
    private String nome;
    private String dataFundacao;
    private Estudante[] estudantes = new Estudante[100];

    public Universidade(String nome, String dataFundacao, Estudante[] estudantes) {
        this.nome = nome;
        this.dataFundacao = dataFundacao;
        this.estudantes = estudantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataFundacao() {
        return dataFundacao;
    }

    public void setDataFundacao(String dataFundacao) {
        this.dataFundacao = dataFundacao;
    }

    public Estudante[] getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(Estudante[] estudantes) {
        this.estudantes = estudantes;
    }

    public void contAlunos(Estudante[] estudantes) {
        int alunoG = 0;
        int alunoM = 0;
        int alunoD = 0;

        for(Estudante estudante: estudantes) {
            if (estudante instanceof EstudanteGraduacao) {
                alunoG += 1;
            } else if (estudante instanceof EstudanteMestrado) {
                alunoM += 1;
            } else if (estudante instanceof EstudanteDoutorado) {
                alunoD += 1;
            }
        }

        System.out.println("<< QTD. ALUNOS >>");
        System.out.println("Graduação: " + alunoG + " alunos.");
        System.out.println("Mestrado: " + alunoM + " alunos.");
        System.out.println("Doutorado: " + alunoD + " alunos.");

    }

    public void mostrarDados(Estudante[] estudantes) {

        System.out.println("<< DADOS DOS ESTUDANTES >>");

        for(Estudante estudante: estudantes) {
            System.out.println("Nome: " + estudante.getNome());
            if (estudante instanceof EstudanteDoutorado) {
                System.out.println("Titulo de tese: " + ((EstudanteDoutorado) estudante).getTituloTese());
                System.out.println("Linha de pesquisa" + ((EstudanteDoutorado) estudante).getLinhaDePesquisa());
            }
        }

    }
}
