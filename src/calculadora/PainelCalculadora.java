package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PainelCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner recebe = new Scanner(System.in);

        int opcaoEscolha;
        double numero1;
        double numero2;
    try {
        do {
            System.out.println("CALCULADORA");

            System.out.println("Escolha uma opção: 1 - Soma  2 - Subtração  3 - Multiplicação  4 - Divisão  0 - Sair");
            opcaoEscolha = recebe.nextInt();

            switch (opcaoEscolha) {
                case 1:
                    System.out.println("Qual o seu primeiro número: ");
                    numero1 = recebe.nextDouble();
                    System.out.println("Qual o seu segundo número: ");
                    numero2 = recebe.nextDouble();

                    calculadora.setSoma(numero1, numero2);

                    System.out.println("Resultado da sua soma foi de: " + calculadora.getSoma());
                    break;
                case 2:
                    System.out.println("Qual o seu primeiro número: ");
                    numero1 = recebe.nextDouble();
                    System.out.println("Qual o seu segundo número: ");
                    numero2 = recebe.nextDouble();

                    calculadora.setSubtracao(numero1, numero2);

                    System.out.println("Resultado da sua subtração foi de: " + calculadora.getSubtracao());
                    break;
                case 3:
                    System.out.println("Qual o seu primeiro número: ");
                    numero1 = recebe.nextDouble();
                    System.out.println("Qual o seu segundo número: ");
                    numero2 = recebe.nextDouble();

                    calculadora.setMultiplicacao(numero1, numero2);

                    System.out.println("Resultado da sua multiplicação foi de: " + calculadora.getMultiplicacao());
                    break;
                case 4:
                    System.out.println("Qual o seu primeiro número: ");
                    numero1 = recebe.nextDouble();
                    System.out.println("Qual o seu segundo número: ");
                    numero2 = recebe.nextDouble();

                    calculadora.setDivisao(numero1, numero2);

                    System.out.println("Resultado da sua multiplicação foi de: " + calculadora.getDivisao());
                    break;
            }

        } while (opcaoEscolha != 0);
    }catch (InputMismatchException e){
        System.out.println("Valor informado é invalido, para o calculo ser realizar deve ser informado números! Tipo de erro para analise: " + e);
    }
    }
}
