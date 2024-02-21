public class Veiculos {
    private int rodas;

    public int getRodas() {
        return rodas;
    }

    public void setRodas(int rodas) {
        this.rodas = rodas;
    }

    public void acelerar () {
        System.out.println("Veículo acelerando");
    }
    public void frear () {
        System.out.println("Veículo freando");
    }

    public void quantasRodas () {
        System.out.println("O veiculo tem" + this.rodas + " rodas");
    }
}
