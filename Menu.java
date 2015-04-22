package miBiblioteca;

import static miBiblioteca.Util.*;
// Menu es el texto, el opcion es el switch

public class Menu{
	public static void menuPrincipal(Biblioteca bi){
		System.out.println("Gestion de Bibliotecas\n");
		System.out.println("\t\tMENU del la Biblioteca "+bi.getNombre()+"\n");
		System.out.println("Selecciona la opci�n del men� que desea realizar:\n");
		System.out.println("1.- (U)suarios");
		System.out.println("2.- (D)ocumentos");
		System.out.println("3.- (C)ategor�as");
		System.out.println("4.- (T)iempos");
		System.out.println("5.- (P)r�stamos");
		System.out.println("6.- (R)eservas");
		System.out.println("\n0.- (S)alir");
		System.out.print("Opcion elegida: ");
	}
	public static Character opcionMenuPrin(char opc_elegida,Biblioteca bi){
		switch (opc_elegida){
			case '1':
			case 'U':{
				Character opc_menu;
				do{
					menuUsus(bi);
					opc_menu=intrDatChar();
					opc_menu=opcionMenuUsus(opc_menu,bi);
				}while(opc_menu!='0');
				break;
			}
			case '2':
			case 'D':{
				Character opc_menu;
				do{
					menuDocs(bi);
					opc_menu=intrDatChar();
					opc_menu=opcionMenuDocs(opc_menu,bi);
				}while(opc_menu!='0');
				break;
			}
			case '3':
			case 'C':{
				Character opc_menu;
				do{
					menuCats(bi);
					opc_menu=intrDatChar();
					opc_menu=opcionMenuCats(opc_menu,bi);
				}while(opc_menu!='0');
				break;
			}
			case '4':
			case 'T':{
				Character opc_menu;
				do{
					menuTimes(bi);
					opc_menu=intrDatChar();
					opc_menu=opcionMenuTimes(opc_menu,bi);
				}while(opc_menu!='0');
				break;
			}
			case '5':
			case 'P':{
				Character opc_menu;
				do{
					menuPres(bi);
					opc_menu=intrDatChar();
					opc_menu=opcionMenuPres(opc_menu,bi);
				}while(opc_menu!='0');
				break;
			}
			case '6':
			case 'R':{
				Character opc_menu;
				do{
					menuReser(bi);
					opc_menu=intrDatChar();
					opc_menu=opcionMenuReser(opc_menu,bi);
				}while(opc_menu!='0');
				break;
			}
			case '0':
			case 'S':{
				opc_elegida='0'; //con el cero sale del menu.
				break;
			}
			default:{
				mensaje("La opci�n introducida no es valida.");
			}
		}
		limpiar_pantalla();
		return (opc_elegida);
	}
	
	public static void menuUsus(Biblioteca bi){
		System.out.println("Gestion de Bibliotecas\n");
		System.out.println("\t\tMEN� del la Biblioteca "+bi.getNombre()+"\n");
		System.out.println("- MEN� DE USUARIOS -");
		System.out.println("Selecciona la opci�n del men� que desea realizar:\n");
		System.out.println("1.- (A)lta de nuevo usuario");
		System.out.println("2.- (M)odificar datos de un usuario");
		System.out.println("3.- (D)ar de baja un usuario");
		System.out.println("4.- (L)istado de usarios");
		System.out.println("5.- (B)�squeda de un usuario");
		System.out.println("\n0.- (S)alir");
		System.out.print("Opcion elegida: ");
	}
	
	public static Character opcionMenuUsus(Character opc_elegida,Biblioteca bi){
		return('0');
	}
	
