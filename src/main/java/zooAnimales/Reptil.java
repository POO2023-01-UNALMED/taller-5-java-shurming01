package zooAnimales;

public class Reptil extends Animal {
	
	private Reptil[] listado;
	public int iguanas;
	public int serpeintes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(int totalAnimales, String nombre, int edad, String habitat, String genero, Zona[] zona,
			Reptil[] listado, int iguanas, int serpeintes, String colorEscamas, int largoCola) {
		super(totalAnimales, nombre, edad, habitat, genero, zona);
		this.listado = listado;
		this.iguanas = iguanas;
		this.serpeintes = serpeintes;
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
	}
	
	public Reptil() {
		
	}
	
	
}
