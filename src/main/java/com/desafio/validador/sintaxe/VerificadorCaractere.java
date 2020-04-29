package com.desafio.validador.sintaxe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VerificadorCaractere {

    private Set<Character> caractereAbertura = new HashSet<>();
    private Set<Character> caractereFechamento = new HashSet<>();

    public VerificadorCaractere() {
        this.caractereAbertura.addAll(Arrays.asList( '{', '[', '(', '<'));
        this.caractereFechamento.addAll(Arrays.asList( '}', ']', ')', '>'));
    }

    public boolean isAbertura(Character character){
        return this.caractereAbertura.contains(character);
    }

    public boolean isFechamento(Character c) {
        return this.caractereFechamento.contains(c);
    }
}
