public class Carro extends Veiculo {

    public Carro(String marca, String cor, String modelo) {
        super(marca, cor, modelo);
    }

    @Override
    public float calcularTempo(float distancia) {
       float velocidade = 80.0f; 
        return distancia / velocidade;
    }
}

