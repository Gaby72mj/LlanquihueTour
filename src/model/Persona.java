package model;

/**
 * Representa una persona vinculada a la agencia
 * de turismo Llanquihue Tour.
 * Contiene informacion personal y una direccion asociada.
 */
public class Persona {

    private String nombre;
    private String rut;
    private Direccion direccion;

    /**
     * Crea una persona con su nombre, rut y direccion.
     *
     * @param nombre nombre de la persona.
     * @param rut rut de la persona.
     * @param direccion direccion asociada a la persona.
     */
    public Persona(String nombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    /**
     * Obtiene el nombre de la persona.
     *
     * @return nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Modifica el nombre de la persona.
     *
     * @param nombre nuevo nombre de la persona.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el rut de la persona.
     *
     * @return rut de la persona.
     */
    public String getRut() {
        return rut;
    }
    /**
     * Modifica el rut de la persona.
     *
     * @param rut nuevo de la persona.
     */
    public void setRut(String rut) {
        this.rut = rut;
    }

    /**
     * Obtiene la direccion asociada a la persona.
     *
     * @return objeto Direccion de la persona.
     */
    public Direccion getDireccion() {
        return direccion;
    }

    /**
     * Modifica la direccion asociada a la persona.
     *
     * @param direccion nuevo objeto Direccion.
     */
    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Devuelve una representacion en texto de la persona.
     *
     * @return cadena con el nombre, rut y direccion de la persona.
     */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", rut='" + rut + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}

