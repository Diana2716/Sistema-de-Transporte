public class Main {

    public static void main(String[] args) {
        float distancia = 100.0f;

        Carro carro = new Carro("Hyundai", "Preto", "HB20");
        Bicicleta bike = new Bicicleta("Caloi", "Vermelha", "Speed");
        Onibus onibus = new Onibus("Mercedes", "Branco", "Urbano", 3);

        Veiculo[] veiculos = {carro, bike, onibus};

        for (Veiculo v : veiculos) {
            float tempo = v.calcularTempo(distancia);
            System.out.println(v.modelo + " (" + v.marca + ") leva " + tempo + " horas para percorrer " + distancia + " km.");
            System.out.println();
        }
    }
}