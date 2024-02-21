public class Bicicleta extends Veiculos {

    public Bicicleta(int rodas) {
        super.setRodas(rodas);
    }

    @Override
    public void acelerar() {
        System.out.println("Bicicleta Acelerando");;
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta Freando");
    }
}
