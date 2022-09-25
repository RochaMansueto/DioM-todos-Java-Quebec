//Vamos imaginar que precisamos realizar de duas maneiras, a conversão de uma String para um número,
// porém o texto contém Alfanuméricos.

package EstruturasExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) throws ParseException {
        //Number valor = Double.valueOf("a1.75");
        //  System.out.println(valor);

       Number valor = NumberFormat.getInstance().parse("a1.75");

        System.out.println(valor);
    }
}
