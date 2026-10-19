package com.AErcilla;

public record PersonaRegistro(String nombre, String apellido){
    public String toString(){
        //Esta instrucción esinservible,
        //System.out.println("Esta instrucción es inservible");
        return "%s %s".formatted(nombre, apellido);
    }
}
