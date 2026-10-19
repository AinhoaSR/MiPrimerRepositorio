package com.AErcilla;
import java.util.Scanner;


public class Mensaje {
    public String solicitarDatos (String mensaje){
        System.out.print(mensaje);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

    public void saludar(Persona p1) {
        System.out.printf("Hola %s, bienvenido a Java\n",p1.getNombre()+" "+p1.getApellido());
    }
}
