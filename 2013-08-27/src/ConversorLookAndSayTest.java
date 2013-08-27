import static org.junit.Assert.*;

import org.junit.Test;


public class ConversorLookAndSayTest {

    @Test
    public void test42() {
        assertEquals(1412,new ConversorLookAndSay().converte("42"));
    }

    @Test
    public void test755422() {
        assertEquals(17251422,new ConversorLookAndSay().converte("755422"));
    }
    
    
}
