import java.util.Scanner;
public class eleicao {
    private String nomeMunicipio;
    private Integer numVotantes;
    private candidatos[] candidatos;
    private String dataEleicao;

    // construtor
    public eleicao (String nomeMunicipio, Integer numVotantes, candidatos[] candidatos, String dataEleicao) {
        this.nomeMunicipio = nomeMunicipio;
        this.numVotantes = numVotantes;
        this.candidatos = candidatos;
        this.dataEleicao = dataEleicao;
    }

    public String getNomeMunicipio () {
        return nomeMunicipio;
    }

    public void setNomeMunicipio (String nomeMunicipio) {
        this.nomeMunicipio = nomeMunicipio;
    }

    public Integer getNumVotantes () {
        return numVotantes;
    }

    public void setNumVotantes (Integer numVotantes) {
        this.numVotantes = numVotantes;
    }

    public candidatos[] getCandidatos () {
        return candidatos;
    }

    public void setCandidatos () {

        Scanner sc = new Scanner(System.in);
        System.err.println("Insira o no de candidatos: ");
        int n = sc.nextInt();
        this.candidatos = new candidatos[n];

        for(int i = 0; i < n; i++)
        {
            System.err.println("Insira o nome do candidato: ");
            String nome = sc.next();
            System.err.println("Insira a data de nascimento do candidato: ");
            String data = sc.next();
            System.err.println("Insira o genero do candidato: ");
            String genero = sc.next();
            System.err.println("Insira o valor total de bens do candidato: ");
            Float bensTotais = sc.nextFloat();
            System.err.println("O candidato é reeleito? (true/false) ");
            Boolean reeleicao = sc.nextBoolean();
            System.err.println("Insira o numero do partido do candidato: ");
            Integer noPartido = sc.nextInt();
            System.err.println("Insira o cargo pretendido do candidato: ");
            String cargoPretendido = sc.next();
            this.candidatos[i] = new candidatos(nome, data, genero, bensTotais, reeleicao, noPartido, cargoPretendido);
        }

        sc.close();
    }

    public String getDataEleicao () {
        return dataEleicao;
    }

    public void setDataEleicao (String dataEleicao) {
        this.dataEleicao = dataEleicao;
    }

    public void show () 
    {
        System.out.println("Nome do município: " + this.nomeMunicipio);
        System.out.println("Número de votantes: " + this.numVotantes);
        System.out.println("Data da eleição: " + this.dataEleicao);

        for (candidatos candidato : this.candidatos) 
            candidato.mostrar();
    }
}
