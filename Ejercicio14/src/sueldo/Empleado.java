package sueldo;

public class Empleado {
	
	
	private String nombre;
	private String apellido;
	private String cuil;
	private String estado;
	private double sueldo;
	private double cantidadHorasTrabajadas;
	private tipoCobro tipoCobro;
	
	public Empleado(String nombre, String apellido, String cuil, String estado, double sueldo,
			double cantidadHorasTrabajadas, tipoCobro tipoCobro) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cuil = cuil;
		this.estado = estado;
		this.sueldo = sueldo;
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
		this.tipoCobro = tipoCobro;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCuil() {
		return cuil;
	}
	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	public double getCantidadHorasTrabajadas() {
		return cantidadHorasTrabajadas;
	}
	public void setCantidadHorasTrabajadas(double cantidadHorasTrabajadas) {
		this.cantidadHorasTrabajadas = cantidadHorasTrabajadas;
	}
	public tipoCobro getTipoCobro() {
		return tipoCobro;
	}
	public void setTipoCobro(tipoCobro tipoCobro) {
		this.tipoCobro = tipoCobro;
	}


}
