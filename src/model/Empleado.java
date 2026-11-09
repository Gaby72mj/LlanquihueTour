package model;

/**
 * Representa a un empleado de la agencia Llanquihue Tour.
 * Hereda los datos personales de la clase Persona
 * y agrega informacion laboral como cargo y sueldo.
 */
public class Empleado extends Persona {

    private String cargo;
    private double sueldo;

    /**
     * Crea un empleado con sus datos personales y laborales.
     *
     * @param nombre nombre del empleado.
     * @param rut rut del empleado.
     * @param direccion direccion asociada al empleado.
     * @param cargo cargo que desempeña el empleado.
     * @param sueldo sueldo del empleado.
     */
    public Empleado(String nombre, String rut, Direccion direccion,
                    String cargo, double sueldo) {
        super(nombre, rut, direccion);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el cargo del empleado.
     *
     * @return cargo del empleado.
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * Modifica el cargo del empleado.
     *
     * @param cargo nuevo cargo del empleado.
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * Obtiene el sueldo del empleado.
     *
     * @return sueldo del empleado.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Modifica el sueldo del empleado.
     *
     * @param sueldo nuevo sueldo del empleado.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Devuelve una representacion en texto del empleado.
     * Incluye los datos heredados de Persona y los datos laborales.
     *
     * @return cadena con la informacion completa del empleado.
     */
    @Override
    public String toString() {
        return "Empleado{" +
                "persona=" + super.toString() +
                ", cargo='" + cargo + '\'' +
                ", sueldo=" + sueldo +
                '}';
    }
}

