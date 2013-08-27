public class ConversorLookAndSay {

    public Object converte(String numero) {
        int contador = 0;
        char valor = 0;
        String resultado = "";
        char[] charArray = numero.toCharArray();
        valor = charArray[0];
        for (int posicao = 0; posicao < charArray.length; posicao++) {
            if (valor == charArray[posicao]) {
                contador++;
            } else {
                resultado += "" + String.valueOf(contador);
                resultado += "" + valor;
                contador = 0;
                if(posicao < charArray.length - 1){
                    valor = charArray[posicao + 1];
                }                
            }
        }
        return Integer.valueOf(resultado);
    }

}
