import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProblemaTest {

    private Problema p;

    @Before
    public void setUp() {
        this.p = new Problema(2, 3, 4);
    }

    @Test
    public void testTodosCorretos() {
        assertEquals(new Integer(0), p.avalia(2, 3, 4));
    }

    @Test
    public void testAssassinoErrado() {
        assertEquals(new Integer(1), p.avalia(1, 3, 4));
    }

    @Test
    public void testArmaErrada() {
        assertEquals(new Integer(2), p.avalia(2, 1, 4));
    }

    @Test
    public void testLocalErrado() {
        assertEquals(new Integer(3), p.avalia(2, 3, 1));
    }

    @Test
    public void testAssassinoArmaErrado() {
        assertEquals(new Integer(1), p.avalia(5, 8, 4));

    }

    @Test
    public void testArmaLocalErrado() {
        assertEquals(new Integer(2), p.avalia(2, 8, 7));
    }

    @Test
    public void testTodosErrados() {
        assertEquals(new Integer(1), p.avalia(1, 1, 1));
    }

    @Test
    public void testTodosCertosOutroProblema() {
        Problema p = new Problema(6, 7, 8);
        assertEquals(new Integer(0), p.avalia(6, 7, 8));
    }
   
}
