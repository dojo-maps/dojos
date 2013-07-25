import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DigitalTest {

    @Test
    public void deveEntender1() {
        Digital digital = new Digital();
        String digito = digital.digitoDe(1);
        assertEquals("   \n" +
        		     " | \n" +
        		     " | ", digito);
        
    }
    
//    @Test
//    public void deveEntender2(){
//        Digital digital = new Digital();
//        String digito = digital.digitoDe(2);
//        assertEquals(" _ \n" +
//                     " _|\n" +
//                     "|_ ", digito);
//    }
//
//    @Test
//    public void deveEntender12(){
//        Digital digital = new Digital();
//        String digito = digital.digitoDe(12);
//        assertEquals("    _ \n" +
//                     " |  _|\n" +
//                     " | |_ ", digito);
//    }
}
