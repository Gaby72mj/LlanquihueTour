package app;

import model.Direccion;
import model.Persona;
import model.Empleado;

/**
 * Clase principal de la aplicacion Llanquihue Tour.
 * Permite crear y mostrar objetos de las clases
 * Direccion, Persona y Empleado.
 */
public class Main {

    /**
     * Ejecuta la aplicacion y muestra los datos
     * de las personas y empleados registrados.
     *
     * @param args argumentos de la linea de comandos.
     */
    public static void main(String[] args) {

        Direccion direccion1 = new Direccion("Los soles 574", "Saturno");

        Persona persona1 = new Persona("Katerina Scott", "14387091-5", direccion1);

        Empleado empleado1 = new Empleado(
                "Ayrin Basques", "32186273-0", direccion1,
                "Guia turistico", 850000.0);

        System.out.println(direccion1);
        System.out.println(persona1);
        System.out.println(empleado1);
    }
}
