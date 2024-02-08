import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("GM", "Corsa");
        Carro carro2 = new Carro("Fiat", "Bravo");
        Carro carro3 = new Carro("Ssangyong", "Rexton");
        Carro carro4 = new Carro("Chevrolet", "Camaro");

        ArrayList<Carro> carros = new ArrayList<Carro>();
        carros.add(carro);
        carros.add(carro2);
        carros.add(carro3);
        carros.add(carro4);

        System.out.println(carros);

        Funcionario funcionario = new Funcionario("Luiz", "Tecnico",3500.50);
        Funcionario funcionario2 = new Funcionario("Gabriel", "Tecnólogo",4500.25, "01/08/2019");

        ArrayList<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(funcionario);
        funcionarios.add(funcionario2);

        System.out.println(funcionarios);

        Produto produto = new Produto("Goiaba", "Fruta da Goiabeira",1.50);
        Produto produto2 = new Produto("Limão", "Azedo que só",0.75, 350);

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(produto2);

        System.out.println(produtos);

        /*
        * Livro e Autor
        Crie duas classes: Livro e Autor. A classe Livro deve ter os atributos titulo, editora e autor. A classe Autor
        * deve ter os atributos nome, nacionalidade e dataNascimento.


        Animal e Dono
        Crie duas classes: Animal e Dono. A classe Animal deve ter os atributos nome, especie e dono. A classe Dono deve
        *  ter os atributos nome, cpf e telefone.


        Telefone e Carregador
        Crie duas classes: Telefone e Carregador. A classe Telefone deve ter os atributos modelo, marca e um objeto Carregador.
        * A classe Carregador deve ter os atributos tipo, voltagem e amperagem.
        */
        System.out.printf("\nAula: objeto dentro de objeto:\n\n");
        System.out.println("\nExercicio1: Livro e Autor");
        Autor autor = new Autor("Luiz Gabriel", "Brasileiro", "05/05/1996");
        Livro livroBom = new Livro("A volta dos que não foram", "Boa Editora", autor);
        System.out.println(livroBom);
        System.out.println("\nExercicio2: Animal e Dono");
        Dono donoDoRex = new Dono("Luizão","016.907.541-92", "(48) 99804-9791");
        Animal animal = new Animal("Rex", "Pastor Alemão", donoDoRex);
        System.out.println(animal);
        System.out.println("\nExercicio3: Telefone e Carregador");
        Carregador carregador = new Carregador("Tomada","220V", "2,5A");
        Telefone telefone = new Telefone("S10", "Sansung Alemão", carregador);
        System.out.println(telefone);


    }
}