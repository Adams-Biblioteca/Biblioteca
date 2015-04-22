package miBiblioteca;

import java.util.*;

public class Gestor {
	ArrayList<Object> elementos;

	public Gestor() {
		this.elementos=new ArrayList<Object>();
	}
	
	public Boolean nuevo(Object o){
		return(this.elementos.add(o));
	}
	
	public Boolean borrar(Object o){
		return(this.elementos.remove(o));
	}
	
	public void listar(){
		for(Object tmp: elementos){
			tmp.toString();
		}
	}
	
//	public Object buscar(Object o){
//		Integer i=elementos.indexOf(o);
//		if (i>=0){
//			return(elementos.get(i));
//		}
//		return(null);
//	}
	
	public String toString(){
		return(elementos.toString());
	}
	
	public Integer size(){
		return(elementos.size());
	}
	
	public Object get(Integer i){
		return(elementos.get(i));
	}
}
