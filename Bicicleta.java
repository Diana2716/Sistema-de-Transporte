public class Bicicleta extends Veiculo {

        public Bicicleta(String marca, String cor, String modelo) {
            super(marca, cor, modelo);
        }

        @Override
        public float calcularTempo(float distancia) {
            float velocidade = 20.0f;
            return distancia / velocidade;
        }
}

