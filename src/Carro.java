public class Carro extends Veiculos {
    String marca;
    String modelo;

    Carro(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    public Carro(int rodas) {
        super.setRodas(rodas);
    }

    public String toString() {
        return "\nCarro{" +
                "marca='" + marca + '\'' +
                ", modelo=" + modelo +
                '}';
    }

    @Override
    public void acelerar() {
        System.out.println("Carro Acelerando");
    }

    @Override
    public void frear() {
        System.out.println("Carro Freando");
    }


}
