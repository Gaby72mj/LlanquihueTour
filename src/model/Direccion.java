package model;

/**
 * Representa una direccion asociada a una persona
 * de la agencia de turismo Llanquihue Tour
 */
public class Direccion {

    private String calle;
    private String ciudad;

    /**
     * Crea una direccion con su calle y ciudad.
     *
     * @param calle nombre de la calle y numero.
     * @param ciudad nombre de la ciudad.
     */

    public Direccion(String calle, String ciudad) {
        this.calle = calle;
        this.ciudad = ciudad;
    }

    /**
     * Obtiene el nombre de la calle.
     *
     * @return nombre de la calle.
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Modifica el nombre de la calle.
     *
     * @param calle nuevo nombre de la calle.
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * Obtiene el nombre de la ciudad.
     *
     * @return nombre de la ciudad.
     */
    public String getCiudad() {
        return ciudad;
    }

    /**
     * Modifica el nombre de la ciudad.
     *
     * @param ciudad nuevo nombre de la ciudad.
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Devuelve una representacion en texto de la direccion.
     *
     * @return cadena con los datos de la calle y ciudad.
     */
    @Override
    public String toString() {
        return "Direccion{" +
                "calle='" + calle + '\'' +
                ", ciudad='" + ciudad + '\'' +
                '}';
    }

}
