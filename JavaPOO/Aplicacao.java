package JavaPOO;

public class Aplicacao {
    public static void main(String[] args){

        Carro carro1 = new Carro();
        carro1.setCor("azul");
        carro1.setModelo("BMW serie 3");
        carro1.setCapacidadeTamquer(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTamque());
        System.out.println(carro1.totalValorTamque(6.39));

        Carro carro2 = new Carro( "vermelho", "Mercedes-Benz Classe C",66);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTamque());
        System.out.println(carro2.totalValorTamque(6.39));
    }
}
