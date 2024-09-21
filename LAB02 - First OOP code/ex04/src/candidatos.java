public class candidatos {
    private String nome;
    private String data;
    private String genero;
    private Float bensTotais;
    private Boolean reeleicao;
    private Integer noPartido;
    private String cargoPretendido;

    // construtor
    public candidatos (String nome, String data, String genero, Float bensTotais, Boolean reeleicao, Integer noPartido, String cargoPretendido) {
        this.nome = nome;
        this.data = data;
        this.genero = genero;
        this.bensTotais = bensTotais;
        this.reeleicao = reeleicao;
        this.noPartido = noPartido;
        this.cargoPretendido = cargoPretendido;
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public String getData () {
        return data;
    }

    public void setData (String data) {
        this.data = data;
    }

    public String getGenero () {
        return genero;
    }

    public void setGenero (String genero) {
        this.genero = genero;
    }

    public Float getBensTotais () {
        return bensTotais;
    }

    public void setBensTotais (Float bensTotais) {
        this.bensTotais = bensTotais;
    }

    public Boolean getReeleicao () {
        return reeleicao;
    }

    public void setReeleicao (Boolean reeleicao) {
        this.reeleicao = reeleicao;
    }

    public Integer getNoPartido () {
        return noPartido;
    }

    public void setNoPartido (Integer noPartido) {
        this.noPartido = noPartido;
    }

    public String getCargoPretendido () {
        return cargoPretendido;
    }

    public void setCargoPretendido (String cargoPretendido) {
        this.cargoPretendido = cargoPretendido;
    }

    public void mostrar() {
        System.out.println("<< MOSTRANDO DADOS DO CANDIDATO " + this.nome + " >>");

        System.out.println("Nome: " + this.nome);
        System.out.println("Data: " + this.data);
        System.out.println("Gênero: " + this.genero);
        System.out.println("Bens Totais: " + this.bensTotais);
        System.out.println("Tentando reeleição? " + this.reeleicao);
        System.out.println("Número no Partido: " + this.noPartido);
        System.out.println("Cargo Pretendido: " + this.cargoPretendido);
    }
    
}
