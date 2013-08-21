public class Detetive {

    public String encontraAssassino(Problema p) {
        boolean foiKnuth = p.avalia(1, 7, 8) != 1;
        boolean foiBabbage = p.avalia(2, 7, 8) != 1;
        if (foiKnuth) {
            return "Knuth";
        }
        else if (foiBabbage){
            return "Babbage";    
        }
        return "Turing";        
    }

}
