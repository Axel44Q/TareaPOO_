package SuperH;

public class Superheroes {
	private String nombre;
	private String descripcion;
	private boolean capa;
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}
	public Superheroes(String nombre, String descripcion, boolean capa) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.capa = capa;
	}

	public Superheroes(String nombre) {
			
		this.nombre = nombre;
		this.descripcion = "";
		this.capa = false;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isCapa() {
		return capa;
	}

	public void setCapa(boolean capa) {
		this.capa = capa;
	}
	public String toString() {
		String devolver;
		devolver = (nombre +" " +descripcion+" "+capa);
		return devolver;
	}
	
	
	

}
