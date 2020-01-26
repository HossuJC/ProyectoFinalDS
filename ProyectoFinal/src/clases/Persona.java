package clases;

public class Persona {
	protected String nombre, apellidos, cedula, pasaporte, correo, direccion, empresa, telefono, civil;

	public Persona(String nombre, String apellidos, String cedula, String pasaporte, String correo, String direccion,
			String empresa, String telefono, String civil) {
		
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.pasaporte = pasaporte;
		this.correo = correo;
		this.direccion = direccion;
		this.empresa = empresa;
		this.telefono = telefono;
		this.civil = civil;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(String pasaporte) {
		this.pasaporte = pasaporte;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCivil() {
		return civil;
	}

	public void setCivil(String civil) {
		this.civil = civil;
	}
	
	
	

}
