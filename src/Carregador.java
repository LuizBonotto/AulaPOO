public class Carregador {
    String tipo;
    String voltagem;
    String amperagem;

    public Carregador(String tipo, String voltagem, String amperagem) {
        this.tipo = tipo;
        this.voltagem = voltagem;
        this.amperagem = amperagem;
    }

    @Override
    public String toString() {
        return "Carregador{" +
                "tipo='" + tipo + '\'' +
                ", voltagem='" + voltagem + '\'' +
                ", amperagem='" + amperagem + '\'' +
                '}';
    }
}
