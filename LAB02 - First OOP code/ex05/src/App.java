// Crie uma nova classe chamada Eleição (Eleicao - evitar acentuação e cedilha),
// que é composta pelo nome do município, o número de votantes, os candidatos, 
// e outras informações que julgar pertinente. Instancie duas Eleições (busque por outro município). 
// Inicialize os dados dos objetos por meio dos construtores. Mostre na tela todos os dados cadastrados.
public class App {
    public static void main(String[] args) throws Exception {
        candidatos[] candidatos = new candidatos[2];
        candidatos[0] = new candidatos("João", "01/01/2000", "Masculino", 1000.0f, true, 1, "Prefeito");
        candidatos[1] = new candidatos("Maria", "01/01/2000", "Feminino", 1000.0f, false, 2, "Vereador");

        eleicao eleicao1 = new eleicao("São Paulo", 1000, candidatos, "01/01/2022");
        eleicao eleicao2 = new eleicao("Rio de Janeiro", 2000, candidatos, "01/01/2022");

        eleicao1.show();
        eleicao2.show();
    }
}
