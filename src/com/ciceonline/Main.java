package com.ciceonline;

import com.ciceonline.interfaces.FuncionalInterfaceExample;

public class Main {

    public static void main(String[] args) {

/**
 * Hacemos una implementacion de la interfaz funtional definiendo su método abstracto mediante
 * expresión lambda.
 * En la segunda linea imprimimos el método ya definido, pasándole su parámetro de entrada.
  */
        FuncionalInterfaceExample funtional = (nombre) -> ("hola "+nombre);
        System.out.println(funtional.saludar("Carlos"));
    }
}
