import java.util.Vector;

public class Vuelo {
	private Object horaSalida;
	private Object horaVuelta;
	private Avion avion;
	private Vector<Pasajero> pasajeros = new Vector<Pasajero>();
	private Ciudad ciudadOrigen;
	private Ciudad ciudadDestino;
	public Piloto unnamed_Piloto_;

	public void getHoraSalida() {
		return this.horaSalida;
	}

	public void setHoraSalida(Object horaSalida) {
		this.horaSalida = horaSalida;
	}

	public void getHoraVuelta() {
		return this.horaVuelta;
	}

	public void setHoraVuelta(Object horaVuelta) {
		this.horaVuelta = horaVuelta;
	}
}