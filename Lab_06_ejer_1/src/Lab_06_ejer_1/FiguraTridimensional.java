package Lab_06_ejer_1;

public abstract class FiguraTridimensional extends Figura{
	
	abstract public void area();
	abstract public void Volumen();
	
	public FiguraTridimensional(double altura, String descripcion) {
		super(altura, descripcion);
	}
	

}
