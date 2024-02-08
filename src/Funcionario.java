public class Funcionario {
    String nome;
    String cargo;
    Double salario;
    String dataAdmissao;

    Funcionario(String nome, String cargo, Double salario) {

        this(nome, cargo, salario, "inicio da empresa");
    }

    Funcionario(String nome, String cargo, Double salario, String dataAdmissao) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.dataAdmissao = dataAdmissao;
    }

    @Override
    public String toString() {
        return "\nFuncionario{" +
                "nome='" + nome + '\'' +
                ", cargo=" + cargo +
                ", salario=" + salario +
                ", dataAdmissao=" + dataAdmissao +
                '}';
    }
}
