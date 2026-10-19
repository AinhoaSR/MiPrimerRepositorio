package com.AErcilla;

public class HolaMundo {
    public static void main(String[] args) {
        Mensaje msg = new Mensaje();
        String nombre = msg.solicitarDatos("Escribe tu nombre: ");
        String apellido = msg.solicitarDatos("Escribe tu apellido: ");
        Persona p1 = new Persona(nombre,apellido);
        msg.saludar(p1);
    }
}
