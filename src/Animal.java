public class Animal {
    String nome;
    String especie;
    Dono dono;

    public Animal(String nome, String especie, Dono dono) {
        this.nome = nome;
        this.especie = especie;
        this.dono = dono;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", dono=" + dono +
                '}';
    }
}
