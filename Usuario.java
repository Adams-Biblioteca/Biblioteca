package miBiblioteca;

public class Usuario {
	private String nombre;
	private String NIF;
	private String numSocio;

	public Usuario(String nombre,String NIF,String numSocio) {
		this.nombre=nombre;
		this.NIF=NIF;
		this.numSocio=numSocio;
	}
	
	public String toString(){
		return("Nombre: "+getNombre()+", NIF: "+getNIF()+", Nº Socio: "+getNumSocio());
	}

	public String getNombre(){
		return nombre;
	}

	public void setNombre(String nombre){
		this.nombre=nombre;
	}

	public String getNIF(){
		return NIF;
	}

	public void setNIF(String NIF){
		this.NIF=NIF;
	}

	public String getNumSocio(){
		return numSocio;
	}
	public Boolean getDato(Usuario o){
		if(o.getNIF().equals(getNIF())){
			return(true);
		}
		if(o.getNumSocio().equals(getNumSocio())){
			return(true);
		}
		return(false);
	}
}