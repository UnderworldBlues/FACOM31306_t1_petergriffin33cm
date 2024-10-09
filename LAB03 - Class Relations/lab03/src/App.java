public class App {
    public static void main(String[] args) throws Exception {
        aluno[] alunos = new aluno[3];
        alunos[0] = new aluno("Joao", 20, "123");
        alunos[1] = new aluno("Maria", 21, "124");
        alunos[2] = new aluno("Jose", 22, "125");

        turma t = new turma(1, 1, "POO", alunos);
        t.show();
    }
}
