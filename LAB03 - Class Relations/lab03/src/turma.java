public class turma {
    Integer id;
    Integer periodo;
    String curso;
    aluno[] alunos; //turma possui n alunos

    public turma(Integer id, Integer periodo, String curso, aluno[] alunos) {
        this.id = id;
        this.periodo = periodo;
        this.curso = curso;
        this.alunos = alunos;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return this.id;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Integer getPeriodo() {
        return this.periodo;
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

    public void show () {
        System.out.println("Turma: " + this.id + " Periodo: " + this.periodo + " Curso: " + this.curso);
        for (aluno a : this.alunos)
            System.out.println(a);
    }

}
