package com.desafio.validador.sintaxe;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class VerificadorCaractereTest {

    @Test
    public void deveRetornarTruePqCaractereEhAbertura(){
        VerificadorCaractere verificadorCaractere = new VerificadorCaractere();

        assertTrue(verificadorCaractere.isAbertura('{'));
        assertTrue(verificadorCaractere.isAbertura('('));
        assertTrue(verificadorCaractere.isAbertura('['));
        assertTrue(verificadorCaractere.isAbertura('<'));
    }

    @Test
    public void deveRetornarTruePqCaractereEhFechamento(){
        VerificadorCaractere verificadorCaractere = new VerificadorCaractere();

        assertTrue(verificadorCaractere.isFechamento('}'));
        assertTrue(verificadorCaractere.isFechamento(')'));
        assertTrue(verificadorCaractere.isFechamento(']'));
        assertTrue(verificadorCaractere.isFechamento('>'));
    }
}
