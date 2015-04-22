package miBiblioteca;

import java.util.*;

public class Periodico extends Documento{
	
	public Periodico(String refBibliografica,String titulo,Date fechaPublicacion){
		super(refBibliografica,titulo,fechaPublicacion);
	}

	
	public Boolean getDato(Periodico o){
		if(o.getRefBibliografica().equals(getRefBibliografica())){
			return(true);
		}
		if(o.getFechaPublicacion().equals(getFechaPublicacion())){
			return(true);
		}
		return(false);
	}

	public Date getFechaPublicacion(){
		return super.getFechaPublicacion();
	}

	public String getRefBibliografica(){
		return super.getRefBibliografica();
	}

	public void setDescripcion(String Descripcion){
		super.setDescripcion(Descripcion);
	}

	public String getTitulo(){
		return super.getTitulo();
	}

	public void setFechaPublicacion(Date fechaPublicacion){
		super.setFechaPublicacion(fechaPublicacion);
	}

	public void setRefBibliografica(String refBibliografica){
		super.setRefBibliografica(refBibliografica);
	}

	public void setTitulo(String titulo){
		super.setTitulo(titulo);
	}

	public String toString(){
		return super.toString();
	}
}
