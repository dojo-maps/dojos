import org.junit.Test;
import static org.junit.Assert.*;

public class PalavraTest {

    @Test
    public void testaPalavra_a_EhPrima() {
        assertTrue(new Palavra("a").prima());
    }

    @Test
    public void testaPalavra_d_NaoEhPrima() {
        assertFalse(new Palavra("d").prima());
    }

    @Test
    public void testaPalavra_f_NaoEhPrima() {
        assertFalse(new Palavra("f").prima());
    }

    @Test
    public void testaPalavra_af_ehPrima() {
        assertTrue(new Palavra("af").prima());
    }

    @Test
    public void testaPalavra_ac_NaoehPrima() {
        assertFalse(new Palavra("ac").prima());
    }

    @Test
    public void testaPalavra_A_NaoehPrima() {
        assertFalse(new Palavra("A").prima());
    }
    
    @Test
    public void testaPalavra_fuiNoMatoCataCoquinho_ehPrima() {
        assertTrue("ERRO!!!!!!!!",new Palavra("fuiNoMatoCataCoquinho").prima());
    }

}
