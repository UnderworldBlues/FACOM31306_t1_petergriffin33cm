import java.util.Arrays;

public class time {
    private String nome;
    private jogador jogadores[]; // os 2 primeiros são titulares e o 3° é o sub

    public time(String nome) {
        this.nome = nome;
        System.out.println("insira o nome dos jogadores");
        jogadores = new jogador[3];
        for (int i = 0; i < 3; i++) {
            jogadores[i] = new jogador();
            jogadores[i].setNome();
            jogadores[i].setIdade();
            jogadores[i].setAltura();
            jogadores[i].setPeso();
        }
    }

    public time () {
        System.out.println("Insira o nome do time");
        this.nome = System.console().readLine();

        jogadores = new jogador[3];
        System.out.println("Insira os dados dos titulares");
        for(int i = 0; i < 2; i++) {
            System.out.println("Insira os dados do titular " + (i+1));
            jogadores[i] = new jogador();
            jogadores[i].setNome();
            jogadores[i].setIdade();
            jogadores[i].setAltura();
            jogadores[i].setPeso();
        }
        System.out.println("Insira os dados do reserva");
        jogadores[2] = new jogador();
        jogadores[2].setNome();
        jogadores[2].setIdade();
        jogadores[2].setAltura();
        jogadores[2].setPeso();
    }

    public Float idadeMedia () {
        Float media = 0f;
        for (int i = 0; i < 3; i++) {
            media += Float.parseFloat(this.jogadores[i].getIdade());
        }
        return media/3;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public jogador[] getJogadores() {
        return jogadores;
    }

    public void setJogadores(jogador[] jogadores) {
        this.jogadores = jogadores;
    }

    @Override
    public String toString() {
        return "time{" +
                "nome='" + nome + '\'' +
                ", jogadores=" + Arrays.toString(jogadores) +
                '}';
    }
}
