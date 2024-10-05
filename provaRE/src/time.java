import java.util.Arrays;

public class time {
    private String nome;
    private jogador jogadores[]; // os 2 primeiros são titulares e o 3° é o sub

    public time(String nome, jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    // construtor que não informa o sub
    public time(String nome, jogador j1, jogador j2) {
        this.nome = nome;
        this.jogadores = new jogador[]{j1, j2};
    }

    public String getNome() {
        return nome;
    }

    public jogador[] getJogadores() {
        return jogadores;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setJogadores(jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    public Integer idadeMedia() {
        Integer sum = 0;
        for (jogador j: jogadores) 
            sum += j.getIdade();
        return sum / jogadores.length;
    }

    @Override
    public String toString() {
        return "time{" +
                "nome='" + nome + '\'' +
                ", jogadores=" + Arrays.toString(jogadores) +
                '}';
    }
}
