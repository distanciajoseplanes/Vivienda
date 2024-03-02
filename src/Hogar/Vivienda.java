package Hogar;

/**
 * La clase Vivienda representa una unidad habitacional con atributos como precio,
 * número de habitaciones, superficie, disponibilidad de parking, estado y propietario.
 *
 * @author paqui
 */
public class Vivienda {

	private double precio;
	private int numHabitaciones;
	private double superficie;
	private boolean parking;
	private String estado;
	private String propietario;

	/**
	 * Constructor que inicializa una instancia de Vivienda con todos los parámetros.
	 *
	 * @param precio        El precio de la vivienda.
	 * @param numHabitaciones Número de habitaciones en la vivienda.
	 * @param superficie    La superficie de la vivienda en metros cuadrados.
	 * @param parking       Indica si la vivienda tiene estacionamiento.
	 * @param estado        El estado actual de la vivienda.
	 * @param propietario   El propietario de la vivienda.
	 */
	public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
		this.precio = precio;
		this.numHabitaciones = numHabitaciones;
		this.superficie = superficie;
		this.parking = parking;
		this.estado = estado;
		this.propietario = propietario;
	}

	/**
	 * Constructor alternativo que inicializa una instancia de Vivienda con el precio.
	 *
	 * @param precio El precio de la vivienda.
	 */
	public Vivienda(double precio) {
		this.precio = precio;
	}

	// Getter y Setter para precio

	/**
	 * Obtiene el precio de la vivienda.
	 *
	 * @return El precio de la vivienda.
	 */
	public double getPrecio() {
		return precio;
	}

	/**
	 * Establece el precio de la vivienda.
	 *
	 * @param precio El nuevo precio de la vivienda.
	 */
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Getter y Setter para numHabitaciones

	/**
	 * Obtiene el número de habitaciones de la vivienda.
	 *
	 * @return El número de habitaciones de la vivienda.
	 */
	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	/**
	 * Establece el número de habitaciones de la vivienda.
	 *
	 * @param numHabitaciones El nuevo número de habitaciones de la vivienda.
	 */
	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	// Getter y Setter para superficie

	/**
	 * Obtiene la superficie de la vivienda en metros cuadrados.
	 *
	 * @return La superficie de la vivienda.
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * Establece la superficie de la vivienda en metros cuadrados.
	 *
	 * @param superficie La nueva superficie de la vivienda.
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	// Getter y Setter para parking

	/**
	 * Verifica si la vivienda tiene estacionamiento.
	 *
	 * @return true si la vivienda tiene estacionamiento, false en caso contrario.
	 */
	public boolean tieneParking() {
		return parking;
	}

	/**
	 * Establece la disponibilidad de estacionamiento de la vivienda.
	 *
	 * @param parking true si la vivienda tiene estacionamiento, false en caso contrario.
	 */
	public void setParking(boolean parking) {
		this.parking = parking;
	}

	// Getter y Setter para estado

	/**
	 * Obtiene el estado actual de la vivienda.
	 *
	 * @return El estado actual de la vivienda.
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * Establece el estado actual de la vivienda.
	 *
	 * @param estado El nuevo estado de la vivienda.
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}

	// Getter y Setter para propietario

	/**
	 * Obtiene el propietario de la vivienda.
	 *
	 * @return El propietario de la vivienda.
	 */
	public String getPropietario() {
		return propietario;
	}

	/**
	 * Establece el propietario de la vivienda.
	 *
	 * @param propietario El nuevo propietario de la vivienda.
	 */
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	/**
	 * Actualiza el precio de la vivienda aplicando un descuento proporcionado como porcentaje.
	 *
	 * @param descuento El porcentaje a restar del precio actual.
	 */
	public void actualizarPrecio(double descuento) {
		if (descuento >= 0 && descuento <= 100) {
			precio = precio - precio * (descuento / 100);
		} else {
			System.out.println("El descuento debe ser un porcentaje válido entre 0 y 100.");
		}
	}
}
