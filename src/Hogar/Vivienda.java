/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 * @author paqui
 */
public class Vivienda {

    private double precio;
    private int numHabitaciones;
    private double superficie;
    private boolean parking;
    private String estado;
    private String propietario;

    // Constructor que recibe todos los parámetros
    public Vivienda(double precio, int numHabitaciones, double superficie, boolean parking, String estado, String propietario) {
        this.precio = precio;
        this.numHabitaciones = numHabitaciones;
        this.superficie = superficie;
        this.parking = parking;
        this.estado = estado;
        this.propietario = propietario;
    }


	public Vivienda(double precio) {
		this.precio = precio;
	}

	// Getter y Setter para precio
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	// Getter y Setter para numHabitaciones
	public int getNumHabitaciones() {
		return numHabitaciones;
	}

	public void setNumHabitaciones(int numHabitaciones) {
		this.numHabitaciones = numHabitaciones;
	}

	// Getter y Setter para superficie
	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	// Getter y Setter para parking
	public boolean tieneParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	// Getter y Setter para estado
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	// Getter y Setter para propietario
	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	// Método para actualizar el precio
    public void actualizarPrecio(double descuento) {
        if (descuento >= 0 && descuento <= 100) {
            precio = precio - precio * (descuento / 100);
        } else {
            System.out.println("El descuento debe ser un porcentaje válido entre 0 y 100.");
        }
    }
}
