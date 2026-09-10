public class Bezerro extends VacaMae {
    public Bezerro(String id, String nome, String raca, int idade) {
        super(id, nome, raca, idade, false);
    }

    @Override
    public String coletarProduto() {
        return "Filhotes ainda não produzem leite";
    }
}