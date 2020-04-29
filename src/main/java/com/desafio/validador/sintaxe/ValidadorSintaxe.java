package com.desafio.validador.sintaxe;

import java.util.Stack;

public class ValidadorSintaxe {

    private Stack<Character> stack;
    private VerificadorCaractere verificadorCaractere;

    public ValidadorSintaxe() {
        this.stack = new Stack<>();
        this.verificadorCaractere = new VerificadorCaractere();
    }

    public boolean valida(String frase){
        for(char caractere : frase.toCharArray()){
            if(verificadorCaractere.isAbertura(caractere)){
               stack.push(caractere);
            }
        }
        return true;
    }
}
