package miBiblioteca;

import static miBiblioteca.Menu.*;
import static miBiblioteca.Util.*;

public class MiBiblioteca{
	static Biblioteca miBiblio;
	public static void main(String[] args){
		ActTeclado();
		miBiblio=new Biblioteca("General");
		Character opc_menu;
		do{
			menuPrincipal(miBiblio);
			opc_menu=intrDatChar();
			opc_menu=opcionMenuPrin(opc_menu,miBiblio);
		}while(opc_menu!='0');
		getTeclado().close();
		hasta_luego();
	}
}