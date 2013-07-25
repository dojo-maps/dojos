public class Digital {

    public String digitoDe(int numero) {
        String numeroString = String.valueOf(numero);
        char[] charArray = numeroString.toCharArray();
        String primeiraLinha = "";
        String segundaLinha = "";
        String terceiraLinha = "";
        
        for (char c : charArray) {
            Algarismo algarismo = new Algarismo(c);
            primeiraLinha += algarismo.getPrimeiraLinha();
            segundaLinha += algarismo.getSegundaLinha();
            terceiraLinha += algarismo.getTerceiraLinha();            
        }
        return primeiraLinha + "\n" + segundaLinha + "\n" + terceiraLinha;
    }

}
