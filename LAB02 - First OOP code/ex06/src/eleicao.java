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
