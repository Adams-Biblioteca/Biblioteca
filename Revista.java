package miBiblioteca;

import java.util.Date;

public class Revista extends Documento{
	private String ISSN;

	public Revista(String ISSN,String refBibliografica,String titulo,Date fechaPublicacion){
		super(refBibliografica,titulo,fechaPublicacion);
		this.ISSN=ISSN;
	}

	public Boolean getDato(Revista o){
		if(o.getISSN().equals(getISSN())){
			return(true);
		}
		if(o.getRefBibliografica().equals(getRefBibliografica())){
			return(true);
		}
		return(false);
	}
	
	public String toString(){
		return("Ref. "+getRefBibliografica()+", Título: "+getTitulo()+", F. Public"+getFechaPublicacion()+"\nISSN: "+getISSN()+", Desc. "+getDescripcion());
	}	

	public String getISSN(){
		return ISSN;
	}

	public void setISSN(String ISSN){
		this.ISSN=ISSN;
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
}
