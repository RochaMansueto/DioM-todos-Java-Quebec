package JavaPOO.aula4;

public class ClasseFilha2 {

    public void metodo2() {

    }

    /**
     * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
     */
    class classeFilha2 extends ClasseMae {

        @Override
        void metodo1() {
            System.out.println("Método 1 da Classe Filha 2");
        }

        @Override
        void metodo2() {
            System.out.println("Método 2 da Classe Filha 2");
        }

    }
}
