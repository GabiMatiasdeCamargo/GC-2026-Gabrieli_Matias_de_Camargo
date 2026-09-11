public class OvelhaMae extends BaseAnimal {
    private boolean prontaParaTosquia;

    public OvelhaMae(String id, String nome, String raca, int idade, boolean prontaParaTosquia) {
        super(id, nome, raca, idade);
        this.prontaParaTosquia = prontaParaTosquia;
    }

    @Override
    public String getEspecie() {
        return "Ovelha";
    }

    @Override
    public String emitirSom() {
        return "Mééé!";
    }

    @Override
    public String coletarProduto() {
        return prontaParaTosquia ? "Lã" : "Lã insuficiente";
    }

    @Override
    public void exibirDetalhes() {
        String status = prontaParaTosquia ? "Pronta para tosquia" : "Crescendo lã";
        System.out.println("[ID: " + id + "] " + nome + " (" + getEspecie() + ")");
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos | Status: " + status);
        System.out.println("Som: " + emitirSom());
    }
}