import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class stardewManager {
    public static void main(String[] args) {
        List<Animal> curral = new ArrayList<>();

        curral.add(new VacaMae("101", "Mimosa", "Holandesa", 7, false));
        curral.add(new GalinhaMae("102", "Giselda", "Caipira", 1, true));
        curral.add(new OvelhaMae("103", "Chiquinha", "Merino", 3, true));

        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\nMENU PRINCIPAL");
            System.out.println("1. Ver animais do curral");
            System.out.println("2. Comércio (Coletar/Retirar produtos)");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
            } else {
                scanner.next();
                continue;
            }

            System.out.println();
            switch (opcao) {
                case 1:
                    System.out.println("ANIMAIS NO CURRAL:");
                    for (Animal animal : curral) {
                        animal.exibirDetalhes();
                        System.out.println("----------------------------------------");
                    }
                    break;

                case 2:
                    System.out.println("COLETA DE PRODUTOS:");
                    for (Animal animal : curral) {
                        System.out.println(animal.getNome() + " (" + animal.getEspecie() + "): " + animal.coletarProduto());
                    }
                    break;

                case 3:
                    System.out.println("Saindo do Stardew Manager. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}