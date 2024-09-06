public class candidatos { 
    public String nome;
    public String data;
    public String genero;
    public Float bensTotais;
    public Boolean reeleicao;
    public Integer noPartido;
    public String cargoPretendido;

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
