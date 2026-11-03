public class VacaMae extends BaseAnimal {
    private boolean temFilhotes;

    public VacaMae(String id, String nome, String raca, int idade, boolean temFilhotes) {
        super(id, nome, raca, idade);
        this.temFilhotes = temFilhotes;
    }

    @Override
    public String getEspecie() {
        return "Vaca";
    }

    @Override
    public String emitirSom() {
        return "Muuu!";
    }

    @Override
    public String coletarProduto() {
        return "Balde de Leite";
    }

    @Override
    public void exibirDetalhes() {
        String status = temFilhotes ? "Com filhotes" : "Sem filhotes";
        System.out.println("[ID: " + id + "] " + nome + " (" + getEspecie() + ")");
        System.out.println("Raça: " + raca);
        System.out.println("Idade: " + idade + " anos | Status: " + status);
        System.out.println("Som: " + emitirSom());
    }
}