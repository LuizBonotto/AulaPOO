public class Autor {
    String nome;
    String nacionalidade;
    String dataDeNascimenoto;

    public Autor(String nome, String nacionalidade, String dataDeNascimenoto) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.dataDeNascimenoto = dataDeNascimenoto;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", dataDeNascimenoto='" + dataDeNascimenoto + '\'' +
                '}';
    }
}
