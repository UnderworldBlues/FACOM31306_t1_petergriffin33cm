public class turma {
    Integer id;
    String curso;
    professor professor;
    aluno[] alunos; //turma possui n alunos

    public turma(Integer id, String curso, professor professor, aluno[] alunos) {
        this.id = id;
        this.curso = curso;
        this.professor = professor;
        this.alunos = alunos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setAlunos(aluno[] alunos) {
        this.alunos = alunos;
    }

    public aluno[] getAlunos() {
        return this.alunos;
    }

    public void setProfessor(professor professor) {
        this.professor = professor;
    }

    public professor getProfessor() {
        return this.professor;
    }

    public void show () {
        System.out.println("Turma: " + this.id + " Curso: " + this.curso);
        for (aluno a : this.alunos)
            System.out.println(a);
    }

}
