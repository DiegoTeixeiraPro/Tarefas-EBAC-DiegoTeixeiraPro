package com.diego;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Classe de teste utilizada para realizar as funções básicas de uma calculadora.
 * Através dos métodos de adição, subtração, multiplicação e divisão.
 *
 * @author Diego Teixeira
 * @version 1.0
 * @since 2023-11-07
 */
public class CalculadoraTest {


    /**
     * Testa o método de adição da Calculadora.
     */
    @Test
    public void testAdicionar() {
        final Calculadora calculadora = new Calculadora();

        final int adicionar = calculadora.adicionar(20, 30);

        assertEquals(50, adicionar);
    }


    /**
     * Testa o método de subtração da Calculadora.
     */
    @Test
    public void testSubtrair() {
        final Calculadora calculadora = new Calculadora();

        final int subtrair = calculadora.subtrair(100, 20);

        assertEquals(80, subtrair);
    }


    /**
     * Testa o método de multiplicacao da Calculadora.
     */
    @Test
    public void testMultiplicar() {
        final Calculadora calculadora = new Calculadora();

        final int multiplicar = calculadora.multiplicar(4, 50);

        assertEquals(200, multiplicar);
    }


    /**
     * Testa o método de divisão da Calculadora com valores não-nulos.
     */
    @Test
    public void testDividir_HappyPath() {
        final Calculadora calculadora = new Calculadora();

        final int dividir = calculadora.dividir(40, 20);

        assertEquals(2, dividir);
    }


    /**
     * Testa o método de divisão da Calculadora com denominador zero.
     */
    @Test(expected = ArithmeticException.class)
    public void testDividir_bEhZero() {
        final Calculadora calculadora = new Calculadora();

        calculadora.dividir(10, 0);
    }
}