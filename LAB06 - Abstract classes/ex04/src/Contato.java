public abstract class Contato {
    protected String apelido;
    protected String nome;
    protected String email;
    protected String aniversario;

    public Contato(String a, String n, String e, String av) {
        this.apelido = a;
        this.nome = n;
        this.email = e;
        this.aniversario = av;
    }

    public void imprimirBasico() {
        System.out.println("<< DADOS BÁSICOS >>");
        System.out.println("Apelido: " + apelido);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Aniversário: " + aniversario);
    }

    public abstract void imprimirContato();

}
