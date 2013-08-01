public class Palavra {

    private static final int INICIO_MINUSCULA = 96;
    private static final int INICIO_MAIUSCULA = 31;
    private String palavra;

    public Palavra(String palavra) {
        this.palavra = palavra;
    }

    public boolean prima() {
        return isPrimo(valorPalavra());
    }

    private boolean isPrimo(int soma) {
        for (int i = 2; i <= soma / 2; i++) {
            if (soma % i == 0) {
                return false;
            }
        }
        return true;
    }

    private int valorPalavra() {
        int soma = 0;
        for (final char c : palavra.toCharArray()) {
            if (isMaiuscula(c)) {
                soma += c - INICIO_MAIUSCULA;
            } else {
                soma += c -INICIO_MINUSCULA;
            }
        }
        return soma;
    }

    private boolean isMaiuscula(char c) {
        return c <= 90;
    }

}
