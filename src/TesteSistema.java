import br.ufrpe.CamadaNegocios.Cliente;
import br.ufrpe.CamadaNegocios.Ingresso;
import br.ufrpe.CamadaNegocios.Jogo;
import br.ufrpe.camadaDados.RepositorioIngressos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class TesteSistema {
    public static void main(String[] args) {
        RepositorioIngressos repositorio = new RepositorioIngressos();
        Cliente pessoaA = new Cliente("Gustavo", 70133456348L, "Brasil"),
                pessoaB = new Cliente("Pedro", 86793456700L, "Brasil"),
                pessoaC = new Cliente("Josh", 98356789400L, "Estados Unidos");
        Jogo jogo1 = new Jogo("Brasil", "Croácia", "Neo Química Arena",
                LocalDateTime.of(2014, 6, 12, 17, 0)),
                jogo2 = new Jogo("Brasil", "México", "Castelão (CE)",
                        LocalDateTime.of(2014, 6, 17, 16, 0)),
                jogo3 = new Jogo("Brasil", "Camarões", "Mané Garrincha",
                        LocalDateTime.of(2014, 6, 23, 17, 0)),
                jogo4 = new Jogo("Gana", "Estados Unidos", "Arena das Dunas",
                        LocalDateTime.of(2014, 6, 16, 19, 0)),
                jogo5 = new Jogo("Estados Unidos", "Portugal", "Arena da Amazônia",
                        LocalDateTime.of(2014, 6, 22, 19, 0));

        Ingresso ingresso1 = new Ingresso(pessoaA, jogo1, "Setor 1-Cadeira 25A"),
                ingresso2 = new Ingresso(pessoaB, jogo1, "Setor 4-Cadeira 15D"),
                ingresso3 = new Ingresso(pessoaA, jogo2, "Setor 1-Cadeira 5A"),
                ingresso4 = new Ingresso(pessoaC, jogo2, "Setor 1-Cadeira 15A"),
                ingresso5 = new Ingresso(pessoaA, jogo3, "Setor 1-Cadeira 2A"),
                ingresso6 = new Ingresso(pessoaC, jogo4, "Setor 1-Cadeira 1A"),
                ingresso7 = new Ingresso(pessoaC, jogo5, "Setor 1-Cadeira 25A"),
                ingresso8 = new Ingresso(pessoaA, jogo5, "Setor 3-Cadeira 5C");
        repositorio.adicionarIngresso(ingresso1);
        repositorio.adicionarIngresso(ingresso2);
        repositorio.adicionarIngresso(ingresso3);
        repositorio.adicionarIngresso(ingresso4);
        repositorio.adicionarIngresso(ingresso5);
        repositorio.adicionarIngresso(ingresso6);
        repositorio.adicionarIngresso(ingresso7);
        repositorio.adicionarIngresso(ingresso8);
        int opcao;
        do {

            System.out.println("-----------------------------------" +
                    "-----------------------------------");
            System.out.printf("               MENU PRINCIPAL%n1- Vender Ingresso%n" +
                    "2- listar ingressos vendidos por estádio%n" +
                    "3- listar pessoas que assistiram jogos de uma determinada seleção%n" +
                    "4- listar pessoas que assistiram aos jogos dos países de origem%n"+
                    "5- SAIR%n");
            System.out.println("-----------------------------------" +
                    "-----------------------------------");
            System.out.print("Digite o número da sua opção:");
            Scanner sc = new Scanner(System.in);
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("-----------------------------------" +
                            "-----------------------------------");
                    System.out.printf("               MENU VENDER INGRESSO%n");
                    System.out.print("Digite o nome do cliente:");
                    sc.nextLine();
                    String nome = sc.nextLine();
                    System.out.print("Digite o cpf:");
                    Long cpf = sc.nextLong();
                    System.out.print("Digite o país:");
                    sc.nextLine();
                    String pais = sc.nextLine();
                    System.out.print("Digite o setor que deseja:");
                    String setor = sc.nextLine();
                    System.out.print("Digite a cadeira que deseja:");
                    String cadeira = sc.nextLine();
                    String assento = "Setor "+ setor + "-Cadeira "+ cadeira;
                    Cliente cadastrar = new Cliente(nome,cpf,pais);
                    System.out.println("------Escolha o jogo para comprar o ingresso------");
                    System.out.printf("1- %s X %s, %s%n" +
                            "2- %s X %s, %s%n" +
                            "3- %s X %s, %s%n" +
                            "4- %s X %s, %s%n" +
                            "5- %s X %s, %s%n", jogo1.getEquipeCasa(),jogo1.getEquipeFora(),
                            jogo1.getEstadio(),jogo2.getEquipeCasa(),jogo2.getEquipeFora(),
                            jogo2.getEstadio(),jogo3.getEquipeCasa(),jogo3.getEquipeFora(),
                            jogo3.getEstadio(),jogo4.getEquipeCasa(),jogo4.getEquipeFora(),
                            jogo4.getEstadio(),jogo5.getEquipeCasa(),jogo5.getEquipeFora(),
                            jogo5.getEstadio());
                    System.out.print("Digite a opção:");
                    int opcao2 = sc.nextInt();
                    Ingresso novo;
                    switch (opcao2){
                        case 1:
                            novo = new Ingresso(cadastrar,jogo1,assento);
                            repositorio.adicionarIngresso(novo);
                            break;
                        case 2:
                            novo = new Ingresso(cadastrar,jogo2,assento);
                            repositorio.adicionarIngresso(novo);
                            break;
                        case 3:
                            novo = new Ingresso(cadastrar,jogo3,assento);
                            repositorio.adicionarIngresso(novo);
                            break;
                        case 4:
                            novo = new Ingresso(cadastrar,jogo4,assento);
                            repositorio.adicionarIngresso(novo);
                            break;
                        case 5:
                            novo = new Ingresso(cadastrar,jogo5,assento);
                            repositorio.adicionarIngresso(novo);
                            break;
                    }
                    break;
                case 2:
                    ArrayList<Ingresso> porEstadio = repositorio.ingressosVendidos();
                    System.out.println("Estadio     Casa     Fora");
                    System.out.println("---------------------------------------------");
                    for (Ingresso atual : porEstadio) {
                        System.out.printf("%s   |   %s   |   %s   %n", atual.getJogo().getEstadio(),
                                atual.getJogo().getEquipeCasa(), atual.getJogo().getEquipeFora());
                    }
                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Que país quer consultar compradores?");
                    String pais1 = sc.nextLine();
                    ArrayList<String> pessoas = repositorio.nomesCompradores(pais1);
                    System.out.println("---------------------------------------------");
                    for (int i = 0; i<pessoas.size(); i++) {
                        System.out.printf("%d- %s%n", i+1, pessoas.get(i));
                    }
                    break;
                case 4:
                    ArrayList<Cliente> pessoas2 = repositorio.clientesCompradores();
                    System.out.println("---------------------------------------------");
                    for (int i = 0; i<pessoas2.size(); i++) {
                        System.out.printf("%d- %s%n", i + 1, pessoas2.get(i).getNome());
                    }
                    break;
                case 5:
                    opcao = 6;
                    break;
            }
        } while (opcao != 6);
    }
}
