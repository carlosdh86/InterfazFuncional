package com.ciceonline.interfaces;

/**
 * Esta es una interfaz funcional, se especifica mediante @FunctionalInterface y para que sea válida
 * debe tener solo un método abastracto(sin definir) y todos los métodos por defecto (definidos)
 * que queramos, o ninguno. En este caso el método abstracto es saludar y el método por defecto
 * es despedirse. Si hay métodos por defecto, deben indicarse con default al comienzo.
 */

@FunctionalInterface
public interface FuncionalInterfaceExample {

    String saludar(String nombre);

    default public String despedirse(String nombre) {
        return "Adios "+nombre;
    }
}
