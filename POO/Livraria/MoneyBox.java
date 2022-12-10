package Livraria;

public class MoneyBox {
    private double valorTotal = 0.0;
    private double valorDesconto = 0.0;

    public double getValorTotal() {
        return valorTotal;
    }

    public void addValor(double valor) {
        this.valorTotal = valorTotal + valor;
    }
    
    public double getValorDesconto(){
        valorDesconto = valorTotal * 0.85;
        return valorDesconto;
    }

    public void resetValues(){
        valorTotal = 0.0;
        valorDesconto = 0.0;
    }
    
}
