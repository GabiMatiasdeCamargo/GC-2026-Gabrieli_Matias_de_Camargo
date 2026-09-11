public abstract class BaseAnimal implements Animal{
    protected String id;
    protected String nome;
    protected String raca;
    protected int idade;

    public BaseAnimal(String id, String nome, String raca, int idade) {
        this.id = id;
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public int getIdade() {
        return idade;
    }
}
