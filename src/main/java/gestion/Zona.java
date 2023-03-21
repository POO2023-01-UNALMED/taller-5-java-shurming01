package gestion;


public class Zona {
	
	private String nombre;
	private Zoologico[] zoo = new Zoologico[1];
	private Animal[] animales;
	
	public Zona(String nombre, Zoologico[] zoo, Animal[] animales) {
		super();
		this.nombre = nombre;
		this.zoo = zoo;
		this.animales = animales;
	}
	
	public Zona() {
		
	}
	
	
}
