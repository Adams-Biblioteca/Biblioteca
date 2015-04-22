package miBiblioteca;

import java.util.*;

abstract class Documento {
	private String refBibliografica;
	private String titulo;
	private Date fechaPublicacion;
	private String Descripcion="";

	public Documento(String refBibliografica,String titulo,Date fechaPublicacion) {
		this.refBibliografica=refBibliografica;
		this.titulo=titulo;
		this.fechaPublicacion=fechaPublicacion;
	}

	public String toString(){
		return("Ref. "+getRefBibliografica()+", Título: "+getTitulo()+", F. Public"+getFechaPublicacion()+"\n Desc. "+getDescripcion());
	}
	
	public Boolean getDato(Documento o){
		if(o.getRefBibliografica().equals(getRefBibliografica())){
			return(true);
		}
		return(false);
	}
	
	public String getRefBibliografica(){
		return refBibliografica;
	}

	public void setRefBibliografica(String refBibliografica){
		this.refBibliografica=refBibliografica;
	}

	public String getTitulo(){
		return titulo;
	}

	public void setTitulo(String titulo){
		this.titulo=titulo;
	}

	public Date getFechaPublicacion(){
		return fechaPublicacion;
	}

	public void setFechaPublicacion(Date fechaPublicacion){
		this.fechaPublicacion=fechaPublicacion;
	}

	public String getDescripcion(){
		return Descripcion;
	}

	public void setDescripcion(String Descripcion){
		this.Descripcion=Descripcion;
	}
}