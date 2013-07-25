import java.util.HashMap;
import java.util.Map;


public class Algarismo {

    private Map<String,String> primeiraLinhas = new HashMap<String,String>();
    private Map<String,String> segundaLinhas = new HashMap<String,String>();
    private Map<String,String> terceiraLinhas = new HashMap<String,String>();
    
    private int numero;
    
    public Algarismo(int numero) {
        this.numero = numero;
    }
    public String getPrimeiraLinha() {
               
        return primeiraLinhas.get(numero);
    }
    public String getSegundaLinha() {
        return segundaLinhas.get(numero);
    }
    public String getTerceiraLinha() {
        return terceiraLinhas.get(numero);
    }
    
    
    
}
