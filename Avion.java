import java.util.Vector;

public class Avion {
	private String modelo;
	private String nombre;
	private Aeropuerto aeropuerto;
	private Vector<Vuelo> vuelos = new Vector<Vuelo>();

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}