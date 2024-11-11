public class Main {

    public static void main(String[] args) {

        Estudante e = new Estudante("Carlos","Rua 1o de Abril");

        EstudanteGraduacao eg = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        EstudantePosGrad ep = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        EstudanteMestrado epm = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "academico","Anticorpos");
        EstudanteDoutorado epd = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        e.print();


        eg.print();
        System.out.println("Título TCC: " + eg.getTituloTCC());

        ep.print();
        System.out.println("Formação prévia: " + ep.getFormacao());

        epm.print();
        System.out.println("Título Dissertação: " + epm.getTituloDissertacao());

        epd.print();
        System.out.println("Título Tese: " + epd.getTituloTese());



        // casos com polimorfismo
        Estudante e2 = new Estudante("Carlos","Rua 1o de Abril");
        Estudante eg2 = new EstudanteGraduacao("Maria", "Rua Maio", "Java is funny");
        Estudante ep2 = new EstudantePosGrad("Ailton","Rua 31 de fevereiro","Engenharia",
                "Banco de Dados");
        Estudante epm2 = new EstudanteMestrado("Carla","Rua Primavera","Medicina",
                "Vacinas de RNA", "Anticorpos","academico");
        Estudante epd2 = new EstudanteDoutorado("Bruno","Rua Inverno",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        // exemplo de uso com vetor e com CAST
        Estudante[] ev = new Estudante[4];
        ev[0] = eg;
        eg.print();
        eg.getTituloTCC();
        ev[0].print();
        String x = ((EstudanteGraduacao) ev[0]).getTituloTCC();
        String x2 = ((EstudantePosGrad) ev[0]).getFormacao();

        e2.print();
        eg2.print();
        epd2.print();
        ep2.print();
        epd2.print();
     //   EstudanteDoutorado epd3;
      //  epd3 = (EstudanteDoutorado)epd2;
       // System.out.println(epd3.getTituloTese());
       // System.out.println(((EstudanteDoutorado)epd2).getTituloTese());

/*
        eg2.print();
        System.out.println(eg2.getTituloTCC());

        ep2.print();
        System.out.println(ep2.getFormacao());

        epm2.print();
        System.out.println(epm2.getTituloDissertacao());

*/
        /*
        Estudante e2 = new Estudante();
        Estudante eg2 = new EstudanteGraduacao();
        Estudante ep2 = new EstudantePosGrad();
        Estudante epm2 = new EstudanteMestrado();
        Estudante epd2 = new EstudanteDoutorado();

        //EstudantePosGrad e3 = new Estudante();
        //EstudantePosGrad eg3 = new EstudanteGraduacao();
        */

        // polimorfismo com pós-graduação
        // construtor incompleto
        /*
        EstudantePosGrad ep3 = new EstudantePosGrad();
        EstudantePosGrad epm3 = new EstudanteMestrado();
        EstudantePosGrad epd3 = new EstudanteDoutorado();
        */

        // Crie alguns estudantes
        EstudanteGraduacao alunoGrad1 = new EstudanteGraduacao("Alice", "Rua 01", "TCC 01");
        EstudanteMestrado alunoMestrado1 = new EstudanteMestrado("Bob", "Rua 02", "Ciência da Computação", "Banco de Dados", "Tecnologia", "Academico");
        EstudanteDoutorado alunoDoutorado1 = new EstudanteDoutorado("Charlie","Rua 03",
                "Tecnologia","Processamento de Imagens","Carros Inteligentes");

        // Crie um vetor de estudantes
        Estudante[] estudantes = {alunoGrad1, alunoMestrado1, alunoDoutorado1};

        // Crie uma universidade
        Universidade universidade = new Universidade("Universidade ABC", "10/09/1960", estudantes);

        // Chame os métodos da universidade
        universidade.contAlunos(estudantes);
        universidade.mostrarDados(estudantes);

        /*

        No momento, não é possível usar o método print(boolean) em um vetor da classe Estudante diretamente para realizar o polimorfismo. Isso ocorre porque o método print(boolean) não está declarado na classe base Estudante, e, portanto, não está disponível para objetos do tipo Estudante.

         */



    }
}
