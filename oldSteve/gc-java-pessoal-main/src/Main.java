public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.color = "Laranja";
        cat.name = "Lulu";
        cat.age = 3;

        System.out.println("Cor: " + cat.color);
        System.out.println("Nome: " + cat.name);
        System.out.println("Idade: " + cat.age);

        cat.meow();
    }
}