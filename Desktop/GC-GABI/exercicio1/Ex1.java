import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("DIGITE SEU NOME:");
        String nome = ler.nextLine();

        System.out.println(nome);

        ler.close();

    }
}
