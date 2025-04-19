public class SerieS {
    public static void main(String[] args) {
        double soma = 0;
        int numerador = 1000;
        int sinal = 1; // Começa positivo

        for (int i = 1; i <= 50; i++) {
            soma += sinal * (numerador / (double)i);
            numerador -= 3;
            sinal *= -1; // alterna o sinal
        }

        System.out.println("Soma dos 50 primeiros termos da série: " + soma);
    }
}