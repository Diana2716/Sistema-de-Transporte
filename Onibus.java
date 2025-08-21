public class Onibus extends Veiculo {

        private int numeroParadas;

        public Onibus(String marca, String cor, String modelo, int numeroParadas) {
            super(marca, cor, modelo);
            this.numeroParadas = numeroParadas;
        }

        @Override
        public float calcularTempo(float distancia) {
            float velocidade = 60.0f; // km/h
            float tempo = distancia / velocidade; // horas
            float tempoParadas = (float) ((numeroParadas * 15.0f) / 80.0f); // converte 15min em horas
            return tempo + tempoParadas;
        }
    }
