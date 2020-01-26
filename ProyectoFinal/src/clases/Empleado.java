package clases;

public class Empleado extends Persona{
	String cargo;

	public Empleado(String nombre, String apellidos, String cedula, String pasaporte, String correo, String direccion,
			String empresa, String telefono, String civil, String cargo) {
		super(nombre, apellidos, cedula, pasaporte, correo, direccion, empresa, telefono, civil);
		// TODO Auto-generated constructor stub
		this.cargo=cargo;
	}
	
	

}
