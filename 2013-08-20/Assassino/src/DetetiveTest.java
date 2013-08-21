import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class DetetiveTest {
    
    @Test
    public void solucionaAssassinoKnuth() {
        Detetive d = new Detetive();
        Problema p = new Problema(1, 7, 8);
        assertEquals("Knuth", d.encontraAssassino(p));
    }

    @Test
    public void solucionaAssassinoBabbage() {
        Detetive d = new Detetive();
        Problema p = new Problema(2, 7, 8);
        assertEquals("Babbage", d.encontraAssassino(p));
    }
    
    @Test
    public void solucionaAssassinoTuring() {
        Detetive d = new Detetive();
        Problema p = new Problema(3, 7, 8){ 
            public Integer avalia(int assassino, int arma, int local) {
                return 1;
            }
        };
        assertEquals("Turing", d.encontraAssassino(p));
    }
}
