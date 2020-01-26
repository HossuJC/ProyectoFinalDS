package clases;

import java.util.ArrayList;

public class Cliente extends Persona{
	String cargo;
	int hijos;
	ArrayList<Casa> casas;

	public Cliente(String nombre, String apellidos, String cedula, String pasaporte, String correo, String direccion,
			String empresa, String telefono, String civil, String cargo, int hijos) {
		super(nombre, apellidos, cedula, pasaporte, correo, direccion, empresa, telefono, civil);
		// TODO Auto-generated constructor stub
		this.hijos=hijos;
		this.cargo = cargo;
		
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getHijos() {
		return hijos;
	}

	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	
	ArrayList<Casa> getCasas(){
		return casas;
	}

}
