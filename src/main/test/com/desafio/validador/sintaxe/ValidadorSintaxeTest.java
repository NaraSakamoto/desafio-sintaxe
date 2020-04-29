package com.desafio.validador.sintaxe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidadorSintaxeTest {

    @Test
    public void deveValidarPqSintaxeSimplesEhCorreta(){
        ValidadorSintaxe validadorSintaxe = new ValidadorSintaxe();

        boolean isValida = validadorSintaxe.valida("{}");

        assertTrue(isValida);
    }

    @Test
    public void deveInvalidarPqSintaxeSimplesEhIncorreta(){
        ValidadorSintaxe validadorSintaxe = new ValidadorSintaxe();

        boolean isValida = validadorSintaxe.valida("{");

        assertFalse(isValida);
    }
}
