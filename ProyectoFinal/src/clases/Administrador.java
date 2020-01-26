package clases;

public class Administrador extends Empleado{
	boolean activo;

	public Administrador(String nombre, String apellidos, String cedula, String pasaporte, String correo,
			String direccion, String empresa, String telefono, String civil, String cargo, boolean activo) {
		super(nombre, apellidos, cedula, pasaporte, correo, direccion, empresa, telefono, civil, cargo);
		// TODO Auto-generated constructor stub
		this.activo=activo;
	}
	
 void registrarCliente() {
	 
 }
 
 void InicioSesion() {
	 
 }

}
