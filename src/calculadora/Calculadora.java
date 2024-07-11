package calculadora;

public class Calculadora {

    private double resultadoSoma;
    private double resultadoSubtracao;

    public double getSoma(){
        return resultadoSoma;
    }
    public void setSoma(double numero1, double numero2){
        this.resultadoSoma = numero1 + numero2;
    }
    public double getSubtracao() {
        return resultadoSubtracao;
    }
    public void setSubtracao(double numero1, double numero2) {
        this.resultadoSubtracao = numero1 - numero2;
    }
}
