public class Pintinho extends GalinhaMae {
    public Pintinho(String id, String nome, String raca, int idade) {
        super(id, nome, raca, idade, false);
    }

    @Override
    public String emitirSom() {
        return "Piu-piu!";
    }

    @Override
    public String coletarProduto() {
        return "Filhotes não põem ovos";
    }
}