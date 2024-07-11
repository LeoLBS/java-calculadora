package calculadora;

import java.util.Scanner;

public class PainelCalculadora {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner recebe = new Scanner(System.in);

        int opcao;
        double numero1;
        double numero2;

        do {
            System.out.println("CALCULADORA");

            System.out.println("Escolha uma opção: 1 - Soma  2 - Subtração  0 - Sair");
            opcao = recebe.nextInt();

            switch (opcao){
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
            }

        }while (opcao != 0);
    }
}
