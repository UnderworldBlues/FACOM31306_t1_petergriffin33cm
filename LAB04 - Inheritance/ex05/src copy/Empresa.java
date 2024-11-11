public class Empresa {

    public static void main(String[] args) {
        Chefe chefe1 = new Chefe("John", "01/04/1995", 12000.0f);
        Chefe chefe2 = new Chefe("Paul", "02/02/1999", 8000.0f);

        Vendedores vendedor1 = new Vendedores("Richard", "01/04/2001", 2000.0f, 0.1f, 30000.0f);
        Vendedores vendedor2 = new Vendedores("George", "05/11/1994", 2500.0f, 0.12f, 50000.0f);

        Operarios operario1 = new Operarios("Mick", "07/06/2003", 5.0f, 1000);
        Operarios operario2 = new Operarios("Keith", "06/08/2003", 5.0f, 1200);

        Horistas horista1 = new Horistas("Charlie", "21/04/1998", 10.0f, 160);
        Horistas horista2 = new Horistas("Ronnie", "18/09/2006", 11.0f, 140);

        Funcionario[] funcionarios = { chefe1, chefe2, vendedor1, vendedor2, operario1, operario2, horista1, horista2 };

        for (Funcionario funcionario : funcionarios) {
            double salario = funcionario.calc_Salario();
            System.out.println(funcionario.getNome() + ": Salário R$" + salario);
            
        }
    }
}
