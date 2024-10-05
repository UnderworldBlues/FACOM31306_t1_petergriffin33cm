import java.util.Scanner;

public class main {
    public static void main(String args[]) {
        int n, m;
        Scanner sc = new Scanner(System.in);

        System.out.println("você deseja criar quantos times?");
        m = sc.nextInt();
        time times[] = new time[m];

        for (int i = 0; i < m; i++) 
        {
            System.out.println("qual o nome do time " + (i + 1) + "?");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("quantos jogadores tem o time " + nome + "?");
            n = sc.nextInt();
            jogador jogadores[] = new jogador[n];

            for (int j = 0; j < n; j++) 
            {
                System.out.println("qual o nome do jogador " + (j + 1) + "?");
                sc.nextLine();
                String nomeJogador = sc.nextLine();
                System.out.println("qual a idade do jogador " + nomeJogador + "?");
                int idade = sc.nextInt();
                System.out.println("qual a altura do jogador " + nomeJogador + "?");
                float altura = sc.nextFloat();
                System.out.println("qual o peso do jogador " + nomeJogador + "?");
                float peso = sc.nextFloat();
                jogadores[j] = new jogador(nomeJogador, idade, altura, peso);
            }
            times[i] = new time(nome, jogadores);
        }

        for (int i = 0; i < m; i++) 
        {
            System.out.println(times[i]);
            System.out.println("idade média do time " + times[i].getNome() + ": " + times[i].idadeMedia());
        }
        
        sc.close();
    }
    
}
