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

        /*
        Exercício 1: Modificador Private e Encapsulamento
        Crie uma classe Produto com um atributo preco privado. Adicione métodos públicos para acessar e modificar esse atributo,
        garantindo que o preço não possa ser negativo.
        Exercício 2: Encapsulamento Avançado
        Crie uma classe ContaBancaria com os seguintes atributos privados: saldo (double) e senha (String). A classe deve ter
        métodos públicos para depositar e sacar dinheiro, mas o acesso à senha deve ser restrito apenas à própria classe
        ContaBancaria. Adicione um método público para alterar a senha.
        Exercício 3: Pacotes e Modificadores de Acesso
        Crie dois pacotes diferentes: com.projeto.utils e com.projeto.aplicacao. Na pasta utils, crie uma classe chamada Utils
        com um método público imprimirMensagem(). Na pasta aplicacao, crie uma classe Principal e tente acessar o método
        imprimirMensagem() da classe Utils.
         */

        ContaBancaria conta1 = new ContaBancaria(1000,"1234");
        conta1.alteraSenha("5678");

        /*
        Exercício 1: Hierarquia de Veículos
        Crie uma hierarquia de classes representando diferentes tipos de “Veiculos” esta classe servirá como base e terá
        os métodos acelerar e frear. Depois crie subclasses como Carro, Moto e Bicicleta. Cada subclasse deverá
        sobrescrever os métodos da superclasse.(Podem utilizar apenas mensagens na implementação dos método
        específicos, como “Frear bicicleta ou acelerar carro”). Em seguida, crie uma classe principal que demonstre o
        polimorfismo chamando os métodos de cada tipo de veículo usando a referência da superclasse.

        Exercício 2: Sistema de Funcionários
        Usando como base o conhecimento adquirido no exercício anterior. Crie uma hierarquia de classes para representar
        diferentes tipos de funcionários, como FuncionarioBase, Gerente e Diretor. Cada classe deve ter métodos como
        calcularSalario() e exibirDetalhes(). Em seguida, crie uma classe principal que demonstre o polimorfismo ao
        calcular os salários e exibir os detalhes de diferentes tipos de funcionários. A implementação dos métodos da
        subclasse fica a seu critério.

        Exercício 3: Animal e Doméstico
        Crie uma classe Animal com métodos como comer() e emitirSom(). Em seguida, crie uma classe Domestico que herda
        de Animal e tenha métodos adicionais, como dormir() e brincar(). Finalmente, crie uma classe principal que
        demonstre o polimorfismo ao chamar métodos de diferentes tipos de animais e animais domésticos.  A
        implementação dos métodos da subclasse fica a seu critério.

         */

        Carro carro5 = new Carro(4);
        carro5.acelerar();
        carro5.quantasRodas();

        Bicicleta bicicleta = new Bicicleta(2);
        bicicleta.frear();
        bicicleta.quantasRodas();

    }
}