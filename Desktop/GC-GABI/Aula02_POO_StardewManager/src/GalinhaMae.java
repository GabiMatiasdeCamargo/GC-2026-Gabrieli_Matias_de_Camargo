public class GalinhaMae extends BaseAnimal {
    private boolean botandoOvos;

    public GalinhaMae(String id, String nome, String raca, int idade, boolean botandoOvos) {
        super(id, nome, raca, idade);
        this.botandoOvos = botandoOvos;
    }

    @Override
    public String getEspecie() {
        return "Galinha";
    }

    @Override
    public String emitirSom() {
        return "Có-có!";
    }

    @Override
    public String coletarProduto() {
        return botandoOvos ? "Ovo" : "Nenhum produto disponível";
    }

    @Override
    public void exibirDetalhes() {
        String status = botandoOvos ? "Botando ovos" : "Não está botando";
        System.out.println("[ID: " + id + "] " + nome + " (" + getEspecie() + ")");
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " ano(s)");
        System.out.println("Som: " + emitirSom());
        System.out.println("Status: " + status);
    }
}