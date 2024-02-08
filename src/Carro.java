public class Carro {
    String marca;
    String modelo;

    Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public String toString() {
        return "\nCarro{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                '}';
    }
}
