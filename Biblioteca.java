/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miBiblioteca;

import static miBiblioteca.Util.*;

public class Biblioteca{
	private Gestor usuarios;
	private Gestor documentos;
	private Gestor tipos;
	private Gestor prestamos;
	private Gestor reservas;
	private String nombre;
	private Integer nSocio;

	public Biblioteca(String nombre){
		this.usuarios=null;
		this.documentos=null;
		this.tipos=null;
		this.prestamos=null;
		this.reservas=null;
		this.nombre=nombre;
	}
	
	public void modDat(){
		String nombre=intrDatStr("Introducir nombre: ");
		String eti=intrDatStr("Introduce 3 caraceres para la entiquta: ");
		CatDoc ti1=new CatDoc(nombre,eti);
		if(getTipos()==null){
			setTipos(new Gestor());
		}
		getTipos().nuevo(ti1);
		CatDoc ti2=new CatDoc(nombre,eti);
		for(int x=0;x<getTipos().size();x++){
			CatDoc td=(CatDoc)getTipos().get(x);
			if(td.getDato(ti2)){
				System.out.println("Este Tipo de documento ya existe");
				break;
			}else{
				getTipos().nuevo(ti2);
			}
		}
	}
	
	public void visDat(){
		
	}

	public Gestor getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(Gestor usuarios) {
		this.usuarios=usuarios;
	}


	public Gestor getDocumentos() {
		return documentos;
	}


	public void setDocumentos(Gestor documentos) {
		this.documentos=documentos;
	}


	public Gestor getTipos() {
		return tipos;
	}


	public void setTipos(Gestor tipos) {
		this.tipos=tipos;
	}


	public Gestor getPrestamos() {
		return prestamos;
	}


	public void setPrestamos(Gestor prestamos) {
		this.prestamos=prestamos;
	}


	public Gestor getReservas() {
		return reservas;
	}


	public void setReservas(Gestor reservas) {
		this.reservas=reservas;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre=nombre;
	}

	public Integer getnSocio() {
		return nSocio;
	}

	public void setnSocio(Integer nSocio) {
		this.nSocio=nSocio;
	}
}
