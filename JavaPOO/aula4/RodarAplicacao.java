package JavaPOO.aula4;

public class RodarAplicacao {
    /**
     * Classe de exemplo para o exercício da Aula 4 de Orientação a Objetos.
     */
    class rodarAplicacao {
        public static void main(String[] args) {

            ClasseMae[] classes = new ClasseMae[]{new ClasseFilha1(), new ClasseMae() {
                @Override
                void metodo1() {

                }

                @Override
                void metodo2() {

                }
            }, new ClasseMae() {
                @Override
                void metodo1() {

                }

                @Override
                void metodo2() {

                }
            }};

            for (ClasseMae classe: classes) {
                classe.metodo1();
            }

            System.out.println("");

            for (ClasseMae classe: classes) {
                classe.metodo2();
            }

            System.out.println("");

            ClasseFilha2 classeFilha2 = new ClasseFilha2();
            classeFilha2.metodo2();
        }

    }
}
