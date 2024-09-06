public class main {
    public static void main(){
        System.out.println("<< Exercício 01 >>");

        candidatos c1 = new candidatos();
        candidatos c2 = new candidatos();
        candidatos c3 = new candidatos();

        c1.nome = "Mario";
        c1.data = "01/01/1990";
        c1.genero = "Masculino";
        c1.bensTotais = 1000.0f;
        c1.reeleicao = false;
        c1.noPartido = 1;
        c1.cargoPretendido = "Presidente";

        c2.nome = "Vitor";
        c2.data = "02/02/1991";
        c2.genero = "Masculino";
        c2.bensTotais = 2000.0f;
        c2.reeleicao = true;
        c2.noPartido = 2;
        c2.cargoPretendido = "Governador";

        c3.nome = "Ana";
        c3.data = "03/03/1992";
        c3.genero = "Feminino";
        c3.bensTotais = 3000.0f;
        c3.reeleicao = false;
        c3.noPartido = 3;
        c3.cargoPretendido = "Prefeito";

        c1.mostrar();
    }
    
}
