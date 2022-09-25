package EstruturasExcepcionais;

public class FormatCepExemplo {
    String cepFormat;

    {
        try {
            cepFormat = formatCep();
            System.out.println(cepFormat);
        } catch (CepInvalidoException e) {
            throw new RuntimeException(e){
                //  e.printStackTrace();
            };
        }
    }

     static String formatCep() throws CepInvalidoException{
         throw new CepInvalidoException();

        //simulando um cep formatado
     }
}

