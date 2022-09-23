package one.digitalinnovation.basecamp;

public class Calculadora {
    public static void soma(double numero1, double numero2) {
        double resultado = numero1 + numero2;
        System.out.println("A soma de " + numero1 + " mais " + numero2 + " é " + resultado);
    }

    public static void subitracao(double numero1, double numero2) {
        double resultado = numero1 - numero2;
        System.out.println("A subitração de " + numero1 + " menos " + numero2 + " é " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) {
        double resultado = numero1 * numero2;
        System.out.println("A Multiplicaçao de " + numero1 + " vezes " + numero2 + " é " + resultado);
    }

    public static void divisao(double numero1, double numero2) {
        double resultado = numero1 / numero2;
        System.out.println("A Divisão de " + numero1 + " dividido " + numero2 + " é " + resultado);
    }
}
