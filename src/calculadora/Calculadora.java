package calculadora;

public class Calculadora {

    private double resultadoSoma;
    private double resultadoSubtracao;
    private double resultadoMultiplicacao;
    private double resultadoDivisao;

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
    public double getMultiplicacao() {
        return resultadoMultiplicacao;
    }
    public void setMultiplicacao(double numero1, double numero2) {
        this.resultadoMultiplicacao = numero1 * numero2;
    }
    public double getDivisao() {
        return resultadoDivisao;
    }
    public void setDivisao(double numero1, double numero2) {
        this.resultadoDivisao = numero1 / numero2;
    }
}
