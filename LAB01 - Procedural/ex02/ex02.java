import java.util.Scanner;

public class ex02 {

    public static int alteraPreco(float[] preco, int index, float porcentagem) {
        float temp;

        if (porcentagem > -100) {
            temp = 1 + porcentagem / 100; 
            preco[index] = preco[index] * temp; 
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] nome = new String[4][1];
        float[] preco = new float[4];
        int[] qtdEstoque = new int[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("\nInforme o nome, o preco e a qtd. em estoque do produto " + (i + 1) + ":");
            nome[i][0] = scanner.next();
            preco[i] = scanner.nextFloat();
            qtdEstoque[i] = scanner.nextInt();
        }

        System.out.println("\nAumentando o preco em 10% do produto 1 e 3");
        alteraPreco(preco, 0, -110);
        alteraPreco(preco, 2, 10);

        System.out.println("\nReduzindo o preco em 5% do produto 2");
        if (alteraPreco(preco, 1, -5) == -1) 
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");
        else 
            System.out.println("\n\nPreco alterado com sucesso");

        System.out.println("\nAlterando o preco do prod. 3");
        if (alteraPreco(preco, 3, -110) == -1)
            System.out.println("\n\nErro: preco nao alterado. Porcentagem invalida\n");

        System.out.println("\nProdutos Cadastrados:\n");
        for (int i = 0; i < 4; i++) {
            System.out.printf("\nProduto: %s\nPreco: %.2f\nEstoque: %d", nome[i][0], preco[i], qtdEstoque[i]);
        }

        scanner.close();
    }
}