	public static void menuDocs(Biblioteca bi){
		System.out.println("Gestion de Bibliotecas\n");
		System.out.println("\t\tMEN� del la Biblioteca "+bi.getNombre()+"\n");
		System.out.println("- MEN� DE DOCUMENTOS -");
		System.out.println("Selecciona la opci�n del men� que desea realizar:\n");
		System.out.println("1.- (A)lta de nuevo documento");
		System.out.println("2.- (M)odificar datos de un documento");
		System.out.println("3.- (D)ar de baja un documento");
		System.out.println("4.- (L)istado de documentos");
		System.out.println("5.- (B)�squeda de un documento");
		System.out.println("\n0.- (S)alir");
		System.out.print("Opcion elegida: ");
	}
	
	public static Character opcionMenuDocs(Character opc_elegida,Biblioteca bi){
		return('0');
	}
	public static void menuCats(Biblioteca bi){
		System.out.println("Gestion de Bibliotecas\n");
		System.out.println("\t\tMEN� del la Biblioteca "+bi.getNombre()+"\n");
		System.out.println("- MEN� DE CATEGOR�AS DE CLASIFICACI�N -");
		System.out.println("Selecciona la opci�n del men� que desea realizar:\n");
		System.out.println("1.- (A)lta de nueva categor�a");
		System.out.println("2.- (M)odificar datos de una categor�a");
		System.out.println("3.- (D)ar de baja una categor�a");
		System.out.println("4.- (L)istado de categor�as");
		System.out.println("5.- (B)�squeda de una categor�a");
		System.out.println("\n0.- (S)alir");
		System.out.print("Opcion elegida: ");
	}
	
	public static Character opcionMenuCats(Character opc_elegida,Biblioteca bi){
		return('0');
	}
	public static void menuTimes(Biblioteca bi){
		System.out.println("Gestion de Bibliotecas\n");
		System.out.println("\t\tMEN� del la Biblioteca "+bi.getNombre()+"\n");
		System.out.println("- MEN� DE TIEMPOS DE PR�STAMO Y RENOVACI�N -");
		System.out.println("Selecciona la opci�n del men� que desea realizar:\n");
		System.out.println("1.- (M)odificar tiempos de pr�stamo y renovaci�n");
		System.out.println("2.- (L)istado de tiempos de pr�stamo y renovaci�n");
		System.out.println("\n0.- (S)alir");
		System.out.print("Opcion elegida: ");
	}
	
	public static Character opcionMenuTimes(Character opc_elegida,Biblioteca bi){
		return('0');
	}
	public static void menuPres(Biblioteca bi){
		System.out.println("Gestion de Bibliotecas\n");
		System.out.println("\t\tMEN� del la Biblioteca "+bi.getNombre()+"\n");
		System.out.println("- MEN� DE PR�STAMOS -");
		System.out.println("Selecciona la opci�n del men� que desea realizar:\n");
		System.out.println("1.- (P)restar un documento");
		System.out.println("2.- (R)enovar el pr�stamo de un documento");
		System.out.println("3.- (L)istado de pr�stamos activos");
		System.out.println("4.- (H)ist�rico de prestamos cerrados");
		System.out.println("5.- (B)�squeda de un pr�stamo");
		System.out.println("\n0.- (S)alir");
		System.out.print("Opcion elegida: ");
	}
	
	public static Character opcionMenuPres(Character opc_elegida,Biblioteca bi){
		return('0');
	}
	public static void menuReser(Biblioteca bi){
		System.out.println("Gestion de Bibliotecas\n");
		System.out.println("\t\tMEN� del la Biblioteca "+bi.getNombre()+"\n");
		System.out.println("- MEN� DE RESERVAS -");
		System.out.println("Selecciona la opci�n del men� que desea realizar:\n");
		System.out.println("1.- (R)eservar un documento");
		System.out.println("3.- (L)istado de reservas activos");
		System.out.println("4.- (H)ist�rico de reservas cerradas");
		System.out.println("5.- (B)�squeda de una reserva");
		System.out.println("\n0.- (S)alir");
		System.out.print("Opcion elegida: ");
	}
	
	public static Character opcionMenuReser(Character opc_elegida,Biblioteca bi){
		return('0');
	}
}