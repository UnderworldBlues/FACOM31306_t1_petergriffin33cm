import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Integer x;
        String y, z;
        System.out.println("Quantos alunos tem na turma?");
        x = sc.nextInt();
        aluno[] alunos = new aluno[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Digite o nome do aluno: ");
            sc.nextLine();
            y = sc.nextLine();
            System.out.println("Digite a idade do aluno: ");
            x = sc.nextInt();
            System.out.println("Digite a matricula do aluno: ");
            sc.nextLine();
            z = sc.nextLine();
            alunos[i] = new aluno(y, x, z);
        }

        System.out.println("Digite o nome do professor: ");
        y = sc.nextLine();
        System.out.println("Digite o FID do professor: ");
        z = sc.nextLine();
        System.out.println("Digite a data de contratacao do professor: ");
        String w = sc.nextLine();
        System.out.println("Digite a data de nascimento do professor: ");
        String v = sc.nextLine();
        professor prof = new professor(y, z, w, v);

        x = (int)(Math.random() * 1000);
        System.out.println("Digite o nome do curso: ");
        y = sc.nextLine();

        turma t = new turma(x, y, prof, alunos);

        t.show();

    }
}
