package org.ejemplo.modelo;

import java.util.Date;

public class Empleado {
	
	private int id;
	private String nombre;
	private String apepat;
	private String apemat;
	private Date fecha;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApepat() {
		return apepat;
	}
	public void setApepat(String apepat) {
		this.apepat = apepat;
	}
	public String getApemat() {
		return apemat;
	}
	public void setApemat(String apemat) {
		this.apemat = apemat;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
	public static void main(String[] args) {
		Empleado empleado = new Empleado();
		empleado.setId(10);
	
		System.out.println("GitHub: Repository");
	}

}
