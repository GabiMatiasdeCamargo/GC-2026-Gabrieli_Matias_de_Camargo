public class proceduralOldSteveCode {
    public static void main(String[] args) {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║   VELHO STEVE - FÁBRICA DE PICARETAS MANUAL            ║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");

        Picareta p1 = new Picareta("madeira", 50, 5);
        Picareta p2 = new Picareta("pedra", 70, 8);
        Picareta p3 = new Picareta("ferro", 100, 12);

        System.out.println("\nPicaretas fabricadas:");
        p1.mostrarInformacoes();
        p2.mostrarInformacoes();
        p3.mostrarInformacoes();

        System.out.println("\nUsando picaretas para minerar...");

        p3.minerar(30);
        p3.minerar(20);

        System.out.println("\nCriando picareta de ouro...");

        Picareta p4 = new Picareta("ouro", 30, 15);

        System.out.println("\nReparando a picareta de ferro...");

        p3.reparar(50);

        System.out.println("\nEstado final das picaretas:");

        p1.mostrarInformacoes();
        p2.mostrarInformacoes();
        p3.mostrarInformacoes();
        p4.mostrarInformacoes();
    }
}
