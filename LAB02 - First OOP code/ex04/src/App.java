// Refaça o exercício 02 utilizando construtores para inicialização dos atributos dos objetos criados. 
public class App {
    public static void main(String[] args) throws Exception {
       candidatos[] c;
        c = new candidatos[3];

        c[0] = new candidatos("João", "01/01/2000", "Masculino", 1000.0f, true, 1, "Prefeito");
        c[1] = new candidatos("Maria", "01/01/2000", "Feminino", 2000.0f, false, 2, "Vereador");
        c[2] = new candidatos("José", "01/01/2000", "Masculino", 3000.0f, true, 3, "Deputado");

        for(int i = 0; i < 3;i++)
            c[i].mostrar();
    }
}
