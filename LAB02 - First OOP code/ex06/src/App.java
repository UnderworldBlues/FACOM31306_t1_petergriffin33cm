/*Refaça o código do exercício anterior para que a Eleição em uma determinada cidade tenha 05 candidatos. 
*Após instanciar a eleição*, faça uma busca do candidato que possui o maior valor de bens. 
Mostre as informações desse candidato, indicando qual o percentual de bens ele possui em relação a todos
os outros candidatos que estão concorrendo na eleição.*/

import java.util.Scanner;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        candidatos candidatoMaiorPatrimonio = new candidatos();
        candidatoMaiorPatrimonio.setBensTotais(0.0f);
        candidatos[] candidatos = new candidatos[5];

        System.out.println("Devem existir 5 candidatos, por favor preencha os dados de cada um deles.");
        for(int i = 0; i < 5; i++) 
        {
            candidatos[i] = new candidatos();
            System.out.println("Candidato " + (i + 1));
            System.out.print("Nome: ");
            candidatos[i].setNome(sc.nextLine());
            System.out.print("Data de nascimento: ");
            candidatos[i].setData(sc.nextLine());
            System.out.print("Gênero: ");
            candidatos[i].setGenero(sc.nextLine());
            System.out.print("Bens totais: ");
            candidatos[i].setBensTotais(sc.nextFloat());
            sc.nextLine();
            System.out.print("Tentando reeleição? (true/false): ");
            candidatos[i].setReeleicao(sc.nextBoolean());
            sc.nextLine();
            System.out.print("Número do partido: ");
            candidatos[i].setNoPartido(sc.nextInt());
            sc.nextLine();
            System.out.print("Cargo pretendido: ");
            candidatos[i].setCargoPretendido(sc.nextLine());
        }

        System.out.print("Nome do município: ");
        String nomeMunicipio = sc.nextLine();
        System.out.print("Número de votantes: ");
        Integer numVotantes = sc.nextInt();
        sc.nextLine();
        System.out.print("Data da eleição: ");
        String dataEleicao = sc.nextLine();

        eleicao eleicao = new eleicao(nomeMunicipio, numVotantes, candidatos, dataEleicao);

        for (candidatos candidato : eleicao.getCandidatos()) 
            if (candidato.getBensTotais() > candidatoMaiorPatrimonio.getBensTotais())
                candidatoMaiorPatrimonio = candidato;

        System.out.println("<< MOSTRANDO DADOS DO CANDIDATO COM MAIOR VALOR DE BENS >>");
        

        sc.close();

    }
}
