package clases;

public class Casa implements I_Casa{
	
	int metrosc, numplantas, numba�os, numhab;
	String orientacion, tam_patio, id;
	boolean esquinera;
	public Casa(int metrosc, int numplantas, int numba�os, int numhab, String orientacion, String tam_patio,
			boolean esquinera, String id) {
		super();
		this.metrosc = metrosc;
		this.numplantas = numplantas;
		this.numba�os = numba�os;
		this.numhab = numhab;
		this.orientacion = orientacion;
		this.tam_patio = tam_patio;
		this.esquinera = esquinera;
		this.id=id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getMetrosc() {
		return metrosc;
	}
	public void setMetrosc(int metrosc) {
		this.metrosc = metrosc;
	}
	public int getNumplantas() {
		return numplantas;
	}
	public void setNumplantas(int numplantas) {
		this.numplantas = numplantas;
	}
	public int getNumba�os() {
		return numba�os;
	}
	public void setNumba�os(int numba�os) {
		this.numba�os = numba�os;
	}
	public int getNumhab() {
		return numhab;
	}
	public void setNumhab(int numhab) {
		this.numhab = numhab;
	}
	public String getOrientacion() {
		return orientacion;
	}
	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}
	public String getTam_patio() {
		return tam_patio;
	}
	public void setTam_patio(String tam_patio) {
		this.tam_patio = tam_patio;
	}
	public boolean isEsquinera() {
		return esquinera;
	}
	public void setEsquinera(boolean esquinera) {
		this.esquinera = esquinera;
	}
	@Override
	public void agregarAcabado() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	

}
