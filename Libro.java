package miBiblioteca;

import java.util.Date;

public class Libro extends Documento{
	private String ISBN;
	private String autor;

	public Libro(String ISBN,String autor,String refBibliografica,String titulo,Date fechaPublicacion) {
		super(refBibliografica,titulo,fechaPublicacion);
		this.ISBN=ISBN;
		this.autor=autor;
	}

	public Boolean getDato(Libro o){
		if(o.getISBN().equals(getISBN())){
			return(true);
		}
		if(o.getRefBibliografica().equals(getRefBibliografica())){
			return(true);
		}
		return(false);
	}
	
	public String toString(){
		return("Ref. "+getRefBibliografica()+", Título: "+getTitulo()+", F. Public"+getFechaPublicacion()+"\nAutor: "+getAutor()+", ISBN: "+getISBN()+"\n Desc. "+getDescripcion());
	}
	
	public String getISBN(){
		return ISBN;
	}

	public void setISBN(String ISBN){
		this.ISBN=ISBN;
	}

	public String getAutor(){
		return autor;
	}

	public void setAutor(String autor){
		this.autor=autor;
	}

	public String getRefBibliografica() {
		return super.getRefBibliografica();
	}

	public String getTitulo() {
		return super.getTitulo();
	}

	public Date getFechaPublicacion() {
		return super.getFechaPublicacion();
	}

	public String getDescripcion() {
		return super.getDescripcion();
	}
}
