package clases;

public class Casa {
	
	int metrosc, numplantas, numbaños, numhab;
	String orientacion, tam_patio;
	boolean esquinera;
	public Casa(int metrosc, int numplantas, int numbaños, int numhab, String orientacion, String tam_patio,
			boolean esquinera) {
		super();
		this.metrosc = metrosc;
		this.numplantas = numplantas;
		this.numbaños = numbaños;
		this.numhab = numhab;
		this.orientacion = orientacion;
		this.tam_patio = tam_patio;
		this.esquinera = esquinera;
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
	public int getNumbaños() {
		return numbaños;
	}
	public void setNumbaños(int numbaños) {
		this.numbaños = numbaños;
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
	
	
	
	

}
