package clases;

public abstract class CasaBuilder {
Casa casa;



public abstract void definirCasa();
public abstract void crearInterior();
public abstract void crearExterior();
public abstract void crearPatio();

Casa getCasa(){
	return casa;
}
}
