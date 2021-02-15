package program;

public class Auto {
	
	private String marca;
	private String patente;
	
	
	public Auto() {
		super();
	}


	public Auto(String marca, String patente) {
		super();
		this.marca = marca;
		this.patente = patente;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getPatente() {
		return patente;
	}


	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	
	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", patente=" + patente + "]";
	}


	
}
