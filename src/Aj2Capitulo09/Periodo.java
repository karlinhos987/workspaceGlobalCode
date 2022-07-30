package Aj2Capitulo09;

//ExemploP199_01
public enum Periodo {
	DIURNO_INTEGRAL("Seg a Sex", 10, 18),
	DIURNO_MATUTINO("Seg a Sex", 8, 12),
	NOTURNO ("Seg a Sex", 19, 23);
	
	private String dias;
	private int horaInicio;
	private int horaTermino;
	
	private Periodo(String dias, int horaInicio, int horaTermino) {
		this.dias = dias;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
	}

	public String getDias() {
		return dias;
	}

	public void setDias(String dias) {
		this.dias = dias;
	}

	public int getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(int horaInicio) {
		this.horaInicio = horaInicio;
	}

	public int getHoraTermino() {
		return horaTermino;
	}

	public void setHoraTermino(int horaTermino) {
		this.horaTermino = horaTermino;
	}
}
