package com.example.demo.suma;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class SumaTest {

    Suma suma = new Suma();

    @Test
    public void sumaTest() {
        int sumTest = suma.suma(1, 2);
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, sumTest);
    }


}
