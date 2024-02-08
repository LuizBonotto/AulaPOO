public class Telefone {
    String modelo;
    String marca;
    Carregador carregador;

    public Telefone(String modelo, String marca, Carregador carregador) {
        this.modelo = modelo;
        this.marca = marca;
        this.carregador = carregador;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", carregador=" + carregador +
                '}';
    }
}
