import java.util.Scanner;

public class principal {

    public static void ex01(){
        Scanner sc = new Scanner(System.in);
        int val1,val2,val3,val4,val5,val6;

        System.out.println("<< Listando um vetor >>");
        System.out.println("Entre com o número 1:");
        val1 = sc.nextInt();

        System.out.println("Entre com o número 2:");
        val2 = sc.nextInt();

        System.out.println("Entre com o número 3:");
        val3 = sc.nextInt();

        System.out.println("Entre com o número 4:");
        val4 = sc.nextInt();

        System.out.println("Entre com o número 5:");
        val5 = sc.nextInt();

        System.out.println("Entre com o número 6:");
        val6 = sc.nextInt();

        System.out.println("Os valores lidos são:");
        System.out.printf("%d %d %d %d %d %d ", val1, val2, val3, val4, val5, val6);

        sc.close();

    }

    public static void ex02(){
        Scanner sc = new Scanner(System.in);
        int[] vet = new int[6];
        System.out.println("<< Listando um vetor >>");

        for (int i = 0; i < 6; i++){
            System.out.printf("Entre com o número %d:\n",i+1);
            vet[i] = sc.nextInt();
        }

        System.out.println("Os valores lidos são:");
        for (int i = 0; i < 6; i++){
            System.out.printf("%d ",vet[i]);
        }
        sc.close();
    }

    public static void ex03() {

        Scanner sc = new Scanner(System.in);

        int[] numsies = new int[6];

        for(int k = 0; k < 6; k++) {
            System.out.printf("Digite o número %d" + (k+1));
            numsies[k] = sc.nextInt();
        }

        System.out.println("Mostrando os números digitados ao contrário");

        for(int j = 5; j >= 0; j--) {
            System.out.println(numsies[j]);
        }

        sc.close();
    }

    public static void main(String[] args) {
        ex01();
        ex02();
        ex03();
    }


}
