	package Coleccines;
	
	import java.util.ArrayList;
	
	import Figuras.Figura;
	
	public class Coleccion {
		private String nombreColeccion;
		private ArrayList<Figura> listaFiguras;
		
		public Coleccion(String nombreColeccion, Figura[] listaFiguras) {
			
			this.nombreColeccion = nombreColeccion;
			this.listaFiguras = new ArrayList<>();
		}
		public String getNombreColeccion() {
			return nombreColeccion;
		}
	
		public void setNombreColeccion(String nombreColeccion) {
			this.nombreColeccion = nombreColeccion;
		}
		public void añadirFigura(Figura fig) {
			listaFiguras.add(fig);
			
		}
		public double subirPrecio(double cantidad, String id) {
			int precioactual = 100;
			cantidad += precioactual;
			return precioactual;
		}
	
		 public String toString() {
		        StringBuilder sb = new StringBuilder("Colección: " + nombreColeccion + "c/u");
		        for (Figura f : listaFiguras) {
		            sb.append(f.toString()).append("c/u");
		        }
		        return sb.toString();
		    }
		 public String conCapa() {
			    StringBuilder sb = new StringBuilder("Figuras con capa:\n");
			    for (Figura f : listaFiguras) {
			    	if (f.isCapa()) {  // 
			            sb.append(f.toString()).append("\n");
			        }
			    }
			    return sb.toString();
			}
		 public Figura MasValioso() {
			 Figura figuraMasCara = listaFiguras.get(0); 

			    for (Figura f : listaFiguras) {
			        if (f.getPrecio() > figuraMasCara.getPrecio()) {
			            figuraMasCara = f; // 
			        }
			    }

			    return figuraMasCara;		 
		 }
		 public double getValorColeccion () {
			 double total = 0;
			    for (Figura f : listaFiguras) {
			        total += f.getPrecio();
			    }	
			    return total;
			}
		 public double getVolumenColeccion() {
			    double volumenTotal = 0;
			    for (Figura f : listaFiguras) {
			        volumenTotal += f.getDimension().getVolumen(); 
			    }
			    volumenTotal += 200;
			    return volumenTotal;
			}
	}
