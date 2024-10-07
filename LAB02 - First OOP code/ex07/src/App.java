public class App {
    public static void main(String[] args) throws Exception {
        produto[] produtos = new produto[5];
        produtos[0] = new produto("Arroz", 10.0f, 100);
        produtos[1] = new produto("Feijão", 8.0f, 50);
        produtos[2] = new produto("Macarrão", 5.0f, 30);
        produtos[3] = new produto("Carne", 30.0f, 20);
        produtos[4] = new produto("Leite", 3.0f, 40);

        System.out.println("<< MOSTRANDO DADOS DOS PRODUTOS >>");
        for (produto produto : produtos) 
            System.out.println(produto.toString());

        System.out.println("<< ORDENANDO OS PRODUTOS POR NOME >>");
        for (int i = 0; i < produtos.length; i++) 
            for (int j = i + 1; j < produtos.length; j++) 
                if (produtos[i].getNome().compareTo(produtos[j].getNome()) > 0) 
                {
                    produto temp = produtos[i];
                    produtos[i] = produtos[j];
                    produtos[j] = temp;
                }

        System.out.println("<< MOSTRANDO DADOS DOS PRODUTOS ORDENADOS >>");
        for (produto produto : produtos) 
            System.out.println(produto.toString());

    }
}
