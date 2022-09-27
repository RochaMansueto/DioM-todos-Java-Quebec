package JavaPOO;

public class Carro extends Veiculo {
    String cor;
    String modelo;
    int capacidadeTamque;
    // construtor

    Carro(){

    }
    Carro(String cor, String modelo, int capacidadeTamque){
        this.cor = cor;
        this.modelo = modelo;
        this.capacidadeTamque = capacidadeTamque;
    }


//get set

    void setCor(String cor){
        this.cor = cor;
    }
    String getCor(){
        return cor;
    }
    void setModelo(String modelo){
        this.modelo = modelo;
    }
    String getModelo(){
        return modelo;
    }
    void setCapacidadeTamquer(int capacidadeTamque){
        this.capacidadeTamque = capacidadeTamque;
    }
    int getCapacidadeTamque(){
        return capacidadeTamque;
    }
    double totalValorTamque(double valorCombustivel){
        return capacidadeTamque * valorCombustivel;
    }
}

