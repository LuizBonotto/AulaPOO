import java.sql.PreparedStatement;

public class ContaBancaria {
    private double saldo;
    private String senha;

    public ContaBancaria(double saldo, String senha) {
        this.saldo = saldo;
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    protected String getSenha() {
        return senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    public void sacar (double valor) {
        if (valor <= getSaldo()){
            setSaldo(getSaldo() - valor);
        }
    }

    public void depositar (double valor) {
        setSaldo(getSaldo() + valor);
    }
    public void alteraSenha (String novaSenha) {
        System.out.printf("Senha antiga:");
        System.out.println(getSenha());
        setSenha(novaSenha);
        System.out.printf("Nova Senha:");
        System.out.println(getSenha());
        System.out.println("Senha com sucesso");
    }
}
