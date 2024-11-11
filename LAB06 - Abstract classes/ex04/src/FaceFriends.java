import java.util.Scanner;

public class FaceFriends {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String apelido, nome, email, aniv, parent, tipoTrab;
        int op, tipo, grau, indice;
        int qtd = 0;
        int limite = 5;

        Contato[] vet = new Contato[limite];

        System.out.println("<< MENU >>");

        do {
            System.out.println("[1] Inserir contato");
            System.out.println("[2] Imprimir todos contatos");
            System.out.println("[3] Imprimir familiares");
            System.out.println("[4] Imprimir amigos");
            System.out.println("[5] Imprimir colegas de trabalho");
            System.out.println("[6] Imprimir melhores amigos, irmãos e colegas");
            System.out.println("[7] Imprimir contato escolhido");
            System.out.println("[8] Sair");

            op = sc.nextInt();

            switch (op) {
                case 1:
                    if (qtd > limite) {
                        System.out.println("O limite foi alcançado!");
                    } else {
                        System.out.println("<< Inserindo contato >>");

                        System.out.println("Apelido: ");
                        apelido = sc.next();
                        System.out.println("Nome: ");
                        nome = sc.next();
                        System.out.println("Email: ");
                        email = sc.next();
                        System.out.println("Aniversário: ");
                        aniv = sc.next();

                        System.out.println("Especifique o subtipo de contato:");
                        System.out.println("[1] Família");
                        System.out.println("[2] Amigo");
                        System.out.println("[3] Trabalho");
                        tipo = sc.nextInt();

                        if (tipo == 1) {
                            System.out.println("Parentesco: ");
                            parent = sc.next();

                            Familia cf = new Familia(apelido, nome, email, aniv, parent);
                            vet[qtd] = cf;
                        } else if (tipo == 2) {
                            System.out.println("Grau de amizade: ");
                            grau = sc.nextInt();

                            Amigos ca = new Amigos(apelido, nome, email, aniv, grau);
                            vet[qtd] = ca;
                        } else if (tipo == 3) {
                            System.out.println("Tipo de trabalho: ");
                            tipoTrab = sc.next();

                            Trabalho ct = new Trabalho(apelido, nome, email, aniv, tipoTrab);
                            vet[qtd] = ct;
                        }
                        qtd++;
                    }
                    break;


                case 2:
                    for (Contato i : vet) {
                        i.imprimirContato();
                    }
                    break;

                case 3:
                    for (Contato i : vet) {
                        if (i instanceof Familia) {
                            i.imprimirContato();
                        }
                    }
                    break;

                case 4:
                    for (Contato i : vet) {
                        if (i instanceof Amigos) {
                            i.imprimirContato();
                        }
                    }
                    break;

                case 5:
                    for (Contato i : vet) {
                        if (i instanceof Trabalho) {
                            i.imprimirContato();
                        }
                    }
                    break;

                case 6:
                    System.out.println("<< MELHORES AMIGOS >>");
                    for (Contato i : vet) {
                        if (i instanceof Amigos) {
                            if (((Amigos) i).getGrau() == 1) {
                                i.imprimirContato();
                            }
                        }
                    }

                    System.out.println("<< IRMÃOS >>");
                    for (Contato i : vet) {
                        if (((Familia) i).getParentesco().equals("irmão")) {
                            i.imprimirContato();
                        }
                    }

                    System.out.println("<< COLEGAS >>");
                    for (Contato i : vet) {
                        if (((Trabalho) i).getTipo().equals("colega")) {
                            i.imprimirContato();
                        }
                    }
                    break;

                case 7:
                    System.out.println("<< IMPRIMIR CONTATO ESCOLHIDO >>");
                    System.out.println("Escolha o índice do contato que você deseja imprimir os dados: ");
                    indice = sc.nextInt();

                    vet[indice].imprimirContato();
                    break;

                case 8:
                    break;

                default:
                    System.out.println("Opção incorreta!");
                    break;
            }

        } while (op != 8);

    }
}
