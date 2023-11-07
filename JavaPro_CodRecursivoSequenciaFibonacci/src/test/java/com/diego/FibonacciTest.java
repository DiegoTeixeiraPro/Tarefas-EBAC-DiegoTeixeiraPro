package com.diego;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FibonacciTest {

    @Test
    public void testEncontrarElementoPD_NumeroPeq() {
        long resultado = Fibonacci.encontrarElementoPD(1);
        assertEquals(1, resultado);
    }


    @Test
    public void testEncontrarElementoPD_NumeroMed() {
        long resultado = Fibonacci.encontrarElementoPD(10);
        assertEquals(55, resultado);
    }


    @Test
    public void testEncontrarElementoPD_NumeroGrande() {
        long resultado = Fibonacci.encontrarElementoPD(60);
        assertEquals(1548008755920L, resultado);
    }
}