import java.util.Scanner;
// Crie no programa principal um vetor de candidatos e instancie os candidatos. 
// Mostre as informações de todos os candidatos. 
// Utilize laços para manipulação do vetor.
public class App {
    public static void main(String[] args) throws Exception {
        candidatos[] can;
        can = new candidatos[3];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++)
        {
            can[i] = new candidatos();
            System.out.println("Digite o nome do candidato: ");
            can[i].setNome(sc.nextLine());
            System.out.println("Digite a data de nascimento do candidato: ");
            can[i].setData(sc.nextLine());
            System.out.println("Digite o gênero do candidato: ");
            can[i].setGenero(sc.nextLine());
            System.out.println("Digite o valor total dos bens do candidato: ");
            can[i].setBensTotais(sc.nextFloat());
            System.out.println("O candidato está tentando reeleição? (true/false)");
            can[i].setReeleicao(sc.nextBoolean());
            System.out.println("Digite o número do partido do candidato: ");
            can[i].setNoPartido(sc.nextInt());
            sc.nextLine();
            System.out.println("Digite o cargo pretendido pelo candidato: ");
            can[i].setCargoPretendido(sc.nextLine());
        }

        for(int i = 0; i < 3; i++)
        {
            can[i].mostrar();
        }
    }

}
