package com.diego;


/**
 * Classe que é utilizada para realizar as funções básicas de uma calculadora.
 * Através dos métodos de adição, subtração, multiplicação e divisão.
 *
 * @author Diego Teixeira
 * @version 1.0
 * @since 2023-11-07
 */
public class Calculadora {


    /**
     * Método que realiza o cálculo de adição.
     *
     * @param a O primeiro número a ser utilizado no cálculo da adição.
     * @param b O segundo número a ser utilizado no cálculo da adição.
     * @return O resultado da adição de 'a' e 'b'.
     */
    int adicionar(int a, int b) {
        return a + b;
    }


    /**
     * Método que realiza o cálculo de subtração.
     *
     * @param a O primeiro número a ser utilizado no cálculo da subtração.
     * @param b O segundo número a ser utilizado no cálculo da subtração.
     * @return O resultado da subtração de 'a' por 'b'.
     */
    int subtrair(int a, int b) {
        return a - b;
    }


    /**
     * Método que realiza o cálculo de multiplicação.
     *
     * @param a O primeiro número a ser utilizado no cálculo da multiplicação.
     * @param b O segundo número a ser utilizado no cálculo da multiplicação.
     * @return O resultado da multiplicação de 'a' por 'b'.
     */
    int multiplicar(int a, int b) {
        return a * b;
    }


    /**
     * Método que realiza a operação de divisão.
     *
     * @param a O numerador.
     * @param b O denominador. Deve ser diferente de zero.
     * @return O resultado da divisão de 'a' por 'b'.
     * @throws ArithmeticException Se 'b' for zero, uma exceção é lançada.
     */
    int dividir(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
    }


    /**
     * Método principal que demonstra o uso da classe Calculadora para realizar as operações matemáticas.
     */
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int resultadoSoma = calculadora.adicionar(5, 3);
        int resultadoSubtracao = calculadora.subtrair(8, 4);
        int resultadoMultiplicacao = calculadora.multiplicar(6, 2);


        System.out.println("Resultado da soma: " + resultadoSoma);
        System.out.println("Resultado da subtração: " + resultadoSubtracao);
        System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);

        try {
            int resultadoDivisao = calculadora.dividir(10, 2);
            System.out.println("Resultado da divisão: " + resultadoDivisao);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}