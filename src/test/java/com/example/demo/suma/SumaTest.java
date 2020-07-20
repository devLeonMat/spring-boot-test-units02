package com.example.demo.suma;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class SumaTest {

    Suma suma = new Suma();

    @Before
    public void before(){
        System.out.println("print before");
    }

    @Test
    public void sumaTest() {
        int sumTest = suma.suma(1, 2);
        int resultadoEsperado = 3;
        assertEquals(resultadoEsperado, sumTest);
    }

    @After
    public void after(){
        System.out.println("print after");
    }


}
