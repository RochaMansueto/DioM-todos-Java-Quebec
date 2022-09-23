package one.digitalinnovation.basecamp;

public class Emprestimo {
    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas() {
        return 3;
    }
    public static double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void  calcular(double valor, int parcelas){
        if (parcelas == 2){
            double valorFinal = valor + (valor * getDuasParcelas());
            System.out.println(" valor final do emprestimo com duas parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {
            double valorFinal = valor + (valor * getTresParcelas());
            System.out.println(" valor final do emprestimo com três parcelas: R$ " + valorFinal);
        }else {
            System.out.println(" A quantidade de parcelas não é aceita.");
        }

    }
}
