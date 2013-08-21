public class Problema {

    private int assassino;

    private int arma;

    private int local;

    public Problema(int assassino, int arma, int local) {
        this.assassino = assassino;
        this.arma = arma;
        this.local = local;

    }

    public Integer avalia(int assassino, int arma, int local) {
        if (assassino != this.assassino) {
            return 1;
        } else if (arma != this.arma) {
            return 2;
        } else if (local != this.local) {
            return 3;
        }
        return 0;
    }

}
