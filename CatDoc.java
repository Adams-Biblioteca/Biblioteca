package miBiblioteca;

public class CatDoc {
		private String nombre;
		private Integer contador=0;
		private String etiqueta;
		private final Integer nLetras=3;
		
		public CatDoc(String nombre,String etiqueta){
			this.nombre = nombre;
			this.etiqueta = etiqueta.trim().substring(0, nLetras).toUpperCase();
		}
		
		public Boolean getDato(CatDoc o){
			if(o.getNombre().equals(getNombre())){
				return(true);
			}
			if(o.getEtiqueta().equals(getEtiqueta())){
				return(true);
			}
			return(false);
		}

		public String getNombre(){
			return nombre;
		}

		public void setNombre(String nombre){
			this.nombre=nombre;
		}

		public Integer getContador(){
			return contador;
		}

		public String getEtiqueta(){
			return etiqueta;
		}

		public void setEtiqueta(String etiqueta){
			this.etiqueta=etiqueta.trim().substring(0, nLetras).toUpperCase();
		}
	}
