package ejercicio1;

public class Auto {
	String patente;
	EMarca marca;
	String modelo;
	Number precio;
	
	public Auto() {
		
	}

	public Auto(String patente, EMarca marca, String modelo, Number precio) {
		
		this.patente = patente;
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public EMarca getMarca() {
		return marca;
	}

	public void setMarca(EMarca marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Number getPrecio() {
		return precio;
	}

	public void setPrecio(Number precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((marca == null) ? 0 : marca.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((patente == null) ? 0 : patente.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Auto other = (Auto) obj;
		if (marca != other.marca)
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (patente == null) {
			if (other.patente != null)
				return false;
		} else if (!patente.equals(other.patente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Auto [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
	
	
}
